package oo3;

public class Pointe {
    private int x;
    private int y;
    //public static String someStr;

    public Pointe(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x; //instance field
    }

    public int getY() {
        System.out.println(Math.PI);
        Pointe.sayHello(); //always will say Hi
        this.getX(); //your own x

        return y;
    }

    public Pointe clone(){
        return new Pointe(x, y);
    }

    public static void sayHello(){
        System.out.println("Hi");
    }
}
