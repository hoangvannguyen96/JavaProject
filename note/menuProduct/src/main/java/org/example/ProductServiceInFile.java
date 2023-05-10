package org.example;

import java.io.*;
import java.util.*;

import static javax.print.attribute.Size2DSyntax.MM;

public class ProductServiceInFile {
    public static Scanner scanner = new Scanner(System.in);

    public static List<Product> findAllProducts() {
        List<Product> products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("E:\\JavaProject\\note\\menuProduct\\src\\main\\java\\org\\example\\data.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] items = line.split(",");
                long idProduct = Long.parseLong(items[0]);
                float priceProduct = Float.parseFloat(items[3]);
                Date createAt = DateUtils.parse(items[4]);
                ECategory eCategory = ECategory.getECategoryByName(items[5]);

                Product p = new Product(idProduct, items[1], items[2], priceProduct, createAt, eCategory);
                products.add(p);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return products;
    }

    public void addProduct(Product p) {
        List<Product> products = findAllProducts();
        products.add(p);
        try {
            FileWriter fileWriter = new FileWriter("E:\\JavaProject\\note\\menuProduct\\src\\main\\java\\org\\example\\data.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Product item : products) {
                bufferedWriter.write(item.toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static List<Product> clearProduct(long ID) {
        List<Product> products=findAllProducts();
        Product product2=findProductID(ID, products);
        List<Product> products1 = new ArrayList<>();
        boolean check = false;
        while (!check) {
            if (product2 == null) {
                System.out.println("ID không có trong danh sách, hãy thử với ID khác");
                long ID1 = Long.parseLong(scanner.nextLine());
                product2=findProductID(ID1, products);
                ID=ID1;
            } else {
                for (Product product : products) {
                    if (product.getId() == ID) {
                        products1.add(product);
                        break;
                    }
                }
                products.removeAll(products1);
                check=true;
            }
        }
        return products;
    }

    public static List<Product> write(List<Product> products) throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\JavaProject\\note\\menuProduct\\src\\main\\java\\org\\example\\data.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Product product : products) {
            bufferedWriter.write(product.toString() + "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
        return products;
    }
    public static List<Product> writeFile() throws IOException {
        List<Product> products=findAllProducts();
        System.out.println("Nhập tên?");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả?");
        String description = scanner.nextLine();
        System.out.println("Nhập giá?");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Chọn danh mục?");
        for (ECategory eCategory : ECategory.values()) {
            System.out.printf("Chọn %-5s %-10s", eCategory.getId(), eCategory.getName());
        }
        int idCategory = Integer.parseInt(scanner.nextLine());
        ECategory eCategory = ECategory.getECategoryById(idCategory);
        Product product = new Product(System.currentTimeMillis() / 1000, name, description, price, new Date(), eCategory);
        products.add(product);
        FileWriter fileWriter = new FileWriter("E:\\JavaProject\\note\\menuProduct\\src\\main\\java\\org\\example\\data.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Product product1 : products) {
            bufferedWriter.write(product1.toString() + "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
        return products;
    }

    public static Product findProductID(long ID, List<Product> products) {
        for (Product product : products) {
            if (product.getId() == ID) {
                return product;
            }
        }
        return null;
    }
    public static Product findProductName(String name, List<Product> products) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    public static List<Product> sortProductName(List<Product>products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return products;
    }
    public static List<Product> sortProductCost(List<Product>products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice()-o2.getPrice());
            }
        });
        return products;
    }
    public static List<Product> sortProductDate(List<Product>products) {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getCreateAt().compareTo(o2.getCreateAt());
            }
        });
        return products;
    }
    public static List<Product> fixProductName(){
        List<Product> products=findAllProducts();
        System.out.println("Nhập ID cần sửa tên?");
        long ID=Long.parseLong(scanner.nextLine());
        Product product=findProductID(ID,products);
        boolean check=false;
        while (!check){
            if(product==null){
                System.out.println("ID không có trong danh sách, hãy thử với ID khác");
                long ID1 = Long.parseLong(scanner.nextLine());
                product=findProductID(ID1, products);
                ID=ID1;
            }else {
                System.out.println("Đây là sản phẩm bạn muốn sửa");
                System.out.println(product.toString());
                System.out.println("Nhập tên cần sửa?");
                String name=scanner.nextLine();
                product.setName(name);
                check=true;
            }
        }
        return products;
    }
    public static List<Product> fixProductDiscribe(){
        List<Product> products=findAllProducts();
        System.out.println("Nhập ID cần sửa mô tả?");
        long ID=Long.parseLong(scanner.nextLine());
        Product product=findProductID(ID,products);
        boolean check=false;
        while (!check){
            if(product==null){
                System.out.println("ID không có trong danh sách, hãy thử với ID khác");
                long ID1 = Long.parseLong(scanner.nextLine());
                product=findProductID(ID1, products);
                ID=ID1;
            }else {
                System.out.println("Đây là sản phẩm bạn muốn sửa");
                System.out.println(product.toString());
                System.out.println("Nhập mô tả cần sửa?");
                String describe=scanner.nextLine();
                product.setDescription(describe);
                check=true;
            }
        }
        return products;
    }
    public static List<Product> fixProductCost(){
        List<Product> products=findAllProducts();
        System.out.println("Nhập ID cần sửa giá?");
        long ID=Long.parseLong(scanner.nextLine());
        Product product=findProductID(ID,products);
        boolean check=false;
        while (!check){
            if(product==null){
                System.out.println("ID không có trong danh sách, hãy thử với ID khác");
                long ID1 = Long.parseLong(scanner.nextLine());
                product=findProductID(ID1, products);
                ID=ID1;
            }else {
                System.out.println("Đây là sản phẩm bạn muốn sửa");
                System.out.println(product.toString());
                System.out.println("Nhập giá cần sửa?");
                float price=Float.parseFloat(scanner.nextLine());
                product.setPrice(price);
                check=true;
            }
        }
        return products;
    }
    public static List<Product> fixProductDate(){
        List<Product> products=findAllProducts();
        System.out.println("Nhập ID cần sửa ngày nhập?");
        long ID=Long.parseLong(scanner.nextLine());
        Product product=findProductID(ID,products);
        boolean check=false;
        while (!check){
            if(product==null){
                System.out.println("ID không có trong danh sách, hãy thử với ID khác");
                long ID1 = Long.parseLong(scanner.nextLine());
                product=findProductID(ID1, products);
                ID=ID1;
            }else {
                System.out.println("Đây là sản phẩm bạn muốn sửa");
                System.out.println(product.toString());
                System.out.println("Nhập ngày nhập cần sửa? dd-MM-yyyy hh:mm");
                String date=scanner.nextLine();
                product.setCreateAt(DateUtils.parse(date));
                check=true;
            }
        }
        return products;
    }
    public static List<Product> fixProductECategory(){
        List<Product> products=findAllProducts();
        System.out.println("Nhập ID cần sửa ECategory?");
        long ID=Long.parseLong(scanner.nextLine());
        Product product=findProductID(ID,products);
        boolean check=false;
        while (!check){
            if(product==null){
                System.out.println("ID không có trong danh sách, hãy thử với ID khác");
                long ID1 = Long.parseLong(scanner.nextLine());
                product=findProductID(ID1, products);
                ID=ID1;
            }else {
                System.out.println("Đây là sản phẩm bạn muốn sửa");
                System.out.println(product.toString());
                System.out.println("Nhập lựa chọn ECategory cần sửa?");
                for (ECategory eCategory : ECategory.values()) {
                    System.out.printf("Chon %-5s %-10s", eCategory.getId(), eCategory.getName());
                }
                int idCategory = Integer.parseInt(scanner.nextLine());
                ECategory eCategory = ECategory.getECategoryById(idCategory);
                product.seteCategory(eCategory);
                check=true;
            }
        }
        return products;
    }

}
