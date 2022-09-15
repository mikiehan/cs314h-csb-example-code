package i;

//IMove.Something
public interface IMove {
    int Something = 100; //constant (public static final)
    default void move() {
        System.out.println("I am moving");
    }
}

//
//    private static void sayHi(){
//        System.out.println("hi");
//    }
