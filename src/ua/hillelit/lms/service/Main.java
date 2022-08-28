package ua.hillelit.lms.service;

import ua.hillelit.lms.model.Animal;
import ua.hillelit.lms.model.Cat;
import ua.hillelit.lms.model.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(500);
        dogBobik.swim(10);

        Dog dogSharik = new Dog("Sharik");
        dogSharik.run(510);
        dogSharik.swim(5);

        Dog dogTuzik = new Dog("Tuzik");
        dogTuzik.run(150);
        dogTuzik.swim(13);

        Cat catMurchik = new Cat("Murchik");
        catMurchik.run(200);
        catMurchik.swim(1);

        Cat catPushok = new Cat("Pushok");
        catPushok.run(250);
        catPushok.swim(5);

        Animal.printCount();
        Dog.printCount();
        Cat.printCount();

    }
}

