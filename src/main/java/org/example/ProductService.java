package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }
        return null;
    }

    public List<Product> getProductWithText(String text){
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){

            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();

            if(name.contains(str) || type.contains(str) || place.contains(str)){
                prods.add(p);
            }
        }
        return prods;
    }

    public List<Product> getProductsAt(String place){
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            if(place.equals(p.getPlace()))
                    prods.add(p);
        }

        return prods;
    }

    public List<Product> getProductsOutOfWarranty(){
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            if(p.getWarranty() < 2023)
                prods.add(p);
        }

        return prods;
    }
}