package ilandStructure.UtilitiesAndObjectFabrics;

import ilandStructure.IslandField;

public class FieldFabric implements AbstractObjectFabric {

    public IslandField generate(int... lineNumAndNumInLine){
        IslandField field = new IslandField();
        field.setFieldFilling(new FieldFiller().generate());
        field.setLineNum(lineNumAndNumInLine[0]);
        field.setNumInLine(lineNumAndNumInLine[1]);
        return field;
    }
}
