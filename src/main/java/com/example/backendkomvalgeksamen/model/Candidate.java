package com.example.backendkomvalgeksamen.model;

import javax.persistence.*;

@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int candidateId;

    @Column(name ="first_name")
    private String candidateFirstName;

    @Column(name ="last_name")
    private String candidateLastName;

    @Column(name = "number_of_votes")
    private int numberOfVotes;


    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "candidateId")
    private PoliticalParty politicalParty;
}