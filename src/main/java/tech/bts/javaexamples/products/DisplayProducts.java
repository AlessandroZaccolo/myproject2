package tech.bts.javaexamples.products;

import tech.bts.javaexamples.StringUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayProducts {

    public static void main(String[] args) {

        Product p1 = new Product( "iPhone", 1500,true);
        Product p2 = new Product( "mouse",  8,  true);
        Product p3 = new Product( "cake",  25,  false);


        List<Product> products = new ArrayList<>();

        products.add(p1);
        products.add(p2);
        products.add(p3);

        int columnWidth = 10;

        List<String> fieldNames = Arrays.asList("Name", "Price", "Available");

        String title = "";
        for (String fieldName : fieldNames) {
            title += StringUtil.padRight(fieldName, columnWidth);
        }


        String line = StringUtil.repeatString("-", columnWidth * fieldNames.size());


        System.out.println(title);
        System.out.println(line);

        for (Product product : products) {
            String productLine =
                    StringUtil.padRight(product.getName(), columnWidth)
                            +StringUtil.padRight( "" + product.getPrice(), columnWidth)
                            +StringUtil.padRight( "" + product.isAvailable(), columnWidth);

            System.out.println(productLine);

        }










    }
}
