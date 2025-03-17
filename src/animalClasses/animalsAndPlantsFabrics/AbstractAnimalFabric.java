package animalClasses.animalsAndPlantsFabrics;

import animalClasses.animalClassesStructure.Animal;
import ilandStructure.Island;

import java.util.ArrayList;

public interface AbstractAnimalFabric {
    ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland);
}
