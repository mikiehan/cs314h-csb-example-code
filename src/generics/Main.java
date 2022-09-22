package generics;
import pts.*;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> intList = new MyList<>();
        MyList<Point> pointList = new MyList<>();
        pointList.add(new Point3D(1,2, 3)); //legal
        Object p = pointList.get(0);
        System.out.println(p.getClass());


        MyList<Point> pointList2 = new MyList<Point>(); //legal
        //MyList<Point> pointList3 = new MyList<Point3D>(); //not legal

    }
}










