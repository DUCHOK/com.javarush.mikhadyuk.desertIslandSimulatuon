package animalClasses.animalClassesStructure;


import animalClasses.animalFunctionalInterfaces.BeEatable;
import animalClasses.animalFunctionalInterfaces.Eatable;
import animalClasses.animalFunctionalInterfaces.Movable;
import animalClasses.animalFunctionalInterfaces.Multiplyable;
import animalClasses.animalLiveCycle.BeEatedExecutor;
import animalClasses.animalLiveCycle.EatExecutor;
import animalClasses.animalLiveCycle.MoveExecutor;
import animalClasses.animalLiveCycle.MultiplyExecutor;
import ilandStructure.Island;
import lombok.Getter;

import java.nio.file.WatchEvent;
@Getter
public class Animal implements Eatable, Movable, Multiplyable, BeEatable {
    public static Island island;
    int lineNum;
    int numInLine;
    Integer weight;
    Integer maxCount;
    Integer speed;
    Double satiety;
    Integer maxChildCount;

    @Override
    public void beEated() {
        BeEatedExecutor beEatedExecutor = new BeEatedExecutor();
        beEatedExecutor.beEated(this, this.getLineNum(), this.getNumInLine());
    }

    @Override
    public void eat() {
        EatExecutor eatExecutor = new EatExecutor();
        eatExecutor.chooseAndEat(this, this.getLineNum(), this.getNumInLine());
    }

    @Override
    public void move() {
        MoveExecutor moveExecutor = new MoveExecutor();
        moveExecutor.move(this, this.getLineNum(), this.getNumInLine());
    }

    @Override
    public void multiply() {
        MultiplyExecutor multiplyExecutor = new MultiplyExecutor();
        multiplyExecutor.multiply(this, this.getLineNum(), this.getNumInLine());
    }

    public Animal newInstance(){
        return null;
    }
}
