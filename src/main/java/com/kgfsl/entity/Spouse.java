package com.kgfsl.entity;

import javax.persistence.*;

@Entity
public class Spouse extends Individual {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SPOUSE_ID")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "PROPOSER_ID")
    private Proposer proposer;

    public Long getId( ) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Proposer getProposer( ) {
        return proposer;
    }

    public void setProposer(Proposer proposer) {
        this.proposer = proposer;
    }
}
