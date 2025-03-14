package ilandStructure.UtilitiesAndObjectFabrics;

import animalClassesStructure.Animal;
import ilandStructure.IslandField;

import java.util.ArrayList;

public class FieldFabric implements AbstractObjectFabric {

    public IslandField generate(int... countsOfLinesAndColumns){
        IslandField field = new IslandField();
        ArrayList<ArrayList<Animal>> fieldFilling = new ArrayList<>();
        FieldFiller fieldFiller = new FieldFiller();

        fieldFilling = fieldFiller.generate();

        return field;
    }
}
