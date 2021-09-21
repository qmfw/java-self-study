class A{
    public String x(){return "x";}
}
class B extends A{
    public String y(){return "y";}
}
public class Exam35 {
    public static void main(String[] args) {
        A obj = new B();
        obj.x();
        //obj.y();
        //B obj = new B(); 라고하면 돌아간다
    }
}