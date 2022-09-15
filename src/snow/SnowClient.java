package snow;

public class SnowClient {

    //Case A: Without type casting -> Simple
    //A1)compile-time: Check static-type and ask is it legal? (Is the action defined by the static type?)
    //                 If not, compile-time "cannot find symbol" error
    //A2)If so, run-time: runs the dynamic type's version of the action


    //Case B: WITH type casting from X to Y
    //B1) compile time
    //B1-1) Is Y up or down the tree from X? If not, compile-time "incompatible type" error
    //B1-2) Is the action defined in Y? If not, compile-time "cannot find symbol" error
    //B2) only if above two are ok, run-time
    //B2-1) Is Y up the tree from X? If not, run-time "ClassCastException"
    //B2-2) If so, runs the dynamic type's version of the action (It could be Y or child/grandchild of Y, etc.)

    public static void main(String[] args) {
        // write your code here
        Snow var6 = new Fog();
        ((Sleet) var6).m2(); //Q1: Why no recursion? "yank" the code from parent to mine
        //    super's m2 is the same as grandparent's m2
        //Q2: What's the purpose of type casting into Sleet??

        //Above is the same code as below
        Snow var7 = new Fog();
        Sleet s = (Sleet) var7;
        s.m2();

        //Above code 27-29 can be written as below with method foo()
        foo(new Fog());

    }

    //typically you will see something foo
    private static void foo(Snow v) {
        Sleet s = (Sleet) v;
        s.m2(); //if v's d-type is sleet, it will run sleet's version of m2.
        // If v's d-type is fog, it will run fog's version of m2
    }

}


//    //Above is the same code as below
//    Snow var7 = new Fog();
//    Sleet s = (Sleet) var7;
//    s.m2();
//}
//

