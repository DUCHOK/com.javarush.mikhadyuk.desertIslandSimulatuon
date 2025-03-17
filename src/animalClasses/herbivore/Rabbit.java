package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import lombok.Getter;

@Getter
public class Rabbit extends Herbivore {
    private Integer weight = 2;
    private Integer maxCount = 150;
    private Integer speed = 2;
    private Double satiety = 0.45;

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
