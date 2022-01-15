
public class Main{
    public static void main(String[] args){
        bankAccount ba = new bankAccount(0);
        Father father= new Father(ba);
        Son son = new Son(ba);
        
        
        father.start();
        
        son.start();
       
        System.out.println(ba.getBalance());
    }
}
