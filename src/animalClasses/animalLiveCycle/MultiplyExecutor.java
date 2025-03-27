package animalClasses.animalLiveCycle;

import animalClasses.animalClassesStructure.Animal;
import ilandStructure.Island;
import ilandStructure.IslandField;
import ilandStructure.UtilitiesAndObjectFabrics.FieldGetter;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class MultiplyExecutor {
    public synchronized void multiply(Animal animal, int lineNum, int numInLine){
        IslandField thisField = new FieldGetter().getField(lineNum, numInLine);
        if(thisField != null){
            ArrayList<ArrayList<Animal>> newFieldFilling = thisField.getFieldFilling().stream()
                    .map(animalList -> {
                        ArrayList<Animal> newList = new ArrayList<>(animalList);
                        if (!newList.isEmpty() && animal.getClass() == newList.get(0).getClass()) {
                            int shouldMultiply = new Random().nextInt(0,11);
                            if(shouldMultiply > 6){
                                int childCount = new Random().nextInt(0, animal.getMaxChildCount() + 1);
                                for (int i = 0; i < childCount; i++) {
                                    newList.add(animal.newInstance());
                                }
                            }
                        }
                        return newList;
                    })
                    .collect(Collectors.toCollection(ArrayList::new));
            thisField.setFieldFilling(newFieldFilling);
        }

    }
}
