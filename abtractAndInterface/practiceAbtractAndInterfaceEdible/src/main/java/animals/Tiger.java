package animals;

import edible.Edible;

public class Tiger extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "gâu gâu";
    }

    @Override
    public String howToEat() {
        return "nấu cao";
    }
}
