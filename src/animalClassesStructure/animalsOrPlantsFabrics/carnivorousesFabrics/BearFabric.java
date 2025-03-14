package animalClassesStructure.animalsOrPlantsFabrics.carnivorousesFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.carnivorous.Bear;

public class BearFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Bear();
    }
}
