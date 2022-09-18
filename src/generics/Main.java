package generics;
import pts.*;

public class Main {
    public static void main(String[] args) {
        MyList<Point> pointList = new MyList<Point>();
        //MyList<Point> pointList2 = new MyList<Point3D>(); //legal?
        //pointList.add(new Point3D(1,2, 3)); //legal?
        //Point p = pointList.get(0);
        //System.out.println(p.getClass());
    }
}
