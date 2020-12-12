package com.company.Lab5;

public class MovableCircle extends Circle implements Movable {

    private MovablePoint center;
    private double radius;
    public MovableCircle(double radius) {
        super(radius);
        this.radius = radius;
        center = new MovablePoint(0, 0, 5, 5);
    }

    @Override
    public void moveUp(double x) {
        center.setX(center.getX() + x);
    }

    @Override
    public void moveDown(double x) {
        center.setX(center.getX() - x);
    }

    @Override
    public void moveLeft(double y) {
        center.setY(center.getY() - y);
    }

    @Override
    public void moveRight(double y) {
        center.setY(center.getY() + y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "x=" + center.getX() +
                ", y=" + center.getY() +
                ", radius=" + radius +
                '}';
    }
}
