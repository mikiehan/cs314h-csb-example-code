package oo1;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        //Shape s2 = new Shape();
        //s2.getArea();

        Rectangle r = new Rectangle(10,20);
        Shape s = (Shape) r;
        System.out.println(s.getFittingRectangle() == null);

        //populate shape array
//        List<Shape> myShapes = new LinkedList<Shape>();
//        myShapes.add(new Circle(2));
//        myShapes.add(new Rectangle(3, 5));
//        myShapes.add(new Circle(20));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Circle(2));
//        myShapes.add(new Rectangle(3, 5));
//        myShapes.add(new Circle(20));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));
//        myShapes.add(new Rectangle(30, 50));

        //call doSomething
        //call doSomething2
    }


    private void doSomething(List<Shape> shapes, double thresh) {
        for (Shape s : shapes) {
            if (s.getArea() > thresh) { //each shape object provides appropriate area
                //do something 
            }
        }
    }

    private void doSomething2(List<Shape> shapes) {
        for (Shape s : shapes) {
            Rectangle r = s.getFittingRectangle(); //each shape object provides appropriate rectangle
            //do something with r
        }
    }
}
