package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import lombok.Getter;

@Getter
public class Mouse extends Herbivore {
    private Integer weight = 1;

    public Integer getMaxCount() {
        return maxCount;
    }

    public Integer getSpeed() {
        return speed;
    }

    private Integer maxCount = 500;
    private Integer speed = 1;
    private Double satiety = 0.01;

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
