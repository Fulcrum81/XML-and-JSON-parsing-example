package com.company;

public class HomePhone extends Phone {
    private String city;

    @Override
    public String getPhone() {
        StringBuffer str = new StringBuffer();
        str.append(city);
        str.append(" ");
        str.append(number);
        return str.toString();
    }
    public HomePhone(String a,String b) {
        city=a;
        number=b;
    }

    public HomePhone() {}
}
