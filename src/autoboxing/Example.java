package autoboxing;

public class Example {
    public static void main(String[] args) {
        Integer x = new Integer(3);
        Integer y = new Integer(3);
        Integer w = new Integer(300);
        Integer z = new Integer(300);

        String s1 = "ABC";
        String s2 = "ABC";
        //s1 == s2 //true

        Integer m = 3; //similar to String "interning"
        Integer n = 3;
        //m == n is true (they point to the same memory location)
        //for just small integers....
        Integer p = 300;
        Integer q = 300;
        //p == q is false (they point to different locations)

        if (x.intValue() == 3)       // Is this valid? What is happening? x.intValue()
            System.out.println("x is three");  //print yes

        if (w == z)      // Does auto-unboxing happens here? No!
            System.out.println("w + z = 2*w"); //doesn't print

        //just doing memory address comparison (similar to string interning)
        if (m == n)      // What happens here? NOT m.intValue() == n.intValue()
            System.out.println("everyone gets an A");

        if (p == q)              // What happens here? FALSE!!!
            System.out.println("everyone gets a F");
                                 //doesn't interning
                                 //large number


        if (x == y)              // What happens here?
            System.out.println("no one gets an A");

        //What should we do always?
        //always explicitly call x.intValue()

    }
}
