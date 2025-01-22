package example.stramApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoExample {
    public static void main(String[] args) {
        List<Map<String, Object>> people = Arrays.asList(
                Map.of("name", "Alice", "age", 25, "city", "New York"),
                Map.of("name", "Bob", "age", 17, "city", "Los Angeles"),
                Map.of("name", "Charlie", "age", 30, "city", "Chicago")
        );
        List <Object> names= people.stream().map(a->a.get("name")).collect(Collectors.toList());
        System.out.println(names.toString());

        List <Object> MoreThan18Age= people.stream().
                filter(age-> age.containsKey("age") && age.get("age") !=null && Integer.parseInt(age.get("age").toString()) >18).
                collect(Collectors.toList());

        System.out.println(MoreThan18Age.toString());
    }
}
