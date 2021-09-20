public class Main extends OverloadingDemo{
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
    void A (){System.out.println("sub class : void A ()");}
    public static void main(String[] args) {
        Main od = new Main();
        od.A();
        od.A(1);
        od.A("coding everybody");
        od.A("coding everybody", "coding everybody");
         
    }
}

/*
sub class : void A ()
void A (int arg1)
void A (String arg1)
sub class : void A (String arg1, String arg2)
*/