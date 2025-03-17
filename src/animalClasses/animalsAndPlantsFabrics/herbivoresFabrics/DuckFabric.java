package animalClasses.animalsAndPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsAndPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Duck;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class DuckFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland) {
        ArrayList<Animal> duckList = new ArrayList<>();
        int count = RandomSingleton.randomizer.nextInt(0,new Duck(lineNum, numInLine, creatingIsland).getMaxCount()+1);
        for(int i = 1; i < count; i++){
            duckList.add(new Duck(lineNum, numInLine, creatingIsland));
        }
        return duckList;
    }
}
