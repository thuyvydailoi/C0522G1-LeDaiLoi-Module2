package ss15_exception_debug.exercise.triangle.controller;

import ss15_exception_debug.exercise.triangle.exception.IllegalTriangleException;
import ss15_exception_debug.exercise.triangle.model.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstEdges;
        double secondEdges;
        double thirdEdges;
        while (true) {
            try {
                System.out.println("Nhập độ dài cạnh thứ nhất: ");
                firstEdges = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập độ dài cạnh thứ hai: ");
                secondEdges = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập độ dài cạnh thứ ba: ");
                thirdEdges = Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(firstEdges, secondEdges, thirdEdges);
                System.out.println(triangle);
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập số!");
            } catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập độ dài cạnh phù hợp");
            }
        }
    }
}

