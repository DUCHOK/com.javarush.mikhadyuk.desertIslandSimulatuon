package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalClassesStructure.Herbivore;
import animalClasses.animalFunctionalInterfaces.BeEatable;
import animalClasses.animalFunctionalInterfaces.Eatable;
import animalClasses.animalFunctionalInterfaces.Movable;
import animalClasses.animalFunctionalInterfaces.Multiplyable;
import animalClasses.plants.Plant;
import ilandStructure.Island;
import ilandStructure.IslandField;
import ilandStructure.UtilitiesAndObjectFabrics.FieldGetter;
import ilandStructure.UtilitiesAndObjectFabrics.RandomAnimalGetter;
import lombok.Getter;

@Getter
public class Rabbit extends Herbivore implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 2;
    private Integer maxCount = 150;
    private Integer maxChildCount = 5;
    private Integer speed = 2;
    private Double satiety = 0.45;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Rabbit(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Rabbit newInstance(){
        return new Rabbit(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
