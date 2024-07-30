package hw_05;

public class MyRectangleMain {
    public static void main(String[] args) {
        MyRectangle myRectangle1 = new MyRectangle(10, 20);
        myRectangle1.setWidth(10);
        myRectangle1.setDepth(20);
        System.out.println(myRectangle1.getArea());

        MyRectangle myRectangle2 = new MyRectangle(10, 20);
        System.out.println(myRectangle2.getArea());
    }
}
