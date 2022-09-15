package autoboxing;

public class Example2 {
    public static void main(String[] args) {
        Integer x = null;
        if (x != null && x.intValue() != 0)   // What happens here? x.intValue()
            System.out.println("10/x is " + 10 / x);
    }
}

//
//                if (x != null && x.intValue() != 0)
//                println("10/x is ", 10 / x);  // A: This code is more clear.
