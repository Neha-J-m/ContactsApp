package com.example.contact;

public class ContactModel {
    String name, gmail, phno;


    public ContactModel(String cname, String cgmail, String cphno){
        this.name=cname;
        this.gmail=cgmail;
        this.phno=cphno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

}
