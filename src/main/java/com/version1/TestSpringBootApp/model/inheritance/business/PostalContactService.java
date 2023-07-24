package com.version1.TestSpringBootApp.model.inheritance.business;

public class PostalContactService extends ContactService{
    @Override
    public void contactCustomer() {
        // get their home address out the db
        // validate it's in the uk
        // call a service to get the letter content
        // send a message to the mail team to send letter
        System.out.println("We have sent a letter to the customer");
    }
}
