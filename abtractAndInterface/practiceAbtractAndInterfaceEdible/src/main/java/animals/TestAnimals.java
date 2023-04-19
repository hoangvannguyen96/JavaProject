package animals;
import animals.Chicken;
import animals.Tiger;
import edible.Edible;
public class TestAnimals {
    public static void main(String[] args) {
        Animal animal []=new Animal[2];
        animal[0]=new Chicken();
        animal[1]=new Tiger();
        for(int i=0;i<animal.length;i++){
            System.out.println(animal[i].makeSound());
            if(animal[i] instanceof Chicken){
                Edible edible =(Chicken) animal[i];
                System.out.println(edible.howToEat());}
                if(animal[i] instanceof Tiger){
                    Edible edible =(Tiger) animal[i];
                    System.out.println(edible.howToEat());
            }
        }
    }

}
