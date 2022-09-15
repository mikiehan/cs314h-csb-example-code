package oo3;

public class Main {
    public static void main(String[] args) {
        Pointe p1 = new Pointe(3, 5);
        Pointe p2 = new Pointe(30, 50);
        Object o = new String("123");

        //p1 has (x=3, y=5)
        p1.getX(); //30
        //p2 has (x=30, y=50)
        p2.getY(); //50

//        System.out.println(p4 == p1); //false

//        Pointe p3 = new Pointe(100, 200);
//        p3.sayHello();

        Pointe.sayHello();
        System.out.println(Math.PI);


    }
}
