import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Ключ 1", "1");
        map.put("Ключ 2", "2");
        map.put("Ключ 3", "3");

        System.out.println(map.values());
    }
}