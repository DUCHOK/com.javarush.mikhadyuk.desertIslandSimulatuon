package animalClasses.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Deer;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class DeerFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> deerList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Deer().getMaxCount());
        for(int i = 1; i < count; i++){
            deerList.add(new Deer());
        }
        return deerList;
    }
}
