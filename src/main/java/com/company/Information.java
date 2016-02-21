package com.company;

import java.util.HashSet;

public class Information {
    private HashSet<Contact> contacts;// = new HashSet<Contact>();
    private String information;

    public Information(String info) {
        this.contacts = new HashSet<Contact>();
        this.information = info;
    }

    public Information() {}

    public HashSet<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(HashSet<Contact> contacts){
        this.contacts = contacts;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public HashSet<Contact> addContact(Contact a) {
        this.contacts.add(a);
        return this.contacts;
    }

    public void printAllInformation() {
        System.out.println(information);
        for(Contact x : this.contacts) {
            StringBuffer str1 = new StringBuffer();
            x.printAllInformation();
        }
    }
}
