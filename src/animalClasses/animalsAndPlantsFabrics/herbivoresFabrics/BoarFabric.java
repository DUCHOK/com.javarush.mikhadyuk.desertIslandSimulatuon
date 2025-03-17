package animalClasses.animalsAndPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsAndPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Boar;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class BoarFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland) {
        ArrayList<Animal> boarList = new ArrayList<>();
        int count = RandomSingleton.randomizer.nextInt(0,new Boar(lineNum, numInLine, creatingIsland).getMaxCount()+1);
        for(int i = 1; i < count; i++){
            boarList.add(new Boar(lineNum, numInLine, creatingIsland));
        }
        return boarList;
    }
}
