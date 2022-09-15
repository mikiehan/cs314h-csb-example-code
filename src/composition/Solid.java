package composition;

public interface Solid extends Thing {
    @Override
    default void collide(Thing[] things) {
        System.out.println("react to collisions with other object");
    }
}
