package ua.hillelit.lms.model;

public class Cat extends Animal{

    private static int count;
    private final String className = this.getClass().getSimpleName();
    public Cat(String name) {
        super(name);
        count++;
    }

    public static void printCount(){
        System.out.println("Number of cats: " + count);
    }

    @Override
    public void run(int runDistance) {
        super.run(runDistance);
        int maxRunDistance = 200;
        if(runDistance >= 0 && runDistance <= maxRunDistance)
            System.out.println(this.className + " " + super.getName() + " ran " + runDistance + " m.");
        else
            System.out.println(this.className + " [Run distance set incorrectly!]");
    }

    @Override
    public void swim(int swimDistance) {
        super.swim(swimDistance);
        System.out.println(this.className + " [Can't swim!]");
    }
}
