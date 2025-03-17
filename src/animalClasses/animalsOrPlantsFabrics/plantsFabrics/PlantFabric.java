package animalClasses.animalsOrPlantsFabrics.plantsFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.plants.Plant;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class PlantFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> plantList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Plant().getMaxCount());
        for(int i = 1; i < count; i++){
            plantList.add(new Plant());
        }

        return plantList;
    }
}
