package day08.practice;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameCount {
    public static void main(String[] args) {

        Map<String, Integer> nameCountMap = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        
        String[] names = input.split(",\\s*");
        for (String name : names) {
            nameCountMap.put(name.toLowerCase().trim(), nameCountMap.getOrDefault(name.toLowerCase().trim(), 0) + 1);
        }


        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            System.out.println(name + ": " + count);
        }
    }
}
