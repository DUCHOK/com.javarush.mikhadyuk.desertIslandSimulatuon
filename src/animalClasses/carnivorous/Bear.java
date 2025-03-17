package animalClasses.carnivorous;

import animalClasses.animalClassesStructure.Carnivorous;
import lombok.Getter;

@Getter
public class Bear extends Carnivorous {
    private Integer weight = 500;

    public Integer getMaxCount() {
        return maxCount;
    }

    public Integer getSpeed() {
        return speed;
    }

    private Integer maxCount = 5;
    private Integer speed = 2;
    private Double satiety = 80.0;

    @Override
    public void beEated() {

    }

    @Override
    public void move() {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void eat() {

    }
}
