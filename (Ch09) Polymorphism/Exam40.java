interface I2{
    public String A();  //B는 없어서 밑에 한줄 에러
}
interface I3{
    public String B();  //A는 없어서 밑에 한줄 에러
}
class D implements I2, I3{
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}
public class Exam40 {
    public static void main(String[] args) {
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();
         
        obj.A();
        obj.B();
         
        objI2.A();
        //objI2.B();
         
        //objI3.A();
        objI3.B();
    }
}