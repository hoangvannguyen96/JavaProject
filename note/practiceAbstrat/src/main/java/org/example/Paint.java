package org.example;

import java.util.*;

import static java.util.Arrays.copyOf;

public class Paint {
    public static Shape[] shapes = new Shape[5];

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        shapes[0] = new Circle(5, "RED", true);
        shapes[1] = new Rectangle(4, 5, "RED", true);
        shapes[2] = new Rectangle(5, 5, "RED", false);
        shapes[3] = new Circle(6, "BLACK", false);
        shapes[4] = new Rectangle(7, 1, "RED", true);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Thêm 1 hình học theo vị trí cho trước");
            System.out.println("2. Xóa 1 hình học tại vị trí cho trước");
            System.out.println("3. Sắp xếp hình học theo diện tích tăng dần");
            System.out.println("4. Tính tổng diện tích các hình");
            System.out.println("5. Tính tổng diện tích hình học theo màu và trạng thái");
            System.out.println("6. Tìm hình học theo màu");
            System.out.println("7. Tìm hình học theo trạng thái");
            System.out.println("8. Sắp xếp hình học theo màu tăng dần");
            System.out.println("9. Sắp xếp hình học theo bán kính tăng dần");
            System.out.println("10. Sắp xếp hình học theo tên tăng dần");
            System.out.println("11. Sửa 1 hình học theo vị trí cho trước");
            System.out.println("12. Exit");
            int choice= scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập vị trí cần thêm");
                    scanner.nextLine();
                    int index= scanner.nextInt();
                    addShape(index,shapes);
                    break;
                case 2:
                    System.out.println("Nhập vị trí cần thêm");
                    scanner.nextLine();
                    int index1= scanner.nextInt();
                   deleteShape(index1,shapes);
                   break;
                case 3:
                    area(shapes);
                    break;
                case 4:
                    totalArea(shapes);
                    break;
                case 5:
                    System.out.println("Nhập màu?");
                    scanner.nextLine();
                    String color= scanner.nextLine();
                    System.out.println("Nhập trạng thái?");
                    boolean status= scanner.nextBoolean();
                    totalAreaColorAndStatus(shapes,color,status);
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Nhập màu?");
                    String color1= scanner.nextLine();
                    findColor(shapes,color1);
                    break;
                case 7:
                    System.out.println("Nhập trạng thái?");
                    boolean status1= scanner.nextBoolean();
                    findFilled(shapes,status1);
                    break;
                case 8:
                    ascendingColor(shapes);
                    break;
                case 9:
                    ascendingRadius(shapes);
                    break;
                case 10:
                    ascendingName(shapes);
                    break;
                case 11:
                    System.out.println("Nhập vị trí cần thêm");
                    scanner.nextLine();
                    int index2= scanner.nextInt();
                    fixShape(index2,shapes);
                    break;
                case 12:
                    System.out.println("See you again!");
                    System.exit(0);
                default:
                    break;
            }
        }
    }
    public static void resizeShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(0.5);
        }
    }

    public static Shape[] deleteShape(int index, Shape[] shapes) {
        Shape[] shapesNew = new Shape[shapes.length - 1];
        for (int i = 0, j = 0; i < shapes.length; i++) {
            if (i == index) {
                continue;
            }
            shapesNew[j++] = shapes[i];
        }
        return shapesNew;
    }

    public static void addShape(int index, Shape[] shape) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("bạn muốn thêm hình gì?");
            System.out.println("1. Circle");
            System.out.println("2. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Shape[] shape1 = new Shape[shape.length + 1];
                    if (index >= 0)
                        System.arraycopy(shape, 0, shape1, 0, index);
                    System.out.println("nhập bán kính?");
                    sc.nextLine();
                    double radius = sc.nextDouble();
                    shape1[index] = new Circle(radius);
                    if (shape.length - 1 - index >= 0)
                        System.arraycopy(shape, index, shape1, index + 1, shape.length - 1 - index);
                    break;
                case 2:
                    System.out.println("goodbye!");
                    check = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static Shape[] area(Shape[] shape) {
        for (int i = 0; i < shape.length - 1; i++) {
            for (int j = 1; j < shape.length; j++) {
                if (shape[i].getArea() > shape[j].getArea()) {
                    Shape temp = shape[j];
                    shape[j] = shape[i];
                    shape[i] = temp;
                }
            }
        }
        return shape;
    }

    public static double totalArea(Shape[] shape) {
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            sum += shape[i].getArea();
        }
        return sum;
    }

    public static double totalAreaColorAndStatus(Shape[] shape, String color, boolean boo) {
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            if (shape[i].getColor() == color && shape[i].isFilled() == boo) {
                sum += shape[i].getArea();
            }
        }
        return sum;
    }

    public static String findColor(Shape[] shape, String color) {
        String str = "";
        for (int i = 0; i < shape.length; i++) {
            if (shape[i].getColor() == color) {
                str += shape[i];
            }
        }
        return str;
    }

    public static String findFilled(Shape[] shape, boolean boo) {
        String str = "";
        for (int i = 0; i < shape.length; i++) {
            if (shape[i].isFilled() == boo) {
                str += shape[i];
            }
        }
        return str;
    }

    public static String ascendingColor(Shape[] shape) {
        ComperatorColor comperatorColor = new ComperatorColor();
        Arrays.sort(shape, comperatorColor);
        return Arrays.toString(shape);
    }

    public static String ascendingRadius(Shape[] shape) {
        List<Circle> circles = new ArrayList<>();
        for (Shape shape1 : shape) {
            if (shape1 instanceof Circle) {
                circles.add((Circle) shape1);
            }
        }
        Collections.sort(circles, new ComparatorRadius());
        String str = "";
        for (Circle circle : circles) {
            str += circle;
        }
        return str;
    }

    public static String ascendingName(Shape shape[]) {
        Arrays.sort(shape, new ComparatorName());
        String str = "";
        for (Shape shape1 : shape) {
            str += shape1;
        }
        return str;
    }

    public static void fixShape(int index, Shape shape[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hình của bạn là hình " + shape[index].getClass().getSimpleName());
        while (true) {
            System.out.println("bạn muốn thay đổi gi?");
            System.out.println("1. Thay đổi kích thước");
            System.out.println("2. Thay đổi thành hình khác");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("xin mời nhập tỉ lệ muốn thay đổi (0-1)?");
                    double num = sc.nextDouble();
                    System.out.println("before " + shape[index]);
                    shape[index].resize(num);
                    System.out.println("after " + shape[index]);
                    break;
                case 2:
                    HashSet<String> set = new HashSet<>();
                    for (Shape shape1 : shape) {
                        if (!shape1.getClass().getName().equals(shape[index].getClass().getName()))
                            set.add(String.valueOf(shape1.print()));
                    }
                    System.out.println("bạn có thể thay đổi thành các hình sau " + set);
                    System.out.println("mời lựa chọn");
                    boolean action = true;
                    while (action) {
                        System.out.println("1. Rectangle");
                        System.out.println("2. Exit");
                        int choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("mời nhập width?");
                                double width = sc.nextDouble();
                                System.out.println("mời nhập height?");
                                double height = sc.nextDouble();
                                System.out.println("hình ban đầu của bạn là " + shape[index]);
                                shape[index] = new Rectangle(width, height);
                                System.out.println("hình của bạn lúc này là " + shape[index]);
                                break;
                            case 2:
                                System.out.println("Step");
                                action = false;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}



