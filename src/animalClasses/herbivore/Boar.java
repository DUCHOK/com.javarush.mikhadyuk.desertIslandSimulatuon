package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import lombok.Getter;

@Getter
public class Boar extends Herbivore {
    private Integer weight = 400;

    public Integer getMaxCount() {
        return maxCount;
    }

    public Integer getSpeed() {
        return speed;
    }

    private Integer maxCount = 50;
    private Integer speed = 2;
    private Double satiety = 50.0;

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
