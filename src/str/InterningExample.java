package str;

public class InterningExample {
    public static void main(String[] args) {
        String fly  = "fly";  String weight  = "weight";
        String fly2 = "fly";  String weight2 = "weight";

        //a) fly == fly2
        System.out.println(fly == fly2); //True
//        b)	weight == weight2
        System.out.println(weight == weight2); //True
//        c)	"fly" + "weight" == "flyweight"
        System.out.println("fly" + "weight" == "flyweight"); //True
//        d)	fly + weight == "flyweight"
        System.out.println(fly + weight == "flyweight"); //False
//
       String flyweight = new String("fly" + "weight");
//        e)	flyweight == "flyweight"
        System.out.println(flyweight == "flyweight"); //False

       String interned1 = (fly + weight).intern();
       String interned2 = flyweight.intern();
//        f)	interned1 == "flyweight"
        System.out.println(interned1 == "flyweight"); //True
//        g)	interned2 == "flyweight"
        System.out.println(interned2 == "flyweight"); //True

    }
}
