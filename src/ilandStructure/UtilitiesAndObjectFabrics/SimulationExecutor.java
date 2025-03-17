package ilandStructure.UtilitiesAndObjectFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalLiveCycle.AnimalLiveCycle;
import ilandStructure.IslandField;
import ilandStructure.IslandFieldLine;

import java.util.*;

public class SimulationExecutor {
    public synchronized void execute(int lineNum){
        AnimalLiveCycle liveCycle = new AnimalLiveCycle();
        HashMap<Integer, IslandField> lineCopy = new HashMap<>(Animal.island.getIslandFilling().get(lineNum).getLine());
        for (Map.Entry<Integer, IslandField> entry : lineCopy.entrySet()) {
            IslandField executableField = entry.getValue();
            for (ArrayList<Animal> animalList : executableField.getFieldFilling()) {
                for (Animal animal : new ArrayList<>(animalList)) {
                    liveCycle.executeLiveCycle(animal);
                }
            }
        }
        Animal.island.getIslandFilling().get(lineNum).setLine(lineCopy);
    }
}
