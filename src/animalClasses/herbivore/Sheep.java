package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import animalClasses.animalFunctionalInterfaces.BeEatable;
import animalClasses.animalFunctionalInterfaces.Eatable;
import animalClasses.animalFunctionalInterfaces.Movable;
import animalClasses.animalFunctionalInterfaces.Multiplyable;
import ilandStructure.Island;
import lombok.Getter;

@Getter
public class Sheep extends Herbivore implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 70;
    private Integer maxCount = 140;
    private Integer maxChildCount = 2;
    private Integer speed = 3;
    private Double satiety = 15.0;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Sheep(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Sheep newInstance(){
        return new Sheep(this.getLineNum(), this.getNumInLine(), this.island);
    }
}