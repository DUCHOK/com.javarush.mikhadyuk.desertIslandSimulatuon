package ilandStructure.UtilitiesAndObjectFabrics;

import animalClasses.animalClassesStructure.Animal;
import ilandStructure.Island;
import ilandStructure.IslandField;
import ilandStructure.IslandFieldLine;

import java.util.HashMap;

public class FieldSetter {

    public synchronized void setField(int lineNum, int numInLine, IslandField field){
        HashMap<Integer, IslandFieldLine> islandFilling = Animal.island.getIslandFilling();
        IslandFieldLine islandFieldLineObject = islandFilling.remove(lineNum);
        if(islandFieldLineObject != null){
            HashMap<Integer, IslandField> islandFieldLine = islandFieldLineObject.getLine();
            islandFieldLine.remove(numInLine);

            islandFieldLine.put(numInLine, field);
            islandFieldLineObject.setLine(islandFieldLine);
            islandFilling.put(lineNum,islandFieldLineObject);
            Animal.island.setIslandFilling(islandFilling);
        }

    }
}
