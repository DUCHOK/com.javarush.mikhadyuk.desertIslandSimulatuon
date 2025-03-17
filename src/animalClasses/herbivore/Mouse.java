package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalClassesStructure.Herbivore;
import animalClasses.animalFunctionalInterfaces.BeEatable;
import animalClasses.animalFunctionalInterfaces.Eatable;
import animalClasses.animalFunctionalInterfaces.Movable;
import animalClasses.animalFunctionalInterfaces.Multiplyable;
import animalClasses.carnivorous.Bear;
import animalClasses.plants.Plant;
import ilandStructure.Island;
import ilandStructure.IslandField;
import ilandStructure.UtilitiesAndObjectFabrics.FieldGetter;
import ilandStructure.UtilitiesAndObjectFabrics.RandomAnimalGetter;
import lombok.Getter;

@Getter
public class Mouse extends Herbivore implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 1;
    private Integer maxCount = 500;
    private Integer maxChildCount = 7;
    private Integer speed = 1;
    private Double satiety = 0.01;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Mouse(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Mouse newInstance(){
        return new Mouse(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
