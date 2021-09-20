abstract class A{
    public abstract int b();
    public void d(){
        System.out.println("world");
    }
}
class B extends A{   //추상객체 사용하려면 오버라이딩 필수
    public int b(){return 1;}
}
public class Exam29 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.b());  //1
    }
}
