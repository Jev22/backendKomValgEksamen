package com.example.backendkomvalgeksamen.repository;

import com.example.backendkomvalgeksamen.model.PoliticalParty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliticalPartyRepository extends JpaRepository<PoliticalParty, Integer> {

    /*politicalParty findBy
    List<politicalParty> findByPoliticalParty(int partyId);
    */
}
