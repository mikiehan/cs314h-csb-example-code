package i;

//ISleep.Something
public interface ISleep {
    int Something = 0;
    default void move() {
        System.out.println("I am sleeping");
    }

}
