package animalClassesStructure.animalsOrPlantsFabrics.plantsFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.plants.Plant;

public class PlantFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Plant();
    }
}
