package com.mesnu.app.builder;

public class ContactBuilder {

    private String firstName;
    private String lastName;
    private String emailAddress;
    
    // 1. each method returns object reference

    public ContactBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactBuilder setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    
    // 2. build method returns fully constructed object

    public Contact buildContact(){
        return new Contact(firstName, lastName, emailAddress);
    }
}
