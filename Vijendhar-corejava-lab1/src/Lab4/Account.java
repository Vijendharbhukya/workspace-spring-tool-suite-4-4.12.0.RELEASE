package Lab4;

public class Account {
       private String name;
       private double balance;
       
       public Account(String name,double balance) {
    	   this.name=name;
    	   if(balance>0.0)
    		   this.balance=balance;
       }
       public void deposite(double depositeamount) {
    	   if (depositeamount>0.0)
    		   balance=balance + depositeamount;
       }
       public double getBalance() {
    	   return balance;
       }
       public void  setName(String name) {
    	   this.name=name;
       }
       public String getName() {
    	   return name;
       }
}
