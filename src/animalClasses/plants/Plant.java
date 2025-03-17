package animalClasses.plants;

import animalClasses.animalClassesStructure.AbstractPlant;
import animalClasses.animalFunctionalInterfaces.BeEatable;
import animalClasses.animalFunctionalInterfaces.Eatable;
import animalClasses.animalFunctionalInterfaces.Movable;
import animalClasses.animalFunctionalInterfaces.Multiplyable;
import ilandStructure.Island;
import lombok.Getter;

@Getter
public class Plant extends AbstractPlant implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 1;
    private Integer maxCount = 5000;
    private Integer maxChildCount = 1;
    private Integer speed = 0;
    private Double satiety;

    private int lineNum;
    private int numInLine;

    private Island island;

    @Override
    public void eat() {
    }

    @Override
    public void move() {
    }


    public Plant(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }
}
