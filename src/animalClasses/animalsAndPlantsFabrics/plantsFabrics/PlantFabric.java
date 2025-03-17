package animalClasses.animalsAndPlantsFabrics.plantsFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsAndPlantsFabrics.AbstractAnimalFabric;
import animalClasses.plants.Plant;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class PlantFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland) {
        ArrayList<Animal> plantList = new ArrayList<>();
        int count = 5000;
        for(int i = 0; i < count; i++){
            plantList.add(new Plant(lineNum, numInLine, creatingIsland));
        }

        return plantList;
    }
}
