
public class Son extends Thread{
    private bankAccount ba;
    public Son (bankAccount ba1){
        ba=ba1;
    }
    public void run(){
        ba.withdraw(500);
        System.out.println("son balance:"+ba.getBalance());
    }
}
