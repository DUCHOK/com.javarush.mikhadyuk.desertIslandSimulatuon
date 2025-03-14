package animalClassesStructure.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.herbivore.Rabbit;

public class RabbitFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Rabbit();
    }
}
