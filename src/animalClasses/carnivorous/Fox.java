package animalClasses.carnivorous;

import animalClasses.animalClassesStructure.Carnivorous;
import animalClasses.animalFunctionalInterfaces.BeEatable;
import animalClasses.animalFunctionalInterfaces.Eatable;
import animalClasses.animalFunctionalInterfaces.Movable;
import animalClasses.animalFunctionalInterfaces.Multiplyable;
import ilandStructure.Island;
import lombok.Getter;

@Getter
public class Fox extends Carnivorous implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 8;
    private Integer maxCount = 30;
    private Integer maxChildCount = 6;
    private Integer speed = 2;
    private Double satiety = 2.0;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Fox(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Fox newInstance(){
        return new Fox(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
