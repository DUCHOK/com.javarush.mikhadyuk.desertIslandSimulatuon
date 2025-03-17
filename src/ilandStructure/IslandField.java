package ilandStructure;

import animalClasses.animalClassesStructure.Animal;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class IslandField {
    private int lineNum;
    private int numInLine;
    private ArrayList<ArrayList<Animal>> fieldFilling = new ArrayList<>();
}