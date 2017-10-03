package com.kgfsl.entity;

import javax.persistence.*;

@Entity
public class Children extends Individual {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CHILD_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROPOSER_ID")
    private Proposer proposer;

    public Long getId( ) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProposer(Proposer proposer) {
        this.proposer = proposer;
    }
}
