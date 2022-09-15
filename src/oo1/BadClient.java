package oo1;

import java.util.List;

public class BadClient {
    public static void main(String[] args) {
        //instantiate shapes
        //call doSomething
        //call doSomething2
    }

    //Say the Java never allowed dynamic binding
    //only allowed static binding (Compile/static type)
    //Q: Can we mimic dynamic binding behavior with just static binding?
    //        Shape s = new Circle(3); //if PL only allowed static binding
    //        s.getArea(); //because s's static type is Shape -> shape's getArea()
    private void doSomething(List<Shape> shapes, double thresh) {

        for (Shape s : shapes) {
            double area = 0;
            if (s instanceof Circle) {
                Circle c = (Circle) s;
                area = c.getArea();
                //...
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                area = r.getArea();
                //...
            } else { // ??

            }
            if (area > thresh) {
                //do something that I really wanted with area (enlarge??)
            }
        }
    }

    private void doSomething2(List<Shape> shapes) {
        for (Shape s : shapes) {
            Rectangle r = null;
            if (s instanceof Circle) {
                //...
            } else if (s instanceof Rectangle) {
                //...
            } else { // ??

            }
            //do something that I really wanted with r

        }
    }
}

//    Circle c = (Circle) s; //if only static binding is available you need to do static type casting
//                area = c.getArea(); //c is Circle type so Circle's getArea will be called
