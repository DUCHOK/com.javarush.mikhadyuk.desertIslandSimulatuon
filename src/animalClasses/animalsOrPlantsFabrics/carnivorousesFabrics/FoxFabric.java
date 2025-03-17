package animalClasses.animalsOrPlantsFabrics.carnivorousesFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.carnivorous.Fox;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class FoxFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> foxList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Fox().getMaxCount());
        for(int i = 1; i < count; i++){
            foxList.add(new Fox());
        }
        return foxList;
    }
}
