package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import lombok.Getter;

@Getter
public class Duck extends Herbivore {
    private Integer weight = 1;
    private Integer maxCount = 200;

    public Integer getSpeed() {
        return speed;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    private Integer speed = 4;
    private Double satiety = 0.15;

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
