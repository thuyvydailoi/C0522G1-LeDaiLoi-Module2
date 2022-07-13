package ss07_abstractclass_interface.practice.animeal_interface_edible.animal;

import ss07_abstractclass_interface.practice.animeal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }

    public String howToEat(){
        return  "could be fried";
    }

}
