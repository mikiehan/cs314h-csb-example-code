package link;

public class Main {

    public static void main(String[] args) {
        Link l = new Sausage(); //Concrete class Sausage implements interface Link
        foo(l); //legal?
    }

    public static void foo(Object o){
        //...
    }
}
