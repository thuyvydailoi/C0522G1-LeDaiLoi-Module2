package ss07_abstractclass_interface.practice.animeal_interface_edible.animal;

import ss07_abstractclass_interface.practice.animeal_interface_edible.edible.Edible;
import ss07_abstractclass_interface.practice.animeal_interface_edible.fruit.Apple;
import ss07_abstractclass_interface.practice.animeal_interface_edible.fruit.Fruit;
import ss07_abstractclass_interface.practice.animeal_interface_edible.fruit.Orange;

public class AbstractAndlnterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
