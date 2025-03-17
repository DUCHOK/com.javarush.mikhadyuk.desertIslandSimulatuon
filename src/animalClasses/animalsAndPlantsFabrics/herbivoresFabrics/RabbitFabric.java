package animalClasses.animalsAndPlantsFabrics.herbivoresFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsAndPlantsFabrics.AbstractAnimalFabric;
import animalClasses.herbivore.Rabbit;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;

public class RabbitFabric implements AbstractAnimalFabric {
    @Override
    public ArrayList<Animal> createAnimalList(int lineNum, int numInLine, Island creatingIsland) {
        ArrayList<Animal> rabbitList = new ArrayList<>();
        int count = RandomSingleton.randomizer.nextInt(0,new Rabbit(lineNum, numInLine, creatingIsland).getMaxCount()+1);
        for(int i = 1; i < count; i++){
            rabbitList.add(new Rabbit(lineNum, numInLine, creatingIsland));
        }
        return rabbitList;
    }
}
