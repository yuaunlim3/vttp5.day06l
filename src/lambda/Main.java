package lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        //Add the products
        products.add(new Product(1L, "Apple Ipad", "Tablet", "Computer"));
        products.add(new Product(2L, "Logitec Mouse", "Mouse", "Computer"));
        products.add(new Product(3L, "Huawei 5", "Huawei Phone", "Mobile"));
        products.add(new Product(4L, "Galaxy S24", "Samsung Phone", "Mobile"));
        products.add(new Product(5L, "Iphone 15", "Apple Phone", "Mobile"));
        products.add(new Product(6L, "32 inch monitor", "Samsung Monitor", "Computer"));

        //products.forEach(product -> {
        //    System.out.println(product);
        //} );

        //Alternative method to print
        //products.forEach(Product::toString);

        //only retrieve products with category 'Mobile'
        //Using stream and lambda

        List<Product> mobileProducts = new ArrayList<>();
        mobileProducts = products
                .stream()
                .filter(product -> product.getCategory().equals("Mobile"))
                .collect(Collectors.toList());

        mobileProducts.forEach(product ->{
            System.out.println(product);
        });
    }
}
