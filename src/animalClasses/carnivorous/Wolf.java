package animalClasses.carnivorous;

import animalClasses.animalClassesStructure.Carnivorous;
import lombok.Getter;

@Getter
public class Wolf extends Carnivorous {
    private Integer weight = 50;
    private Integer maxCount = 30;
    private Integer speed = 3;
    private Double satiety = 8.0;

    public Integer getSpeed() {
        return speed;
    }

    public Integer getMaxCount() {
        return maxCount;
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

    @Override
    public void eat() {

    }
}
