import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {

        HashSet<String> hashSet = fillHashSet();

        String newElement = "2";
        // Check if the element is part of the Set
        boolean present = hashSet.contains(newElement);

        if (present) {
            System.out.println("The element is present in the HashSet.");
        } else {
            System.out.println("The element is not present in the HashSet.");
        }
    }

    // Create a method that fill the HashSet
    public static HashSet<String> fillHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");

        return hashSet;
    }
}