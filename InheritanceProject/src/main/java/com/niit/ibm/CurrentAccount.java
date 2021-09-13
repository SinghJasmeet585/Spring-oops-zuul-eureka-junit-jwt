package com.niit.ibm;

public class CurrentAccount extends Account{
    private String tinNumber;

    public CurrentAccount() {
    }

    public CurrentAccount(String accName, String accNo, String bankName , String tinNumber) {
        this.tinNumber = tinNumber;
        this.setAccName(accName);
        this.setAccNo(accNo);
        this.setBankName(bankName);
    }

    public void display(){
        super.display();
        System.out.println("Tin number = " + getTinNumber());
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public void setTinNumber(String tinNumber) {
        this.tinNumber = tinNumber;
    }
}
