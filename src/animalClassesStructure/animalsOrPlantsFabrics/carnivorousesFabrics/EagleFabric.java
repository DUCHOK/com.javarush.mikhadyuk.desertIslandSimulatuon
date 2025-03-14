package animalClassesStructure.animalsOrPlantsFabrics.carnivorousesFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.carnivorous.Eagle;

public class EagleFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Eagle();
    }
}
