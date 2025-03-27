package animalClasses.animalsOrPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Rabbit;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class RabbitFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList() {
        ArrayList<Animal> rabbitList = new ArrayList<>();
        int count = new RandomSingleton().getRandomizer().nextInt(0,new Rabbit().getMaxCount());
        for(int i = 1; i < count; i++){
            rabbitList.add(new Rabbit());
        }
        return rabbitList;
    }
}
