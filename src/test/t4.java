package test;

public class t4 {
    public t4(){
        this(10);
        System.out.println("A");

    }
    public t4(int a){
        System.out.println("B");
    }
    public static void main(String[] args) {
        t4 obj = new t4();

    }
}
