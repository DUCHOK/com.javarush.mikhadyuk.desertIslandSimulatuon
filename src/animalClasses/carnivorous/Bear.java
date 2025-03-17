package animalClasses.carnivorous;

import animalClasses.animalClassesStructure.Carnivorous;
import animalClasses.animalFunctionalInterfaces.BeEatable;
import animalClasses.animalFunctionalInterfaces.Eatable;
import animalClasses.animalFunctionalInterfaces.Movable;
import animalClasses.animalFunctionalInterfaces.Multiplyable;
import ilandStructure.Island;
import lombok.Getter;

@Getter
public class Bear extends Carnivorous implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 500;
    private Integer maxCount = 5;
    private Integer maxChildCount = 3;
    private Integer speed = 2;
    private Double satiety = 80.0;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Bear(int numInLine, int lineNum, Island creatingIsland) {
        this.numInLine = numInLine;
        this.lineNum = lineNum;
        this.island = creatingIsland;
    }
    public Bear newInstance(){
        return new Bear(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
