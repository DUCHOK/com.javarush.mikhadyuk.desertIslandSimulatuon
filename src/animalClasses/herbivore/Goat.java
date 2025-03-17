package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import lombok.Getter;

@Getter
public class Goat extends Herbivore {
    private Integer weight = 60;
    private Integer maxCount = 140;
    private Integer speed = 3;
    private Double satiety = 10.0;

    @Override
    public void eat() {

    }

    @Override
    public void beEated() {

    }

    @Override
    public void move() {

    }

    @Override
    public void multiply() {

    }
}
