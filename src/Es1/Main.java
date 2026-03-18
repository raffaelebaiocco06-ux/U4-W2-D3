package Es1;
import java.util.*;
import java.util.stream.Stream;
import java.time.LocalDate;

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
        List<Order> orders = Arrays.asList(

                new Order(
                        13,
                        LocalDate.now(),
                        LocalDate.now().plusDays(2),
                        Arrays.asList(products.get(0), products.get(1)),
                        c1
                ),

                new Order(
                        24,
                        LocalDate.now(),
                        LocalDate.now().plusDays(3),
                        Arrays.asList(products.get(4), products.get(6)),
                        c2
                ),

                new Order(
                        35,
                        LocalDate.now(),
                        LocalDate.now().plusDays(1),
                        Arrays.asList(products.get(8), products.get(11)),
                        c3
                ),

                new Order(
                        46,
                        LocalDate.now(),
                        LocalDate.now().plusDays(4),
                        Arrays.asList(products.get(0), products.get(7), products.get(10)),
                        c1
                )
        );


        //inizio della STREAM-------------------------------------------------------------------------------------------------------------------------------------------
        Stream<String> ES1= products.stream()
                .filter(n -> n.getPrice() > 100 && n.getCategory().equals("Books"))
                .map(n-> n.getName());
ES1.forEach(n-> System.out.println(n));


//es2
        Stream<Order> ES2= orders.stream().filter( o-> o.getProducts().stream().anyMatch(p->p.getCategory().equals("Baby"))) ;
        ES2.forEach(n-> System.out.println(" nome del prodotto " + n));
//es3




    }
}
