package com.kgfsl.entity;

import javax.persistence.*;

@Entity
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POLICY_ID")
    private Long id;
    @Column(name = "POLICY_NAME")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    public Policy( ) {
        super();
    }

    public Policy(String name) {
        this.name = name;
    }

    public Long getId( ) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString( ) {
        return "Policy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
