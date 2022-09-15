package composition;

public interface Movable extends Thing {
    @Override
    default void update() {
        System.out.println("update the position after moving");
    }
}
