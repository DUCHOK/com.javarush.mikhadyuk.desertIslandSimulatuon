package animalClasses.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Horse;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class HorseFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> horseList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Horse().getMaxCount());
        for(int i = 1; i < count; i++){
            horseList.add(new Horse());
        }
        return horseList;
    }
}
