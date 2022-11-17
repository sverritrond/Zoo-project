import java.util.HashMap;

/*ideas: buy more than one animal, 
breed animals, 
add stores to the zoo, 
add the option to buy tickets or plan trips in general to  specific zoo, 
give the zoo a name, 
limit the amount of space a zoo has for animals and check it when they want to buy one*/

public class Zoo {
    
    HashMap<Animal, Integer> animals;

    public Zoo() {
        animals = new HashMap<Animal, Integer>();
    }

    public void buyAnimal(Animal animal) {
        animals.put(animal, 1);
    }

}
