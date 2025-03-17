package animalClasses.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Mouse;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class MouseFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> mouseList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Mouse().getMaxCount());
        for(int i = 1; i < count; i++){
            mouseList.add(new Mouse());
        }
        return mouseList;
    }
}
