package animalClasses.animalsAndPlantsFabrics.carnivorousesFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsAndPlantsFabrics.AbstractAnimalFabric;
import animalClasses.carnivorous.Fox;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;
import java.util.Random;

public class FoxFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland) {
        ArrayList<Animal> foxList = new ArrayList<>();
        int count = new Random().nextInt(0,new Fox(lineNum, numInLine, creatingIsland).getMaxCount()+1);
        for(int i = 1; i < count; i++){
            foxList.add(new Fox(lineNum, numInLine, creatingIsland));
        }
        return foxList;
    }
}
