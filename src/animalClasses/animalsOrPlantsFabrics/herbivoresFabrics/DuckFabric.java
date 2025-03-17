package animalClasses.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Duck;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class DuckFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> duckList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Duck().getMaxCount());
        for(int i = 1; i < count; i++){
            duckList.add(new Duck());
        }
        return duckList;
    }
}
