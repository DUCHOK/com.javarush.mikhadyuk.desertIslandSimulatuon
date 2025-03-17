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
public class Duck extends Herbivore implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 1;
    private Integer maxCount = 200;
    private Integer maxChildCount = 7;
    private Integer speed = 4;
    private Double satiety = 0.15;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Duck(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Duck newInstance(){
        return new Duck(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
