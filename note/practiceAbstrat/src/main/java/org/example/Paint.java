package org.example;

import java.util.*;

import static java.util.Arrays.copyOf;

public class Paint {
    public static Shape[] shapes = new Shape[5];

    public static void main(String[] args) {
        shapes[0] = new Circle(5, "RED", true);
        shapes[1] = new Rectangle(4, 5, "RED", true);
        shapes[2] = new Rectangle(5, 5, "RED", false);
        shapes[3] = new Circle(6, "BLACK", false);
        shapes[4] = new Rectangle(7, 1, "RED", true);

        fixShape(0, shapes);


//         Thêm 1 hình học: cho lựa chọn hình khi thêm
//         Sửa 1 hình học
//         Xóa 1 hình học tại vị trí index
//         Sắp xếp các hình học tăng dần theo diện tích, theo màu, theo bán kính, theo tên
//         Tính tổng diện tích của tất cả các hình
//         Tính tổng diện tích của tất cả các hình có màu đỏ và đã được tô màu
//         Tìm các hình học theo màu, theo trạng thái đã được tô hay chưa
//
    }

    // Câu 3:
    public static void deleteShapesViews() {
        shapes = deleteShape(2, shapes);
    }


    // Câu 0:
    public static void resizeShapesView(Shape[] shapes) {
        System.out.println(Arrays.toString(shapes));
        resizeShapes(shapes);
        System.out.println(Arrays.toString(shapes));
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
            shapesNew[j] = shapes[i];
            j++;
        }
        return shapesNew;
    }

    //câu 1
    public static Shape[] addShape(int index, Shape[] shape) {
        Shape[] shape1 = new Shape[shape.length + 1];
        if (index >= 0) System.arraycopy(shape, 0, shape1, 0, index);
        shape1[index] = new Rectangle(3, 4);
        if (shape.length - index >= 0) System.arraycopy(shape, index, shape1, index + 1, shape.length - index);
        return shape1;
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

    public static double totalAreaColor(Shape[] shape, String color, boolean boo) {
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
                                System.out.println("hình ban đầu của bạn là "+shape[index]);
                                shape[index] = new Rectangle(width, height);
                                System.out.println("hình của bạn lúc này là "+shape[index]);
                                break;
                            case 2:
                                System.out.println("Step");
                                action=false;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }
        }
    }
}



