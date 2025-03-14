package animalClassesStructure.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClassesStructure.Animal;
import animalClassesStructure.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClassesStructure.herbivore.Mouse;

public class MouseFabric implements AbstractAnimalFabric {
    @Override
    public Animal createAnimal() {
        return new Mouse();
    }
}
