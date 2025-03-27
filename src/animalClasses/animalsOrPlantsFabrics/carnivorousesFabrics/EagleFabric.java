package animalClasses.animalsOrPlantsFabrics.carnivorousesFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.carnivorous.Eagle;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class EagleFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> eagleList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Eagle().getMaxCount());
        for(int i = 1; i < count; i++){
            eagleList.add(new Eagle());
        }
        return eagleList;
    }
}
