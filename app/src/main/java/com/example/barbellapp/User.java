package com.example.barbellapp;

import android.widget.EditText;

public class User {
    private String firstName, lastName, email;
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
    }

    public User(EditText fName, EditText lName, EditText email) {

    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName() { this.firstName = firstName; }

    public void setLastName() {
        this.lastName = lastName;
    }

    public void setEmail() {
        this.email = email;
    }

    public String toString() {
        return "Name:" + getFirstName() + "." + getLastName() + "\tEmail:" + getEmail();
    }

}
