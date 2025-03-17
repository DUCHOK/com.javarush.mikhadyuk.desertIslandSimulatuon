package animalClasses.animalLiveCycle;

import animalClasses.animalClassesStructure.Animal;
import ilandStructure.Island;
import ilandStructure.IslandField;
import ilandStructure.UtilitiesAndObjectFabrics.FieldGetter;
import ilandStructure.UtilitiesAndObjectFabrics.FieldSetter;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class AnimalAdder {


    public synchronized void addAnimalToOtherField(Animal animal, int lineNum, int numInLine, int moveDistance, int directionNum){
        Direction direction = Direction.values()[directionNum];
        FieldGetter fieldGetter = new FieldGetter();
        switch (direction) {
            case Norht -> {
                if (lineNum - moveDistance < 1) {
                    IslandField targetField = fieldGetter.getField(1, numInLine);
                    this.addAnimalAndSetField(targetField, animal, 1, numInLine);
                } else {
                    int targetFieldLineNum = lineNum - moveDistance;
                    IslandField targetField = fieldGetter.getField(targetFieldLineNum, numInLine);
                    this.addAnimalAndSetField(targetField, animal, targetFieldLineNum, numInLine);
                }
                ;
            }

            case East -> {
                if(fieldGetter.getField(lineNum, Animal.island.getColumnCount() ) != null){
                    if (numInLine + moveDistance > Animal.island.getColumnCount()) {
                        IslandField targetField = fieldGetter.getField(lineNum, Animal.island.getColumnCount());
                        this.addAnimalAndSetField(targetField, animal, lineNum, Animal.island.getColumnCount());
                    } else {
                        int targetFieldNumInLine = numInLine + moveDistance;
                        IslandField targetField = fieldGetter.getField(lineNum, targetFieldNumInLine);
                        this.addAnimalAndSetField(targetField, animal, lineNum, targetFieldNumInLine);
                    };
                }

            }

            case South -> {
                if(fieldGetter.getField(Animal.island.getLinesCount(), numInLine) != null){
                    if (lineNum + moveDistance > Animal.island.getLinesCount()) {
                        IslandField targetField = fieldGetter.getField(Animal.island.getLinesCount(), numInLine);
                        this.addAnimalAndSetField(targetField, animal, Animal.island.getLinesCount(), numInLine);
                    } else {
                        int targetFieldLineNum = lineNum + moveDistance;
                        IslandField targetField = fieldGetter.getField(targetFieldLineNum, numInLine);
                        this.addAnimalAndSetField(targetField, animal, targetFieldLineNum, numInLine);
                    }
                };
            }

            case West -> {
                if (numInLine - moveDistance < 1) {
                    IslandField targetField = fieldGetter.getField(lineNum, 1);
                    this.addAnimalAndSetField(targetField, animal, lineNum, 1);
                } else {
                    int targetFieldNumInLine = numInLine - moveDistance;
                    IslandField targetField = fieldGetter.getField(lineNum, targetFieldNumInLine);
                    this.addAnimalAndSetField(targetField, animal, lineNum, targetFieldNumInLine);
                };
            }
        }
    }
    private synchronized void addAnimalAndSetField(IslandField thisField, Animal animal, int targetFieldLineNum, int targetFieldNumInLine){
        if(thisField != null){
            ArrayList<ArrayList<Animal>> newFieldFilling = thisField.getFieldFilling().stream()
                    .map(animalList -> {
                        ArrayList<Animal> newList = new ArrayList<>(animalList);
                        if (!newList.isEmpty() && animal.getClass() == newList.get(0).getClass()) {
                            newList.add(animal);
                        }
                        return newList;
                    })
                    .collect(Collectors.toCollection(ArrayList::new));
            IslandField targetField = new FieldGetter().getField(targetFieldLineNum, targetFieldNumInLine);
            if(targetField != null){
                targetField.setFieldFilling(newFieldFilling);
            }
        }

    }
}
