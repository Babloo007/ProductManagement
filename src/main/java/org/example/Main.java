package org.example;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product("Type C","Cable" ,"Black Drawer" ,2024 ));
        service.addProduct(new Product("Mac Studio","Computer" ,"White Table" ,2025 ));
        service.addProduct(new Product("Focusrite Mixer","Audio System" ,"White Table" ,2025 ));
        service.addProduct(new Product("Asus Vivobook","Laptop" ,"Brown Drawer" ,2021 ));
        service.addProduct(new Product("Asus Rog","Laptop" ,"Black Table" ,2021 ));
        service.addProduct(new Product("Macbook Pro","Laptop" ,"Brown Drawer" ,2022 ));
        service.addProduct(new Product("Wacom Pad","Writing Pad" ,"Black Drawer" ,2020 ));
        service.addProduct(new Product("Apple Keyboard","Keyboard" ,"White Table" ,2022 ));
        service.addProduct(new Product("Logitech Keyboard","Keyboard" ,"Black Table" ,2024 ));
        service.addProduct(new Product("HDMI Cable","Cable" ,"Black Drawer" ,2024 ));
        service.addProduct(new Product("Java Black Book","Cable" ,"Shelf" ,2024 ));
        service.addProduct(new Product("Logitech Mouse","Mouse" ,"Black Table" ,2022 ));
        service.addProduct(new Product("Apple Mouse","Mouse" ,"White Table" ,2022 ));
        service.addProduct(new Product("Lenovo Mouse","Mouse" ,"Black Drawer" ,2022 ));
        service.addProduct(new Product("BlackBeast","Computer" ,"White Table" ,2022 ));

        List<Product> products = service.getAllProducts();

//        for(Product p : products) {
//            System.out.println(p);
//        }

//        Stream<Product> stm = products.stream();
//        stm.forEach(System.out::println);

//        System.out.println("###########################################################");
//        System.out.println("a particular product by name");
//
//        Product prod = service.getProduct("Logitech Mouse");
//        System.out.println(prod);

//        System.out.println("###########################################################");
//        System.out.println("a particular product by color");
//
//        List<Product> prods = service.getProductWithText("black");
//        for(Product p : prods){
//            System.out.println(p);
//        }

//        Stream<Product> stm = prods.stream();
//        stm.forEach(System.out::println);

//        System.out.println("###########################################################");
//        System.out.println("a particular products by place");
//
//        List<Product> prods = service.getProductsAt("White Table");
//        for(Product p : prods){
//            System.out.println(p);
//        }

//        Stream<Product> stm = prods.stream();
//        stm.forEach(System.out::println);

//        System.out.println("###########################################################");
//        System.out.println("a particular products out of warranty");
//
        List<Product> prods = service.getProductsOutOfWarranty();
//        for(Product p : prods){
//            System.out.println(p);
//        }

        Stream<Product> stm = prods.stream();
        stm.forEach(System.out::println);
    }
}