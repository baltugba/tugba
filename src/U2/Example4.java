package U2;

class Alpha {
    int ns=0;
    static int s=0;
    Alpha(int ns){
        if(s < ns){
            s = ns;
            this.ns = ns;
        }
    }
    void doPrint(){
        System.out.println("ns = " + ns +" s= " + s);
    }
}
public class Example4{
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();


    }
}