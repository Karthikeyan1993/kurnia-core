package com.kgfsl.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Proposer extends Individual {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PROPOSER_ID")
    private Long id;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE_OFF")
    private String phoneOffice;
    @Column(name = "PHONE_MOB")
    private String phoneMobile;
    @Column(name = "PHONE_HOME")
    private String phoneHome;
    @Column(name = "STATE")
    private String state;
    @Column(name = "POSTCODE")
    private String postcode;
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "GST_COMMENCE_DATE")
    private String gstCommenceDate;
    @Column(name = "GST_REG_NUMBER")
    private String gstRegNumber;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "PROPOSER_ID")
    private List <Children> childrenList;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "PROPOSER_ID")
    private Spouse spouse;

    public Long getId( ) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress( ) {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail( ) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneOffice( ) {
        return phoneOffice;
    }

    public void setPhoneOffice(String phoneOffice) {
        this.phoneOffice = phoneOffice;
    }

    public String getPhoneMobile( ) {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    public String getPhoneHome( ) {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    public String getState( ) {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode( ) {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getNationality( ) {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGstCommenceDate( ) {
        return gstCommenceDate;
    }

    public void setGstCommenceDate(String gstCommenceDate) {
        this.gstCommenceDate = gstCommenceDate;
    }

    public String getGstRegNumber( ) {
        return gstRegNumber;
    }

    public void setGstRegNumber(String gstRegNumber) {
        this.gstRegNumber = gstRegNumber;
    }

    public List <Children> getChildrenList( ) {
        return childrenList;
    }

    public void setChildrenList(List <Children> childrenList) {
        this.childrenList = childrenList;
    }

    public Spouse getSpouse( ) {
        return spouse;
    }

    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
        spouse.setProposer(this);
    }
}
