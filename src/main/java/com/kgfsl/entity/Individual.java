package com.kgfsl.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Individual {

    private String name;
    private String gender;
    private String dateOfBirth;
    private String occupation;
    private int weight;
    private int height;
    private String nricNo;

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender( ) {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth( ) {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOccupation( ) {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getWeight( ) {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight( ) {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getNricNo( ) {
        return nricNo;
    }

    public void setNricNo(String nricNo) {
        this.nricNo = nricNo;
    }
}
