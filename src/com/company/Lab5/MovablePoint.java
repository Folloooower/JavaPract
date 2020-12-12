package com.company.Lab5;

public class MovablePoint implements Movable {
    private double x, y;
    private int xSpeed, ySpeed;
    public MovablePoint(double x, double y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void moveUp(double x) {
        this.x += x;
    }

    @Override
    public void moveDown(double x) {
        this.x -= x;
    }

    @Override
    public void moveLeft(double y) {
        this.y -= y;
    }

    @Override
    public void moveRight(double y) {
        this.y += y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
