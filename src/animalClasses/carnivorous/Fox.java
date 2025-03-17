package animalClasses.carnivorous;

import animalClasses.animalClassesStructure.Carnivorous;
import lombok.Getter;

@Getter
public class Fox extends Carnivorous {
    private Integer weight = 8;

    public Integer getMaxCount() {
        return maxCount;
    }

    public Integer getSpeed() {
        return speed;
    }

    private Integer maxCount = 30;
    private Integer speed = 2;
    private Double satiety = 2.0;

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
