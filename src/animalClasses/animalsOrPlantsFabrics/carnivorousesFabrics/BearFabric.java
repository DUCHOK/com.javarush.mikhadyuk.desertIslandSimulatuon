package animalClasses.animalsOrPlantsFabrics.carnivorousesFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.carnivorous.Bear;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class BearFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> bearList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Bear().getMaxCount());
        for(int i = 1; i < count; i++){
            bearList.add(new Bear());
        }
        return bearList;
    }
}
