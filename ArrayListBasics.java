import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        // Part A: String ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add fruits 
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");

        System.out.println("Fruits: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Element at index 2: " + fruits.get(2));

        // Change element at index 1
        fruits.set(1, "Blueberry");

        // Remove "Grape"
        fruits.remove("Grape");

        System.out.println("Fruits after changes: " + fruits);

        // Part B: Integer ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Insert 25 at index 2
        numbers.add(2, 25);

        // Remove 40
        numbers.remove(Integer.valueOf(40));

        // Calculate sum and average
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        double average = sum / (double) numbers.size();

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}