package com.example.backendkomvalgeksamen.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private int candidateId;

    @Column(name = "candidate_name")
    private String candidateName;


    @Column(name = "number_of_votes")
    private int numberOfVotes;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "partyId")
    private PoliticalParty politicalParty;

    public Candidate() {
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId=" + candidateId +
                ", candidateName='" + candidateName + '\'' +
                ", numberOfVotes=" + numberOfVotes +
                ", politicalParty=" + politicalParty +
                '}';
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    public PoliticalParty getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(PoliticalParty politicalParty) {
        this.politicalParty = politicalParty;
    }
}