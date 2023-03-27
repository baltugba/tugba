public class swap {
    public static void main(String[] args) {
         int a = 10,
                 b = 20,
                 c= a;
        // c = a; // c = 10
        a = b; // a = 20
        b = c; // b == 10

        System.out.println(" a =" + a);
        System.out.println("b = " + b);
        System.out.println(".......................");



        int s = 100,
                d = 200,
                h = s;
      //  h = s;
        s = d;
        d = h;

        System.out.println( "s =" + s);
        System.out.println(" d =" + d);

        System.out.println("..........................");

        int t =20;
        int f = 25;
        int e = t;

        t = f;
        f = e;

        System.out.println("t =" + t);
        System.out.println(" f =" + f);
        System.out.println(".........................");

        int w = 40;
        int m = 70;
        int p = w;

        w = m;
        m = p;

        System.out.println("w= "+ w);
        System.out.println(" m =" + m);
        System.out.println(".....................");
         int k = 150;
         int g =200;
         int j = k;
         k=g;
         g = j;
        System.out.println( "k="+ k);
        System.out.println(" g =" + g);

        System.out.println("..................");

        int o = 15;
        int r = 20;
        o += r;
        r = o-r;
        o -=r;

        System.out.println("o =" + o);
        System.out.println("r =" + r);

    }
}
