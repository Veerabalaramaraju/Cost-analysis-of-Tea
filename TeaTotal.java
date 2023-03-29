import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TeaTotal {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Green Tea", 2022, 10));
        products.add(new Product("Black Tea", 2022, 5));
        products.add(new Product("Herbal Tea", 2021, 8));
        products.add(new Product("Iced Tea", 2021, 12));
        products.add(new Product("Chai Tea", 2023, 15));
        
        Map<Integer, Double> teaTotalsByYear = products.stream()
                .filter(p -> p.getName().contains("Tea"))
                .collect(Collectors.groupingBy(Product::getYear, Collectors.summingDouble(Product::getPrice)));
        
        System.out.println("Tea totals by year:");
        teaTotalsByYear.forEach((year, total) -> System.out.println(year + ": " + total));
    }
}

