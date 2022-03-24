package List_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                               .map(Double::parseDouble)
                               .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() ; i++) {
            if (numbers.get(i).equals(numbers.get(i+1))) {
                numbers.set(i,numbers.get(i) + numbers.get(i+1));
                numbers.remove(i+1);
                i=-1;
            }
        }
        for (Double items:numbers) {
            System.out.println(numbers + " ");
        }
    }
}
