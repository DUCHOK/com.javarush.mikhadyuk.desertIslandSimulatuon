package animalClassesStructure.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.herbivore.Horse;

public class HorseFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Horse();
    }
}
