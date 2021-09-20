public class Main {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");}
    public static void main(String[] args) {
        Main od = new Main();
        od.A(); //void A()
        od.A(1); //void A (int arg1)
        od.A("coding everybody"); //void A (String arg1)
    }
}

/*
class OverloadingDemo {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");}
}

public class Exam23 {
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
} 이것 또한 멀쩡히 동작 */
