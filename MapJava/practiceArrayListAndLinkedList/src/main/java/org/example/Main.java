package org.example;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product product1=new Product(1,"huda",12000);
        Product product2=new Product(2,"tiger",15000);
        Product product3=new Product(3,"tubor",18000);
        List<Product> products=new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        while (true){
            System.out.println("Menu");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xóa sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("0. Exit");
            System.out.println("Mời bạn lựa chọn?");
            int choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    Product.addProduct(products);
                    break;
                case 2:
                    System.out.println("Mời bạn nhập ID muốn sửa thông tin");
                    int ID=sc.nextInt();
                    sc.nextLine();
                    Product.fixProduct(ID,products);
                    break;
                case 3:
                    System.out.println("Mời bạn nhập ID muốn sửa thông tin");
                    int ID1=Integer.parseInt(sc.nextLine());
                    Product.clearProduct(ID1,products);
                    break;
                case 4:
                    Product.displayProduct(products);
                    break;
                case 5:
                    System.out.println("Mời bạn nhập tên sản phẩm muốn tìm kiếm?");
                    String name=sc.nextLine();
                    Product.searchProduct(name,products);
                    break;
                case 6:
                    Product.ascendingCost(products);
                    break;
                case 7:
                    Product.DecreaCost(products);
                    break;
                case 0:
                    System.out.println("goodbye!");
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}