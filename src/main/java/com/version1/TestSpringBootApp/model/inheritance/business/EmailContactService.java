package com.version1.TestSpringBootApp.model.inheritance.business;

public class EmailContactService extends ContactService{
    @Override
    public void contactCustomer() {
        // get email from db
        // validate email
        // checks email service is up
        //sends the email
        System.out.println("We have sent the customer an email");
    }
}
