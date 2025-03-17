package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import lombok.Getter;

@Getter
public class Buffalo extends Herbivore {
    private Integer weight = 70;
    private Integer maxCount = 10;

    public Integer getSpeed() {
        return speed;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    private Integer speed = 3;
    private Double satiety = 100.0;

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
