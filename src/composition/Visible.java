package composition;

public interface Visible extends Thing {
    @Override
    default void draw() {
        System.out.println("Visibly draw");
    }
}
