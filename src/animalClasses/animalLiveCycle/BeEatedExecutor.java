package animalClasses.animalLiveCycle;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.plants.Plant;
import ilandStructure.Island;
import ilandStructure.IslandField;
import ilandStructure.UtilitiesAndObjectFabrics.FieldGetter;
import ilandStructure.UtilitiesAndObjectFabrics.FieldSetter;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BeEatedExecutor {

    public synchronized void beEated(Animal animal, int lineNum, int numInLine){
        IslandField thisField = new FieldGetter().getField(lineNum, numInLine);
        if(thisField != null){
            ArrayList<ArrayList<Animal>> newFieldFilling = thisField.getFieldFilling().stream()
                    .map(animalList -> {
                        ArrayList<Animal> newList = new ArrayList<>(animalList);
                        if (!newList.isEmpty() && newList.contains(animal)) {
                            newList.remove(animal);
                        }
                        return newList;
                    })
                    .collect(Collectors.toCollection(ArrayList::new));
            thisField.setFieldFilling(newFieldFilling);
        }

    }
}
