package animalClasses.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Sheep;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class SheepFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> sheepList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Sheep().getMaxCount());
        for(int i = 1; i < count; i++){
            sheepList.add(new Sheep());
        }
        return sheepList;
    }
}
