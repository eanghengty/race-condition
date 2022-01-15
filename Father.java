
public class Father extends Thread{
    private bankAccount ba;
    public Father (bankAccount ba1){
        ba=ba1;
    }
    public void run(){
        ba.deposit(2000);
        System.out.println("father balance: " +ba.getBalance());
    }
}
