import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");

        set.clear();

        System.out.println(set);
    }
}