package ilandStructure.UtilitiesAndObjectFabrics;

import ilandStructure.IslandField;
import ilandStructure.IslandFieldLine;

import java.util.ArrayList;

public class IslandFieldLineGenerator{
    public IslandFieldLine generate(int... fieldsCountAndLineNum){
        ArrayList<IslandField> line = new ArrayList<IslandField>();
        for(int numInLine = 1; numInLine <= fieldsCountAndLineNum[0]; numInLine++){
            IslandField islandField = new FieldFabric().generate(fieldsCountAndLineNum[1], numInLine);
            line.add(islandField);
        }
        IslandFieldLine islandFieldLine = new IslandFieldLine();
        islandFieldLine.setLine(line);
        return islandFieldLine;
    }
}
