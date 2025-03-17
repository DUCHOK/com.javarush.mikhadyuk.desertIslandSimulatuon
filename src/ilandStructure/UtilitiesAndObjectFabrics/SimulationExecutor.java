package ilandStructure.UtilitiesAndObjectFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalActionsExecutorsSingletons.AnimalLiveCycle;
import ilandStructure.IslandField;

import java.util.ArrayList;

public class SimulationExecutor {
    public void execute(IslandField field){
        AnimalLiveCycle liveCycle = new AnimalLiveCycle();
        for(ArrayList<Animal> someAnimalList : field.getFieldFilling()){
            for(Animal someAnimal : someAnimalList){
                liveCycle.executeLiveCycle(someAnimal);
            }
        }
    }
}
