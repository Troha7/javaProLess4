package ua.hillelit.lms.model;

public class Dog extends Animal {

    private static int count;
    private final String className = this.getClass().getSimpleName();
    public Dog(String name) {
        super(name);
        count++;
    }

    public static void printCount(){
        System.out.println("Number of dogs: " + count);
    }

    @Override
    public void run(int runDistance) {
        super.run(runDistance);
        int maxRunDistance = 500;
        if(runDistance >= 0 && runDistance <= maxRunDistance)
            System.out.println(this.className + " " + super.getName() + " ran " + runDistance + " m.");
        else
            System.out.println(this.className + " [Run distance set incorrectly!]");
    }

    @Override
    public void swim(int swimDistance) {
        super.swim(swimDistance);
        int maxRunDistance = 10;
        if(swimDistance >= 0 && swimDistance <= maxRunDistance)
            System.out.println(this.className + " " + super.getName() + " swim " + swimDistance + " m.");
        else
            System.out.println(this.className + " [Swim distance set incorrectly!]");
    }

}
