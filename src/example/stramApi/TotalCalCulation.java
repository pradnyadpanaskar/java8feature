package example.stramApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TotalCalCulation {
    public static void main(String[] args) {
        List<Map<String, Object>> employees = Arrays.asList(
                Map.of("name", "Alice", "salary", 300000, "city", "New York"),
                Map.of("name", "Bob", "salary", 450000, "city", "Los Angeles"),
                Map.of("name", "Charlie", "salary", 460000, "city", "Chicago")
        );

        int totalSalary = employees.stream()
                .filter(a -> a.containsKey("salary")) // Ensure the map has a "salary" key
                .mapToInt(a -> Integer.parseInt(a.get("salary").toString())) // Extract and parse salary
                .sum();
        System.out.println("Total Salary of employees  are "+ totalSalary);
    }
}
