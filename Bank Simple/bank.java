package com.company;

public class bank {

    private String name;
    private int acc_number;
    private float balance;
    private String email;
    private String phone;

    public void setName(String x){
        this.name = x;
    }
    public String getName(){
        return this.name;
    }
    public void setAcc_number(int x){
        this.acc_number = x;
    }
    public int getAcc_number(){
        return this.acc_number;
    }
    public void setBalance(float x){
        this.balance = x;
    }
    public float getBalance(){
        return this.balance;
    }
    public void setEmail(String x){
        this.email = x;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhone(String x){
        this.phone = x;
    }
    public String getPhone(){
        return this.phone;
    }

    public void deposit(float x){
        this.balance = this.balance + x;
    }
    public boolean withdraw(float x) {
        if (this.balance >= x) {
            this.balance = this.balance - x;
            return true;
        }
        else{
            return false;
        }
    }
}
