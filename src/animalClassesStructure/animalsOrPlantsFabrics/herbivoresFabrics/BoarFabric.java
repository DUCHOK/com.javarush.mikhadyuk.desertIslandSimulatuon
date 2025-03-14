package animalClassesStructure.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.herbivore.Boar;

public class BoarFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Boar();
    }
}
