package loop;
class scope
{
    static int z;
}
public class MyTest1
{
        int z;
        public static void main(String[] args)
        {
            MyTest1 myTest1 = new MyTest1();
            int z = 6;
            System.out.println(z);  //1st print 6
            myTest1.doStuff();
            System.out.println(z); //3rd print 6
            System.out.println(scope.z); // 4rd print 2
            System.out.println(myTest1.z); // 5th print 2
        }
        void doStuff()
        {
            int z = 5;
            doStuff2(); // MyTest1.Z=1, Scope.Z=1
            System.out.println(z); // 2nd print 5
            doStuff2(); // MyTest1.Z=2, Scope.Z=2
        }
        void doStuff2()
        {
            z++; // MyTest1.Z
            scope.z++; //Scope.Z
        }

    }



