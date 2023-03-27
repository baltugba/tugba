package test;

public class t5 {
    int dede;
    static int nene;
    public t5(){
        this(100);
        dede = 1;
        nene =2;
        System.out.println("a");
    }
    public t5(int a){
        this("f");
        System.out.println(a);
    }
    public t5(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        t5 obj = new t5();
        nene = 1;

    }
}
