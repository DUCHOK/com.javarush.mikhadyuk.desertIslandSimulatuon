package animalClassesStructure.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.herbivore.Goat;

public class GoatFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Goat();
    }
}
