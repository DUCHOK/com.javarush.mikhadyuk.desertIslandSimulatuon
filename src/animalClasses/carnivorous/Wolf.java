package animalClasses.carnivorous;

import animalClasses.animalClassesStructure.Carnivorous;
import animalClasses.animalFunctionalInterfaces.BeEatable;
import animalClasses.animalFunctionalInterfaces.Eatable;
import animalClasses.animalFunctionalInterfaces.Movable;
import animalClasses.animalFunctionalInterfaces.Multiplyable;
import ilandStructure.Island;
import lombok.Getter;

@Getter
public class Wolf extends Carnivorous implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 50;
    private Integer maxCount = 30;
    private Integer maxChildCount = 6;
    private Integer speed = 3;
    private Double satiety = 8.0;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Wolf(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Wolf newInstance(){
        return new Wolf(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
