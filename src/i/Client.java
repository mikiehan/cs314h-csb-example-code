package i;

public class Client {

    //program to an interface (Supertype) not to an implementation (concrete subtype)
    public static void main(String[] args) {
        IMove m = new Crawl();
        ISleep s = new Crawl();
        s.move();
        m.move();
        s.hashCode(); //Object class' method is implicitly defined in interface

        //Crawl c = new Crawl();
        //m.move(); //bend your knee....
    }
}
