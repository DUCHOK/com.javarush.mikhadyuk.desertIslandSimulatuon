package animalClasses.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Goat;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class GoatFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> goatList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Goat().getMaxCount());
        for(int i = 1; i < count; i++){
            goatList.add(new Goat());
        }
        return goatList;
    }
}
