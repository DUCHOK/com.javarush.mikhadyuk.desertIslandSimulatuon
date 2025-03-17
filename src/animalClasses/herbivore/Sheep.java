package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import lombok.Getter;

@Getter
public class Sheep extends Herbivore {
    private Integer weight = 70;

    public Integer getSpeed() {
        return speed;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    private Integer maxCount = 140;
    private Integer speed = 3;
    private Double satiety = 15.0;

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
