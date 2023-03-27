package U2;

public class methodPractice {
    public static void method1() {
        System.out.println("Iam method 1.");
    }
    public static void method2() {
        method1();
        System.out.println(" Iam method 2.");
    }
    public static void method3() {
        method2();
        System.out.println(" Iam method 2.");
        method1();
    }
    public static void main(String[] args){
        method1();
        method3();
        method2();
        method1();
    }

}

