package animals;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "meow meow";
    }

    @Override
    public String howToEat() {
        return "hấp";
    }
}
