package com.driver;

public class Main {
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount("Areeb",5000,500,4);

        System.out.println(s.getSimpleInterest(1));
        System.out.println(s.getCompoundInterest(2,1));

    }
}