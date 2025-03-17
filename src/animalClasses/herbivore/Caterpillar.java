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
public class Caterpillar extends Herbivore implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 1;
    private Integer maxCount = 1000;
    private Integer maxChildCount = 3;
    private Integer speed = 0;
    private Double satiety = 0.0;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Caterpillar(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Caterpillar newInstance(){
        return new Caterpillar(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
