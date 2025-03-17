package animalClasses.carnivorous;

import animalClasses.animalClassesStructure.Carnivorous;
import lombok.Getter;

@Getter
public class Eagle extends Carnivorous {
    private Integer weight = 6;
    private Integer maxCount = 20;

    public Integer getMaxCount() {
        return maxCount;
    }

    public Integer getSpeed() {
        return speed;
    }

    private Integer speed = 3;
    private Double satiety = 1.0;

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
