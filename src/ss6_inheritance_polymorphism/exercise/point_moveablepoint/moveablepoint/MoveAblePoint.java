package ss6_inheritance_polymorphism.exercise.point_moveablepoint.moveablepoint;

import ss6_inheritance_polymorphism.exercise.point_moveablepoint.point.Point;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint() {

    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getXSpeed(), getYSpeed()};
    }

    public String toString(){
        return super.toString() + String.format(" Speed = (%1.2f, %1.2f)",getXSpeed(),getYSpeed());
    }

    public MoveAblePoint move() {
         super.setX(super.getX() + getXSpeed());
         super.setY(super.getY()+getYSpeed());
         return this;
    }
}
