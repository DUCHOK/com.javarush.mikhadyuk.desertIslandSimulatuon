package animalClassesStructure.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.herbivore.Deer;

public class DeerFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Deer();
    }
}
