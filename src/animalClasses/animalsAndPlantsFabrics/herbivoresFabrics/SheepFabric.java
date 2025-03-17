package animalClasses.animalsAndPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsAndPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Sheep;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class SheepFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland) {
        ArrayList<Animal> sheepList = new ArrayList<>();
        int count = RandomSingleton.randomizer.nextInt(0,new Sheep(lineNum, numInLine, creatingIsland).getMaxCount()+1);
        for(int i = 1; i < count; i++){
            sheepList.add(new Sheep(lineNum, numInLine, creatingIsland));
        }
        return sheepList;
    }
}
