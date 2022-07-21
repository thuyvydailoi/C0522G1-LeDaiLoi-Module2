package ss15_exception_debug.exercise.triangle.model;

import ss15_exception_debug.exercise.triangle.exception.IllegalTriangleException;

public class Triangle {
    private double firstEdges;
    private double secondEdges;
    private double thirdEdges;

    public Triangle() {
    }

    public Triangle(double firstEdges, double secondEdges, double thirdEdges) throws IllegalTriangleException {
        if (firstEdges <= 0 || secondEdges <= 0 || thirdEdges <= 0) {
            throw new IllegalTriangleException("Độ dài cạnh phải là giá trị dương!!!");
        } else if (firstEdges + secondEdges <= thirdEdges || secondEdges + thirdEdges <= firstEdges || secondEdges + thirdEdges <= firstEdges){
            throw new IllegalTriangleException("Tổng độ dài 2 cạnh phải lớn hớn độ dài cạnh còn lại!!!");
        } else {
            this.firstEdges = firstEdges;
            this.secondEdges = secondEdges;
            this.thirdEdges = thirdEdges;
        }

    }

    public double getFirstEdges() {
        return firstEdges;
    }

    public void setFirstEdges(double firstEdges) {
        this.firstEdges = firstEdges;
    }

    public double getSecondEdges() {
        return secondEdges;
    }

    public void setSecondEdges(double secondEdges) {
        this.secondEdges = secondEdges;
    }

    public double getThirdEdges() {
        return thirdEdges;
    }

    public void setThirdEdges(double thirdEdges) {
        this.thirdEdges = thirdEdges;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstEdges=" + firstEdges +
                ", secondEdges=" + secondEdges +
                ", thirdEdges=" + thirdEdges +
                '}';
    }
}
