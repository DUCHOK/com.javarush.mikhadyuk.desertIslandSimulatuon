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
public class Deer extends Herbivore implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 300;
    private Integer maxCount = 20;
    private Integer maxChildCount = 2;
    private Integer speed = 4;
    private Double satiety = 60.0;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Deer(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Deer newInstance(){
        return new Deer(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
