package animalClasses.animalsAndPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsAndPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Goat;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class GoatFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland) {
        ArrayList<Animal> goatList = new ArrayList<>();
        int count = RandomSingleton.randomizer.nextInt(0,new Goat(lineNum, numInLine, creatingIsland).getMaxCount()+1);
        for(int i = 1; i < count; i++){
            goatList.add(new Goat(lineNum, numInLine, creatingIsland));
        }
        return goatList;
    }
}
