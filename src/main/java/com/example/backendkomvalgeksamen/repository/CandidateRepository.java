package com.example.backendkomvalgeksamen.repository;

import com.example.backendkomvalgeksamen.model.Candidate;
import com.example.backendkomvalgeksamen.model.PoliticalParty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

    List<Candidate> findAllBypoliticalParty(PoliticalParty politicalParty);
/*
    Candidate findByCandidateId(int candidateId);
    List<Candidate> findByPoliticalParty(int partyId);

*/
}