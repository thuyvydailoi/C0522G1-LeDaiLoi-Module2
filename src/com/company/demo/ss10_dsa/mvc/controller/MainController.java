package com.company.demo.ss10_dsa.mvc.controller;
//
//
//import ss10_dsa_list.mvc.service.IPersonService;
//import ss10_dsa_list.mvc.service.IStudentService;
//import ss10_dsa_list.mvc.service.impl.PersonService;
//import ss10_dsa_list.mvc.service.impl.StudentService;
//
//import java.util.Collections;
//import java.util.Scanner;
//
public class MainController {
//    //MVC
//    /*
//    M = Model = model + service (service => nơi xử lý tất cả các nghiệm vụ)
//    V: View
//    C: Controller => điều hướng => if else
//     */
//    IPersonService iPersonService = new PersonService();
//    IStudentService iStudentService = new StudentService();
//    /*
//    interface: tiền tố I, class => Không có hậu tố
//    interface: không có tiền tố, class => có hậu tố Impl
//    => Tuyệt đối không: interface: tiền tố I, class => có hậu tố Impl
//     */
//
//    public void displayMenu() {
//        // CRUD
//        Scanner scanner = new Scanner(System.in);
//
//        int choose;
//        do {
//            System.out.println("============ Menu ============");
//            System.out.println("1. Thêm mới");
//            System.out.println("2. Hiển thị danh sách");
//            System.out.println("3. Chỉnh sửa");
//            System.out.println("4. Delete");
//            System.out.println("5. Thoát");
//
//            System.out.print("Nhập vào lựa chọn của bạn: ");
//            choose = Integer.parseInt(scanner.nextLine());
//
//            if (choose < 1 || choose > 5) {
//                System.out.println("Lựa chọn không hợp lệ, hãy chọn lại");
//                continue;
//            }
//            switch (choose) {
//                case 1:
//                    iStudentService.add();
//                    break;
//
//                case 2:
////                    iPersonService.findAll();
////                    System.out.println("Sau khi sắp xếp");
//                    iStudentService.findAllBySort();
//                    // hiển thị danh sách student
//                    //iStudentService.findAll();
//                case 3:
//                    break;
//
//                case 4:
//                    break;
//
//                case 5:
//                    System.exit(0);
//            }
//        } while (true);
//    }
}