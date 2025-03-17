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
public class Horse extends Herbivore implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 400;
    private Integer maxCount = 20;
    private Integer maxChildCount = 1;
    private Integer speed = 4;
    private Double satiety = 60.0;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Horse(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Horse newInstance(){
        return new Horse(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
