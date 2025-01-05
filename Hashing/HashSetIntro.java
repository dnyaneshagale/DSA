import java.util.HashSet;

public class HashSetIntro {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(4);
        set.add(2);
        set.add(6);
        set.add(1);  //Not Added
        set.add(6); //Not Added

        System.out.println(set.contains(4) ? "It contains 4" : "False");

        set.remove(4);

        System.out.println(set.contains(4) ? "It contains 4" : "Don't Contains 4");

        System.out.println(set.size());

        set.clear();

        System.out.println(set.isEmpty());
    }
}
