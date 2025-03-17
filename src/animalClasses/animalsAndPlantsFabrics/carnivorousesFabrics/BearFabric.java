package animalClasses.animalsAndPlantsFabrics.carnivorousesFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsAndPlantsFabrics.AbstractAnimalFabric;
import animalClasses.carnivorous.Bear;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class BearFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland) {
        ArrayList<Animal> bearList = new ArrayList<>();
        int count = RandomSingleton.randomizer.nextInt(0,new Bear(lineNum, numInLine, creatingIsland).getMaxCount()+1);
        for(int i = 1; i < count; i++){
            bearList.add(new Bear(lineNum, numInLine, creatingIsland));
        }
        return bearList;
    }
}
