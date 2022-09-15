package pts;

import java.util.HashSet;

public class PointClient {
    public static void main(String[] args) {
        Point p1 = new Point(3, 5);
        Point p2 = new Point(30, 50);
        Point p3 = new Point(30, 50);

 //       System.out.println(p2.hashCode());
 //       System.out.println(p3.hashCode());

        HashSet<Point> set = new HashSet<>();
        set.add(p2);
//        System.out.println(set.contains(p3)); //true

//        Point p4 = new Point3D(30, 50, 100); //Fog
        String h = "123";
        String h2 = "123";
        String h3 = "456";
        System.out.println(h == h2); //true
        System.out.println(h2 == h3); //false

//        System.out.println(h.hashCode());
//
//        System.out.println(p1.equals(p2));
//        System.out.println(p2.equals(p3));
//        System.out.println(p3.equals(p4)); // true
//        System.out.println(p2.equals(h));

    }
}
