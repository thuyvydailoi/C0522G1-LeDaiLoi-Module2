package com.company.demo.ss10_dsa.mvc.service.impl;

import com.company.demo.ss10_dsa.mvc.service.IStudentService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    @Override
    public void findAll() {

    }

    @Override
    public void add() {

    }

    @Override
    public void finbdAllBySort() {

    }
//    Scanner scanner = new Scanner(System.in);
//    @Override
//    public void findAll() {
//        for (int i = 0; i < PersonService.people.size(); i++) {
//            if (PersonService.people.get(i) instanceof Student) {
//                System.out.println(PersonService.people.get(i));
//            }
//        }
//    }
//
//    @Override
//    public void findAllBySort() {
//        List<Student> students = new ArrayList<>();
//        for (int i = 0; i < PersonService.people.size(); i++) {
//            if (PersonService.people.get(i) instanceof Student) {
//                students.add((Student) PersonService.people.get(i));
//            }
//        }
//
//        for(Student student : students) {
//            System.out.println(student);
//        }
//        System.out.println("Sau khi sắp xếp");
//        Collections.sort(students);
//
//        for(Student student : students) {
//            System.out.println(student);
//        }
//
//
//    }
//
//    @Override
//    public void add() {
//        System.out.print("Nhập vào id: ");
//        int id = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("Nhập vào tên: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Nhập vào điểm: ");
//        Double score = Double.parseDouble(scanner.nextLine());
//
//        Student student = new Student(id, name, score);
//
//        PersonService.people.add(student);
//    }
//
//    @Override
//    public void finbdAllBySort() {
//
//    }
}
