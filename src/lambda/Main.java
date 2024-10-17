package lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.time.*;
import java.util.Date;
import java.util.Comparator;


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

        //mobileProducts.forEach(product ->{
        //    System.out.println(product);
        //});

        List<Person> people = new ArrayList<>();
        LocalDate ld = LocalDate.of(1990,1,12);
        Date date = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
        people.add(new Person(1L, "Bob", "Ong", 30000, date));
        people.add(new Person(1L, "Fred", "Ong", 20000, date));
        people.add(new Person(1L, "Tom", "Tan", 10000, date));        people.add(new Person(1L, "Harry", "Ong", 40000, date));
        people.add(new Person(1L, "Dennis", "Ng", 40000, date));
        people.add(new Person(1L, "Chris", "Lim", 40000, date));

        //Comparing 1 way
        //Comparator<Person> compare = Comparator.comparing(p -> p.getFirstName());
        //people.sort(compare.reversed());

        //people.forEach(person ->{
        //    System.out.println(person);
        //});

        //Compare using multiple items
        Comparator<Person> compareMultiple = Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName);
        people.sort(compareMultiple);

        //people.forEach(person ->{
        //    System.out.println(person);
        //});


        MyInterface<Integer> addOperation = (a,b) -> {
            return a + b;
        };

        MyInterface<Integer> multiplyOperation = (a,b) -> {
            return a * b;
        };

        System.out.println("add: " + addOperation.process(2,4));
        System.out.println("multiply: " + multiplyOperation.process(2,4));



    }
}
