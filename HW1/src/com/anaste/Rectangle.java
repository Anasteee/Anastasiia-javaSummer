package com.anaste;

public class Rectangle {
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
        this.c = new Point(a.getX(), b.getY());
        this.d = new Point(b.getX(), a.getY());
    }

    public boolean checkPointCollision(Rectangle r2) {
        boolean leftUpCollision = this.c.equals(r2.getD());
        boolean rightUpCollision = this.b.equals(r2.getA());
        boolean rightDownCollision = this.d.equals(r2.getC());
        boolean leftDownCollision = this.a.equals(r2.getB());
        return leftUpCollision || rightUpCollision || rightDownCollision || leftDownCollision;
    }

    public boolean checkVerticalCollision(Rectangle r2) {
        boolean rightCollision = this.b.getX() == r2.getA().getX();
        boolean leftCollision = this.a.getX() == r2.getB().getX();
        return leftCollision || rightCollision;
    }

    public boolean checkHorizontalCollision(Rectangle r2) {
        boolean upCollision = this.b.getY() == r2.getA().getY();
        boolean downCollision = this.a.getY() == r2.getB().getY();
        return upCollision || downCollision;
    }

    public boolean checkQuaderCollision(Rectangle r2) {
        if (this.a.getX() < r2.getB().getX() && this.b.getX() > r2.getA().getX()) {
            if (this.c.getY() > r2.getA().getY() && this.a.getY() < r2.getC().getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean checkCollision(Rectangle r2) {
        if (checkPointCollision(r2)) return true;
        if (checkVerticalCollision(r2)) return true;
        if (checkHorizontalCollision(r2)) return true;
        return checkQuaderCollision(r2);
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

}
