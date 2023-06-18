package com.company;

public class Main {

    public static void main(String[] args) {
        pointCollisionTest();
        verticalCollisionTest();
        horizontalCollisionTest();
        niceCollisionTest();
        noCollisionTest();
    }
    public static void checkCollision(Rectangle r1, Rectangle r2){
        if (!r1.checkCollision(r2)) {
            System.out.println("Перетинів немає.");
        } else if (r1.checkPointCollision(r2)) {
            System.out.println("Перетином є крапка.");
        } else if (r1.checkVerticalCollision(r2)){
            System.out.println("Перетином є вертикальна лінія.");
        } else if (r1.checkHorizontalCollision(r2)){
            System.out.println("Перетином є горизонтальна лінія.");
        } else {
            System.out.println("Перетином є прямокутник.");
        }
    }


    public static void pointCollisionTest(){
        Rectangle rectangle1 = new Rectangle(new Point(3, 3), new Point(6, 6));
        Rectangle rectangle2 = new Rectangle(new Point(6, 5), new Point(3, 3));

        checkCollision(rectangle1, rectangle2);
    }

    public static void verticalCollisionTest(){
        Rectangle rectangle1 = new Rectangle(new Point(3, 3), new Point(6, 6));
        Rectangle rectangle2 = new Rectangle(new Point(10, 5), new Point(3, 7));

        checkCollision(rectangle1, rectangle2);
    }

    public static void horizontalCollisionTest(){
        Rectangle rectangle1 = new Rectangle(new Point(3, 3), new Point(6, 6));
        Rectangle rectangle2 = new Rectangle(new Point(10, 5), new Point(7, 3));

        checkCollision(rectangle1, rectangle2);
    }

    public static void noCollisionTest(){
        Rectangle rectangle1 = new Rectangle(new Point(3, 3), new Point(6, 6));
        Rectangle rectangle2 = new Rectangle(new Point(10, 5), new Point(12, 8));

        checkCollision(rectangle1, rectangle2);
    }

    public static void niceCollisionTest(){
        Rectangle rectangle1 = new Rectangle(new Point(3, 3), new Point(6, 6));
        Rectangle rectangle2 = new Rectangle(new Point(5, 5), new Point(12, 8));

        checkCollision(rectangle1, rectangle2);
    }


}
