import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Foo {
    String bar() {
        return "soap";
    }
}

class Vehicle {
    String color;
    int vin;

    Vehicle(int vin, String color) {
        this.vin = vin;
        this.color = color;
    }

    public String toString() {
        return String.format("%d - %s", this.vin, this.color);
    }
}

public class Expressive {
    public static void main(String[] args) {
        System.out.println("EXPRESSIVE");
        var v = 123;
        var s2 = "ABC";
        var b = new Foo();

        //does something, takes no parameters and returns nothing
//        Runnable f = () -> System.out.println("fun");
//
//        System.out.println(v);
//        System.out.println(s2);
//        System.out.println(b.bar());
//
//        f.run();
//        f.run();
//        f.run();

        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6);

        //GET TOTAL - 21?
//        int total = 0;
//        for(int n : numbers){
//            total += n;
//        }
//        System.out.println(total);

        //Accumulate running total abbr acc or just a
//        System.out.println(numbers.stream().reduce(0, (a, n) -> n + a));
//        System.out.println(numbers.stream().filter(n -> n > 4).reduce(0, (a, n) -> n + a));
//        numbers above 4 are worth double
//        System.out.println(numbers.stream().reduce(0, (a, n) -> (n < 5 ? n : 2 * n) + a)); //32?

        // CSV ["Apple", "Banana", "Cherry"]
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple-tini");
        fruit.add("Banana Split");
        fruit.add("Cherry, Soda");

        //map is used for transform
        System.out.println(fruit.stream().map(s -> String.format("\"%s\"", s)).collect(Collectors.joining(",")));

//        System.out.println(String.join(", ", fruit));

//        List<Vehicle> cars = new ArrayList<>();
//        cars.add(new Vehicle(111, "red"));
//        cars.add(new Vehicle(222, "black"));
//        cars.add(new Vehicle(333, "black"));

        //cars.stream().filter((c)->c.color.contains("bl")).forEach(System.out::println);


//        Function<Integer, Integer> square = (x) -> x * x;
//        System.out.println(square.apply(12));
//        numbers.stream().map(square).forEach(System.out::println);
//        numbers.stream().map((x) -> x * x).forEach(System.out::println);

//        Predicate<Integer> isEven = (e) -> e % 2 == 0;
//        numbers.stream().filter(isEven).forEach(System.out::println);
//        numbers.stream().filter((e) -> e % 2 == 0).forEach(System.out::println);
        //squares of even numbers
//        numbers.stream().filter((e) -> e % 2 == 0).map((n)->n*n).forEach(System.out::println);


//        for(Integer i : numbers){
//            System.out.println(square.apply(i));
//        }

    }
}
