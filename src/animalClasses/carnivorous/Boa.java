package animalClasses.carnivorous;

import animalClasses.animalClassesStructure.Carnivorous;
import lombok.Getter;

@Getter
public class Boa extends Carnivorous {
    private Integer weight = 15;

    public Integer getMaxCount() {
        return maxCount;
    }

    public Integer getSpeed() {
        return speed;
    }

    private Integer maxCount = 30;
    private Integer speed = 1;
    private Double satiety = 3.0;

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
