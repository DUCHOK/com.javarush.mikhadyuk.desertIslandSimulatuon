package animalClasses.herbivore;

import animalClasses.animalClassesStructure.Herbivore;
import lombok.Getter;

@Getter
public class Deer extends Herbivore {
    private Integer weight = 300;
    private Integer maxCount = 20;

    public Integer getSpeed() {
        return speed;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    private Integer speed = 4;
    private Double satiety = 60.0;

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
