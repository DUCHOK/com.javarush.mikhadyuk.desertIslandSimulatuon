package animalClasses.animalsOrPlantsFabrics.carnivorousesFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.carnivorous.Wolf;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class WolfFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> wolfList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Wolf().getMaxCount());
        for(int i = 0; i < count; i++){
            wolfList.add(new Wolf());
        }
        return wolfList;
    }
}
