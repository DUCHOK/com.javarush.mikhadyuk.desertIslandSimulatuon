package ilandStructure.UtilitiesAndObjectFabrics;

import ilandStructure.Island;
import ilandStructure.IslandField;
import ilandStructure.IslandFieldLine;

import java.util.ArrayList;
import java.util.HashMap;

public class IslandFieldLineGenerator{
    public IslandFieldLine generate(int fieldsCount, int lineNum, Island creatingIsland){
        HashMap<Integer, IslandField> line = new HashMap<>();
        for(int numInLine = 1; numInLine <= fieldsCount; numInLine++){
            IslandField islandField = new FieldFabric().generate(lineNum, numInLine, creatingIsland);
            line.put(numInLine, islandField);
        }
        IslandFieldLine islandFieldLine = new IslandFieldLine();
        islandFieldLine.setLine(line);
        islandFieldLine.setLineNumber(lineNum);
        return islandFieldLine;
    }
}
