package animalClassesStructure.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.herbivore.Buffalo;

public class BuffaloFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Buffalo();
    }
}
