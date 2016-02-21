package com.company;

public class Contact {
    private String name;
    private String surname;
    private HomePhone hp;
    private MobilePhone mp;


    public  Contact(String a, String b) {
        name = a;
        surname = b;
    }

    public Contact() {}

    public void setHomePhone(HomePhone hp){
        this.hp = hp;
    }

    public  void setMobilePhone(MobilePhone mp){
        this.mp = mp;
    }

    public void printAllInformation() {
        StringBuffer str = new StringBuffer();
        str.append(name);
        str.append(" ");
        str.append(surname);
        str.append(" ");
        str.append(hp.getPhone());
        str.append(" ");
        str.append(mp.getPhone());
        System.out.println(str.toString());
    }
}
