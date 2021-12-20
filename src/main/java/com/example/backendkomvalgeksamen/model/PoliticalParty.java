package com.example.backendkomvalgeksamen.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class PoliticalParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int partyId;

    @Column(name ="party_name")
    private String partyName;


    @Column(name = "number_of_votes")
    private int numberOfVotes;


    @OneToMany
    @JoinColumn(name = "partyId")
    @JsonBackReference
    private Set<Candidate> candidates = new HashSet<>();

    public PoliticalParty() {
    }

    public PoliticalParty(int partyId,
                          String partyName,
                          int numberOfVotes,
                          Set<Candidate> candidates) {
        this.partyId = partyId;
        this.partyName = partyName;
        this.numberOfVotes = numberOfVotes;
        this.candidates = candidates;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    public Set<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(Set<Candidate> candidates) {
        this.candidates = candidates;
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        politicalParty that = (politicalParty) o;
        return partyId == that.partyId && numberOfVotes == that.numberOfVotes && Objects.equals(partyName, that.partyName) && Objects.equals(candidates, that.candidates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partyId, partyName, numberOfVotes, candidates);
    }
*/
    @Override
    public String toString() {
        return "politicalParty{" +
                "partyId=" + partyId +
                ", partyName='" + partyName + '\'' +
                ", numberOfVotes=" + numberOfVotes +
                ", candidates=" + candidates +
                '}';
    }


}


