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
public class Boar extends Herbivore implements Eatable, BeEatable, Movable, Multiplyable {
    private Integer weight = 400;
    private Integer maxCount = 50;
    private Integer maxChildCount = 5;
    private Integer speed = 2;
    private Double satiety = 50.0;

    private int lineNum;
    private int numInLine;

    private Island island;

    public Boar(int lineNum, int numInLine, Island creatingIsland) {
        this.lineNum = lineNum;
        this.numInLine = numInLine;
        this.island = creatingIsland;
    }

    public Boar newInstance(){
        return new Boar(this.getLineNum(), this.getNumInLine(), this.island);
    }
}
