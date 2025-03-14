package ilandStructure;

import animalClassesStructure.Animal;

import java.util.ArrayList;

public class IslandField {
    private ArrayList<ArrayList<Animal>> fieldFilling = new ArrayList<>();

    public ArrayList<ArrayList<Animal>> getFieldFilling() {
        return fieldFilling;
    }

    public void setFieldFilling(ArrayList<ArrayList<Animal>> fieldFilling) {
        this.fieldFilling = fieldFilling;
    }
}