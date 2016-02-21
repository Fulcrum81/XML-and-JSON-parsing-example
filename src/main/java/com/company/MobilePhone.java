package com.company;

public class MobilePhone extends Phone {
    private String operator;

    @Override
    public String getPhone(){
        StringBuffer str = new StringBuffer();
        str.append(operator);
        str.append(" ");
        str.append(number);
        return str.toString();
    }

    public MobilePhone(String a,String b){
        operator=a;
        number=b;
    }

    public MobilePhone() {}
}
