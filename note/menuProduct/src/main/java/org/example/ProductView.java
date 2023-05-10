package org.example;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static org.example.ProductServiceInFile.*;
public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private ProductServiceInFile productService;
    public ProductView() {
        productService = new ProductServiceInFile();
    }
    public void launcher() throws IOException {
        do {
            System.out.println("Menu chương trình:");
            System.out.println("Nhập 1: Xem danh sách sản phẩm");
            System.out.println("Nhập 2: Thêm sản phẩm");
            System.out.println("Nhập 3: Xóa sản phẩm");
            System.out.println("Nhập 4: Sắp xếp sản phẩm");
            System.out.println("Nhập 5: Tìm kiếm sản phẩm");
            System.out.println("Nhập 6: Đọc dữ liệu từ file");
            System.out.println("Nhập 7: Ghi dữ liệu xuống file");
            System.out.println("Nhập 8: Hiển thị sản phẩm có phân trang");
            System.out.println("Nhập 9: Sửa thông tin sản phẩm");
            System.out.println("Nhập 0: Exit");

            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1:
                    showProducts(findAllProducts());
                    break;
                case 2:
                    showCreateProduct();
                    break;
                case 3:
                    showProducts(findAllProducts());
                    System.out.println("nhập ID");
                    long ID = Long.parseLong(scanner.nextLine());
                    productService.write(clearProduct(ID));
                    showProducts(findAllProducts());
                    break;
                case 4:
                    boolean check=false;
                    while (!check){
                        System.out.println("Bạn muốn sắp xếp theo gì?");
                        System.out.println("1. Sắp xếp theo tên");
                        System.out.println("2. Sắp xếp theo giá");
                        System.out.println("3. Sắp xếp theo ngày");
                        System.out.println("0. Exit");
                        int choice=Integer.parseInt(scanner.nextLine());
                        switch (choice){
                            case 1:
                                productService.write(productService.sortProductName(findAllProducts()));
                                showProducts(findAllProducts());
                                break;
                            case 2:
                                productService.write(productService.sortProductCost(findAllProducts()));
                                showProducts(findAllProducts());
                                break;
                            case 3:
                                productService.write(productService.sortProductDate(findAllProducts()));
                                showProducts(findAllProducts());
                                break;
                            case 0:
                                System.out.printf("Goodbye!");
                                check=true;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 5:
                    boolean check1=false;
                    while (!check1){
                        System.out.println("Bạn muốn tìm kiếm theo gì?");
                        System.out.println("1. Tìm kiếm theo ID");
                        System.out.println("2. Tìm kiếm theo tên");
                        System.out.println("0. Exit");
                        int choice=Integer.parseInt(scanner.nextLine());
                        switch (choice){
                            case 1:
                                System.out.println("nhập ID");
                                long ID1 = Long.parseLong(scanner.nextLine());
                                if(productService.findProductID(ID1,productService.findAllProducts())!=null){
                                    System.out.println(productService.findProductID(ID1,productService.findAllProducts()));
                                }else {
                                    System.out.println("ID bạn nhập không tồn tại, vui lòng nhập lại ID khác!");
                                }
                                break;
                            case 2:
                                System.out.println("Nhập tên sản phẩm");
                                String name=scanner.nextLine();
                                if(findProductName(name,productService.findAllProducts())!=null){
                                    System.out.println(productService.findProductName(name,productService.findAllProducts()));
                                }else {
                                    System.out.println("Tên sản phẩm bạn nhập không tồn tại, vui lòng nhập lại tên khác!");
                                }
                                break;
                            case 0:
                                System.out.println("Goodbye!");
                                check1=true;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 6:
                    showProducts(findAllProducts());
                    break;
                case 7:
                    showProducts(writeFile());
                 break;
                case 8:
                    break;
                case 9:
                    boolean check2=false;
                    while (!check2){
                        System.out.println("Bạn muốn sửa gì?");
                        System.out.println("Nhập 1: Sửa tên sản phẩm");
                        System.out.println("Nhập 2: Sửa mô tả sản phẩm");
                        System.out.println("Nhập 3: Sửa giá sản phẩm");
                        System.out.println("Nhập 4: Sửa ngày nhập sản phẩm");
                        System.out.println("Nhập 5: Sửa theo danh mục");
                        System.out.println("Nhập 0: Exit");
                        int choice=Integer.parseInt(scanner.nextLine());
                        switch (choice){
                            case 1:
                                showProducts(productService.write(productService.fixProductName()));
                                break;
                            case 2:
                                showProducts(productService.write(productService.fixProductDiscribe()));
                                break;
                            case 3:
                                showProducts(productService.write(productService.fixProductCost()));
                                break;
                            case 4:
                                showProducts(productService.write(productService.fixProductDate()));
                                break;
                            case 5:
                                showProducts(productService.write(productService.fixProductECategory()));
                                break;
                            case 0:
                                System.out.println("Goodbye!");
                                check2=true;
                                break;
                            default:
                                System.out.println("Lựa chọn của bạn không có, vui lòng chọn lại!");
                                break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Googbye!");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn của bạn không có trong Menu, vui lòng chọn lại!");
                    break;
            }
        } while (true);
    }
    private void showCreateProduct() {
        System.out.println("Thêm san phẩm");
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập mo ta: ");
        String description = scanner.nextLine();
        System.out.println("Nhap gia: ");
        float price = Float.parseFloat(scanner.nextLine());

        System.out.println("Chon danh muc:");
        for (ECategory eCategory : ECategory.values()) {
            System.out.printf("Chon %-5s %-10s", eCategory.getId(), eCategory.getName());
        }
        int idCategory = Integer.parseInt(scanner.nextLine());
        ECategory eCategory = ECategory.getECategoryById(idCategory);

        Product p = new Product(System.currentTimeMillis() / 1000, name, description, price, new Date(), eCategory);
        productService.addProduct(p);

        showProducts(findAllProducts());

    }
    private void showProducts(List<Product> allProducts) {
        System.out.printf("%-15s %-10s %-30s %-10s %-30s %-20s\n", "ID", "Name", "Description", "Price", "Create at", "Category");
        for (Product p : allProducts) {
            System.out.printf("%-15s %-10s %-30s %-10s %-30s %-20s\n", p.getId(), p.getName(), p.getDescription(),
                    p.getPrice(), DateUtils.format(p.getCreateAt()), p.geteCategory());
        }
    }

}
