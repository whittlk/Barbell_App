package com.example.barbellapp;

import android.widget.EditText;

public class User {
    String firstName, lastName, email, admin;
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.admin = "";
    }

    public User(EditText fName, EditText lName, EditText email) {

    }

    public User(String firstName, String lastName, String email, String admin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.admin = admin;
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

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String toString() {
        return "Name:" + getFirstName() + "." + getLastName() + "\tEmail:" + getEmail();
    }

}
