package animalClasses.animalsAndPlantsFabrics.carnivorousesFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsAndPlantsFabrics.AbstractAnimalFabric;
import animalClasses.carnivorous.Boa;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;
import java.util.Random;

public class BoaFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland) {
        ArrayList<Animal> boaList = new ArrayList<>();
        int count = new Random().nextInt(0,new Boa(lineNum, numInLine, creatingIsland).getMaxCount()+1);
        for(int i = 1; i < count; i++){
            boaList.add(new Boa(lineNum, numInLine, creatingIsland));
        }
        return boaList;
    }
}
