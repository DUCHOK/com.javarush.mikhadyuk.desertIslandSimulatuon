package animalClasses.carnivorous;

import animalClasses.animalClassesStructure.Carnivorous;
import animalClasses.animalFunctionalInterfaces.BeEatable;
import animalClasses.animalFunctionalInterfaces.Eatable;
import animalClasses.animalFunctionalInterfaces.Movable;
import animalClasses.animalFunctionalInterfaces.Multiplyable;
import ilandStructure.Island;
import lombok.Getter;

@Getter
public class Eagle extends Carnivorous implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 6;
    private Integer maxCount = 20;
    private Integer maxChildCount = 5;
    private Integer speed = 3;
    private Double satiety = 1.0;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Eagle(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Eagle newInstance(){
        return new Eagle(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
