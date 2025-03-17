package ilandStructure.UtilitiesAndObjectFabrics;

import animalClasses.animalClassesStructure.Animal;
import ilandStructure.Island;
import ilandStructure.IslandField;

public class FieldGetter {

    public IslandField getField(int lineNum, int numInLine){
        try{
            return Animal.island.getIslandFilling().get(lineNum).getLine().get(numInLine);
        } catch (NullPointerException e) {
            return null;
        }

    }
}
