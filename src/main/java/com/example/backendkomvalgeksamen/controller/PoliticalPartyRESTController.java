package com.example.backendkomvalgeksamen.controller;

import com.example.backendkomvalgeksamen.model.Candidate;
import com.example.backendkomvalgeksamen.model.PoliticalParty;
import com.example.backendkomvalgeksamen.repository.PoliticalPartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class PoliticalPartyRESTController {

    @Autowired
    PoliticalPartyRepository politicalPartyRepository;

    /* ----- Get liste -----*/

    //Hent alle partier
    @GetMapping("/politicalParty")
    public List<PoliticalParty> allPoliticalParties(){return politicalPartyRepository.findAll();
    }

    /*
    @GetMapping ("/politicalParty/{id}")
    public PoliticalParty getPoliticalPartyById(@PathVariable int id){
        Optional<PoliticalParty> obj = politicalPartyRepository.findById(id);
        if (obj.isPresent()) {
            return obj.get();
        }
        PoliticalParty politicalParty = new PoliticalParty();
        politicalParty.setPartyName("Not Found");
        return politicalParty;
    }

    / ----- Post liste -----

    @PostMapping(value="/politicalParty", consumes = "application/json")
    public ResponseEntity<PoliticalParty> newPoliticalParty(@RequestBody PoliticalParty politicalParty) {
        politicalPartyRepository.save(politicalParty);
        return new ResponseEntity<PoliticalParty>(politicalParty, HttpStatus.CREATED);
    }


    // ----- Put -----

    @PutMapping("/politicalParty/{politicalParty_id}")
    public ResponseEntity<PoliticalParty> updateBox(@PathVariable int politicalParty_id, @RequestBody PoliticalParty politicalParty){
        Optional<PoliticalParty> politicalPartyData = candidateRepository.findById(politicalParty_id);
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

    // ----- Delete -----

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
*/
}
