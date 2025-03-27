package animalClasses.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Buffalo;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class BuffaloFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> buffaloList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Buffalo().getMaxCount());
        for(int i = 1; i < count; i++){
            buffaloList.add(new Buffalo());
        }
        return buffaloList;
    }
}
