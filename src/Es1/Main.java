package Es1;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
      Customer c1 =new Customer(1010,"Mauro",1);
        Customer c2 =new Customer(2020,"Mara",1);
        Customer c3 =new Customer(3030,"Maurizio",1);



        List<Product> products = Arrays.asList(
                new Product(1, "Libro Java", 120.0, "Books"),
                new Product(2, "Libro Python", 150.0, "Books"),
                new Product(3, "Libro C++", 90.0, "Books"),
                new Product(4, "Romanzo", 45.0, "Books"),

                new Product(5, "Pannolini", 30.0, "Baby"),
                new Product(6, "Biberon", 15.0, "Baby"),
                new Product(7, "Passeggino", 200.0, "Baby"),
                new Product(8, "Giocattolo neonato", 25.0, "Baby"),

                new Product(9, "Maglietta Boys", 20.0, "Boys"),
                new Product(10, "Pantaloni Boys", 35.0, "Boys"),
                new Product(11, "Scarpe Boys", 80.0, "Boys"),
                new Product(12, "Giacca Boys", 110.0, "Boys")
        );
        Stream<String> ES1= products.stream()
                .filter(n -> n.getPrice() > 100 && n.getCategory().equals("Books"))
                .map(n-> n.getName());
ES1.forEach(n-> System.out.println(n));

    }
}
