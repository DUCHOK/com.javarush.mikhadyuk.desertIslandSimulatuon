package animalClassesStructure.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.herbivore.Sheep;

public class SheepFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Sheep();
    }
}
