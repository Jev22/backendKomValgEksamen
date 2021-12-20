package com.example.backendkomvalgeksamen.controller;


import com.example.backendkomvalgeksamen.model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.backendkomvalgeksamen.repository.CandidateRepository;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(value = "*")
public class CandidateRESTController {

    @Autowired
    CandidateRepository candidateRepository;

/* ----- Get liste -----*/

    //Hent alle Candidat
    @GetMapping("/candidate")
    public List<Candidate> allBoxes(){
        return candidateRepository.findAll();
    }

    @GetMapping ("/candidate/{id}")
    public Candidate getCandidateById(@PathVariable int id){
        Optional<Candidate> obj = candidateRepository.findById(id);
        if (obj.isPresent()) {
            return obj.get();
        }
        Candidate candidate = new Candidate();
        candidate.setCandidateName("Not Found");
        return candidate;
    }

/* ----- Post liste ----- */

    @PostMapping(value="/candidate", consumes = "application/json")
    public ResponseEntity<Candidate> newCandidate(@RequestBody Candidate candidate) {
        candidateRepository.save(candidate);
        return new ResponseEntity<Candidate>(candidate, HttpStatus.CREATED);
    }


/* ----- Put ----- */

    @PutMapping("/candidate/{candidate_id}")
    public ResponseEntity<Candidate> updateBox(@PathVariable int candidate_id, @RequestBody Candidate candidate){
        Optional<Candidate> candidateData = candidateRepository.findById(candidate_id);
        if (candidateData.isPresent()) {
            Candidate _candidate = candidateData.get();
            _candidate.setCandidateName(candidate.getCandidateName());
            _candidate.setNumberOfVotes(candidate.getNumberOfVotes());
            _candidate.setPoliticalParty(candidate.getPoliticalParty());
            _candidate = candidateRepository.save(_candidate);
            return new ResponseEntity<>(_candidate, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

/* ----- Delete -----*/

    @DeleteMapping("/candidate/{id}")
    public ResponseEntity<Object> deleteCandidate(@PathVariable int id) {
        try {
            candidateRepository.deleteById(id);
        } catch (Exception err) {
            return new ResponseEntity<>("Kandidaten blev ikke fundet", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
