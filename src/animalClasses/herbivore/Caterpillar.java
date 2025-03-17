package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import lombok.Getter;

@Getter
public class Caterpillar extends Herbivore {
    private Integer weight = 1;
    private Integer maxCount = 1000;
    private Integer speed = 0;
    private Double satiety = 0.0;

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
