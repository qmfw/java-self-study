enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}
 
enum Company{
    GOOGLE, APPLE, ORACLE;
}
 
public class Exam61 {
     
    public static void main(String[] args) {
        for(Fruit f : Fruit.values()){   //읽고 Fruit부터 실행
            System.out.println(f+", "+f.getColor());
        }
    }
}

/*
Call Constructor APPLE
Call Constructor PEACH
Call Constructor BANANA
APPLE, red
PEACH, pink
BANANA, yellow
*/