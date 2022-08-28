package ua.hillelit.lms.model;

public class Animal {

    private final String name;
    private static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public static void printCount(){
        System.out.println("Number of animals: " + count);
    }
    public String getName() {
        return name;
    }

    public void run(int runDistance){
    }
    public void swim(int swimDistance){
    }

}
