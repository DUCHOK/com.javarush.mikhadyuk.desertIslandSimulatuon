package animalClassesStructure.animalsOrPlantsFabrics.carnivorousesFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.carnivorous.Boa;

public class BoaFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Boa();
    }
}
