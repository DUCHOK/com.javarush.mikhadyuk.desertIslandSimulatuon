package animalClasses.animalLiveCycle;

import animalClasses.animalClassesStructure.Animal;
import ilandStructure.Island;
import ilandStructure.IslandField;
import ilandStructure.IslandFieldLine;
import ilandStructure.UtilitiesAndObjectFabrics.FieldGetter;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.HashMap;

public class MoveExecutor {


    public synchronized void move(Animal animal, int lineNum, int numInLine){
        int directionNum = RandomSingleton.randomizer.nextInt(0,4);
        if(!(animal.getSpeed() == 0)){
            int moveDistance = RandomSingleton.randomizer.nextInt(0, animal.getSpeed());
            animal.beEated();
            AnimalAdder adder = new AnimalAdder();
            adder.addAnimalToOtherField(animal, lineNum, numInLine, moveDistance, directionNum);
        }
    }


}
