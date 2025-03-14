package animalClassesStructure.animalsOrPlantsFabrics.carnivorousesFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.carnivorous.Fox;

public class FoxFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Fox();
    }
}
