package oop.projectaccount.entities;

public class Account {
    private String accountId;
    private String agency;
    private double balance;
    private String clientName;



    public int withdraw(double withdrawValue){
        if ((withdrawValue > balance) || (balance<=0)){
            return 0;
        }else {
            balance -= withdrawValue;
            return 1;
        }
    }

    public void deposit(double depositValue){
        balance+=depositValue;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + accountId + '\'' +
                ", agency='" + agency + '\'' +
                ", balance=" + balance +
                ", clientName='" + clientName + '\'' +
                '}';
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAgency() {
        return agency;
    }

    public double getBalance() {
        return balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }
}
