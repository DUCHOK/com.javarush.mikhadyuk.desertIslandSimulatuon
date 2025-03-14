package animalClassesStructure.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.herbivore.Caterpillar;

public class CaterpillarFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Caterpillar();
    }
}
