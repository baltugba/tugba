package U2;

public interface Test {
   void readBook();
    abstract void watchTv();


 }
 abstract class B implements Test{
    public void readBook(){
        System.out.println("Read book");
    }
 }

//public class c extends B{
 //   public void readBook(){
 //       System.out.println("watc");


