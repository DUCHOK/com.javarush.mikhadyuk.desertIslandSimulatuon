package animalClassesStructure.animalsOrPlantsFabrics.carnivorousesFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.carnivorous.Wolf;

public class WolfFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Wolf();
    }
}
