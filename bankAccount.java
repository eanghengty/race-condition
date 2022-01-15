
class bankAccount{
  private double balance;
    public bankAccount(double hold){
        
            balance=hold;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
      balance += amount;
    }
    public void withdraw(double amount){
     
        balance -= amount;
      
    }
    
    public static void main(String[] args){
      
    }
}
