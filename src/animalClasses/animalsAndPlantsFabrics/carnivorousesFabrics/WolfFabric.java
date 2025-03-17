package animalClasses.animalsAndPlantsFabrics.carnivorousesFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsAndPlantsFabrics.AbstractAnimalFabric;
import animalClasses.carnivorous.Wolf;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class WolfFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland) {
        ArrayList<Animal> wolfList = new ArrayList<>();
        int count = RandomSingleton.randomizer.nextInt(0,new Wolf(lineNum, numInLine, creatingIsland).getMaxCount()+1);
        for(int i = 1; i < count; i++){
            wolfList.add(new Wolf(lineNum, numInLine, creatingIsland));
        }
        return wolfList;
    }
}
