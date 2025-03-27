package animalClasses.animalsOrPlantsFabrics.carnivorousesFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.carnivorous.Boa;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class BoaFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> boaList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Boa().getMaxCount());
        for(int i = 0; i < count; i++){
            boaList.add(new Boa());
        }
        return boaList;
    }
}
