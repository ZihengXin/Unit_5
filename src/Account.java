//2020.2.7 Charly. This program should be able to pass the Account Test.
public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account (String first,String last,double balance){
        acctNum = (int)(Math.random()*999+1);
        this.first = first;
        this.last = last;
        this.balance = balance;
    }
    public Account (Account second){
      first = second.getFirst();
      last = second. getLast();
      balance = second. getBalance();
        acctNum = (int)(Math.random()*999+1);
    }
    public Account(){
        acctNum = (int)(Math.random()*999+1);
        this.first = "";
        this.last = "";
        this.balance = 0;
    }
    public void setFirst(String first){
        this.first = first;
    }
    public void setLast(String last){
        this.last = last;
    }
    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public int getAcctNum(){
        return acctNum;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double num){
        balance += num;
    }
    public boolean withdrawal(double num){
        if(balance - num >= 0) {
            balance -= num;
            return true;
        }
        else
            return false;
    }
    public String toString(){
        return "Customer Name: " + first + " " + last + "\n" + "Account #: " + acctNum + "\n" +
                "Current Balance: $" + balance;
    }
}
