package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import animalClasses.animalFunctionalInterfaces.BeEatable;
import animalClasses.animalFunctionalInterfaces.Eatable;
import animalClasses.animalFunctionalInterfaces.Movable;
import animalClasses.animalFunctionalInterfaces.Multiplyable;
import animalClasses.carnivorous.Bear;
import ilandStructure.Island;
import lombok.Getter;

@Getter
public class Buffalo extends Herbivore implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 70;
    private Integer maxCount = 10;
    private Integer maxChildCount = 2;
    private Integer speed = 3;
    private Double satiety = 100.0;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Buffalo(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Buffalo newInstance(){
        return new Buffalo(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
