package ilandStructure.UtilitiesAndObjectFabrics;

import ilandStructure.Island;
import ilandStructure.IslandField;

public class FieldFabric implements AbstractObjectFabric {

    public IslandField generate(int lineNum, int numInLine, Island creatingIsland){
        IslandField field = new IslandField();
        field.setFieldFilling(new FieldFiller().generate(lineNum, numInLine, creatingIsland));
        field.setNumInLine(lineNum);
        field.setLineNum(numInLine);
        return field;
    }
}
