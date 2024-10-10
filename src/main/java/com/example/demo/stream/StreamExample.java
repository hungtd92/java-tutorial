package com.example.demo.stream;

import org.springframework.util.comparator.Comparators;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> productPriceList = new ArrayList<>();
        for(Product product: productsList){

            // filtering data of list
            if(product.price<30000){
                productPriceList.add(product.price);    // adding price to a productPriceList
            }
        }
        System.out.println(productPriceList);   // displaying data

        // Collect price with condition greater than 30000
        List<Float> priceList = productsList.stream()
                .filter(x -> x.price > 30000)
                .map(p -> p.price)
                .collect(Collectors.toList());
        System.out.println(priceList);

        Stream.iterate(1, element -> element + 1)
                .filter(element -> element % 5 == 0)
                .limit(5)
                .forEach(System.out::println);

        Stream.iterate(0, e -> e + 1)
                .limit(5)
                .forEach(System.out::println);
        productsList.stream()
                .filter(p -> p.price >= 30000)
                .forEach(p -> System.out.print(p.name + "  "));
//                .map(p -> p.price)
//                .forEach(System.out::println);

        System.out.println("reduce() -------------------------------------");
        Float totalPrice = productsList.stream()
                .map(Product::getPrice)
                .reduce(0.0f,(sum, price) -> {
                    System.out.println("sum " + sum);
                    System.out.println("price " + price);
                    return sum + price;
                });
        System.out.println("totalPrice " + totalPrice);
        System.out.println("reduce() -------------------------------------");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, Integer::sum);
//                .reduce(0, (subtotal, element) -> {
//                    System.out.println("subtotal " + subtotal);
//                    System.out.println("element " + element);
////                    int i = subtotal + element;
////                    return i;
//                    if (element >= 5) {
//                        return subtotal + element;
//                    }
//                    return subtotal;
//                });
        System.out.println("result " + result);
        System.out.println("reduce() -------------------------------------");
        int result1 = numbers
                .stream()
                .reduce(0, (subtotal, element) -> {
                    System.out.println("subtotal " + subtotal);
                    System.out.println("element " + element);
                    int i = subtotal + element;
                    return i;
                });
        System.out.println("result1 " + result1);
        System.out.println("reduce() -------------------------------------");
        int result2 = numbers
                .stream()
                .reduce(0, (subtotal, element) -> {
                    System.out.println("subtotal " + subtotal);
                    System.out.println("element " + element);
                    if (element >= 5) {
                        return subtotal + element;
                    }
                    return subtotal;
                });
        System.out.println("result2 " + result2);
        System.out.println("reduce() -------------------------------------");

        double totalPriceCollect = productsList.stream()
                .collect(Collectors.summingDouble(p -> p.price));
        System.out.println("totalPriceCollect " + totalPriceCollect);

        System.out.println("max(), min() -------------------------------------");

        Product productA = productsList.stream()
//                .max((product1, product2)->product1.price > product2.price ? 1: -1)
                .max((p1, p2) -> Comparators.comparable().compare(p1.price, p2.price))
                .get();
        System.out.println(productA.price);
        // min() method to get min Product price
        Product productB = productsList.stream()
//                .min((product1, product2)->product1.price > product2.price ? 1: -1)
                .min((p1, p2) -> Comparators.comparable().compare(p1.price, p2.price))
                .get();
        System.out.println(productB.price);
        int max = numbers.stream().max((n1, n2) -> Comparators.comparable().compare(n1, n2)).get();
        int min = numbers.stream().min((n1, n2) -> Comparators.comparable().compare(n1, n2)).get();
        System.out.println("max " + max + " - min " + min);

        System.out.println("toSet -------------------------------------");
        Set<Float> priceSet = productsList.stream()
                .filter(p -> p.price < 30000)
                .map(p -> p.price)
                .collect(Collectors.toSet());
        System.out.println(priceSet);

        System.out.println("toMap -------------------------------------");
        Map<Integer, String> productMap = productsList.stream()
                .collect(Collectors.toMap(p -> p.id, p -> p.name));
        System.out.println(productMap);

        System.out.println("peek() -------------------------------------");
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        System.out.println("flatMap() -------------------------------------");
        var nestedNumbers =  Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );
        var flattenedNumber = nestedNumbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("flatMap result: " + flattenedNumber);


    }
}
