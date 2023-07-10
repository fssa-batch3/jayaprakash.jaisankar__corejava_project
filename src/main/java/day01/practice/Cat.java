package day01.practice;

public class Cat {
    // Attributes
    private int age;
    private String color;

    // Getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to make the cat speak
    public void speak() {
        System.out.println("Meow!");
    }

    // Main method to create Cat objects
    public static void main(String[] args) {
        // Create two Cat objects
        Cat cat1 = new Cat();
        cat1.setAge(4);
        cat1.setColor("White");

        Cat cat2 = new Cat();
        cat2.setAge(3);
        cat2.setColor("Black");

        // Print the attributes of each Cat
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
        System.out.print("Speaks: ");
        cat1.speak();

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " + cat2.getColor());
        System.out.print("Speaks: ");
        cat2.speak();
    }
}
