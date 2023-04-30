package org.example;

import java.util.*;

public class Product {
    private int id;
    private String name;
    private int cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product() {

    }

    public Product(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public static Scanner sc = new Scanner(System.in);

    public static List<Product> addProduct(List<Product> product) {
        System.out.println("Nhập ID");
        int ID = sc.nextInt();
        sc.nextLine();
        int i = 0;
        while (i < product.size()) {
            if (product.get(i).getId() == ID) {
                System.out.println("Nhập lại ID");
                int ID1 = sc.nextInt();
                sc.nextLine();
                ID = ID1;
                i = 0;
                continue;
            }
            i++;
        }
        System.out.println("Nhập tên sản phẩm");
        String name = sc.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int cost = sc.nextInt();
        Product product1 = new Product(ID, name, cost);
        product.add(product1);
        String str = "";
        for (Product product2 : product) {
            str += product2.toString();
        }
        System.out.println(str);
        return product;
    }

    public static Product finProduct(int ID, List<Product> product) {
        for (Product product1 : product) {
            if (product1.getId() == ID) {
                return product1;
            }
        }
        return null;
    }

    public static void fixProduct(int ID, List<Product> product) {
        Product product1 = finProduct(ID, product);
        boolean check = false;
        while (!check) {
            if (product1 == null) {
                System.out.println("ID không có trong danh sách, hãy thử với ID khác");
                ID = Integer.parseInt(sc.nextLine());
                product1 = finProduct(ID, product);
            } else {
                System.out.println("ID = " + ID + " là sản phẩm có thông tin sau:");
                System.out.println(product1.toString());
                boolean check1 = true;
                while (check1) {
                    System.out.println("Bạn muốn sửa gì?");
                    System.out.println("1. Sửa ID");
                    System.out.println("2. Sửa tên");
                    System.out.println("3. Sửa giá");
                    System.out.println("0. Exit");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập ID");
                            int ID1 = sc.nextInt();
                            sc.nextLine();
                            int i = 0;
                            while (i < product.size()) {
                                if (product.get(i).getId() == ID1) {
                                    System.out.println("Nhập lại ID");
                                    int ID2 = sc.nextInt();
                                    sc.nextLine();
                                    ID1 = ID2;
                                    i = 0;
                                    continue;
                                }
                                i++;
                            }
                            product1.setId(ID1);
                            System.out.println(product1.toString());
                            break;
                        case 2:
                            System.out.println("Nhập tên");
                            String name = sc.nextLine();
                            product1.setName(name);
                            System.out.println(product1.toString());
                            break;
                        case 3:
                            System.out.println("Nhập giá");
                            int cost = sc.nextInt();
                            sc.nextLine();
                            product1.setCost(cost);
                            System.out.println(product1.toString());
                            break;
                        case 0:
                            System.out.println("goodbye!");
                            check1 = false;
                            check = true;
                            break;
                        default:
                            break;
                    }
                }
            }
            System.out.println("Danh sách sản phẩm sau sửa");
            System.out.println(product.toString());
        }
    }

    public static List<Product> clearProduct(int ID, List<Product> product) {
        boolean check = false;
        while (!check) {
            for (Product product1 : product) {
                if (product1.getId() == ID) {
                    product.remove(product1);
                    System.out.println(product.toString());
                    return product;
                }
            }
            System.out.println("ID bạn nhập không có trong danh sách, vui lòng nhập lại!");
            ID = Integer.parseInt(sc.nextLine());
        }
        return null;
    }

    public static void displayProduct(List<Product> product) {
        for (Product product1 : product) {
            System.out.println(product1.toString());
        }
    }

    public static Product searchProduct(String name, List<Product> product) {
        boolean check = false;
        while (!check) {
            for (Product product1 : product) {
                if (product1.getName().equalsIgnoreCase(name)) {
                    System.out.println(product1.toString());
                    return product1;
                }
            }
            System.out.println("Tên sản phẩm bạn nhập không có trong danh sách, mời nhập lại!");
            name = sc.nextLine();
        }
        return null;
    }

    public static List<Product> ascendingCost(List<Product> product) {
        Collections.sort(product, new ComperatorAscendingCost());
        for (Product product1 : product) {
            System.out.println(product1.toString());
        }
        return product;
    }

    public static List<Product> DecreaCost(List<Product> product) {
        Collections.sort(product, new ComparatorDecreaCost());
        for (Product product1 : product) {
            System.out.println(product1.toString());
        }
        return product;
    }


}

