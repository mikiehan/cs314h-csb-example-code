package composition;

public interface Thing {
    void update();
    void draw();
    void collide(Thing[] things);

}
