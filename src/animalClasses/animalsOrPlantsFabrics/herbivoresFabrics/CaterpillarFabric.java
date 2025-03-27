package animalClasses.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Caterpillar;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class CaterpillarFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> caterpillarList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Caterpillar().getMaxCount());
        for(int i = 1; i < count; i++){
            caterpillarList.add(new Caterpillar());
        }
        return caterpillarList;
    }
}
