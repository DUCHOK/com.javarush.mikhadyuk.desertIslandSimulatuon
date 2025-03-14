package animalClassesStructure.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.herbivore.Duck;

public class DuckFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Duck();
    }
}
