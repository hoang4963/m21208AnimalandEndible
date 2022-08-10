package animal;

import endible.Endible;

import endible.Endible;

public class Chicken extends Animal implements Endible {
    @Override
    public String makeSound(){
        return "Chicken: Cuc ta Cuc tac";
    }
    @Override
    public String howToEat(){
        return "Could be fried";
    }
}
