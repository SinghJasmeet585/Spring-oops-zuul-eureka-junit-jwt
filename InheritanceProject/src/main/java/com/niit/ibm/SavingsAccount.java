package com.niit.ibm;

public class SavingsAccount extends Account{
    private String orgName;

    public SavingsAccount() {
    }

    public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
        this.orgName = orgName;
        this.setAccName(accName);
        this.setAccNo(accNo);
        this.setBankName(bankName);
    }


    public void display(){
        super.display();
        System.out.println("Organization name = " + getOrgName());
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
