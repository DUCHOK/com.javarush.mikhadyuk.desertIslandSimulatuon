package animalClasses.plants;

import animalClasses.animalClassesStructure.AbstractPlant;
import lombok.Getter;

@Getter
public class Plant extends AbstractPlant {
    private Integer weight = 1;

    public Integer getMaxCount() {
        return maxCount;
    }

    private Integer maxCount = 5000;
    private Integer speed = 0;
    private Double satiety;

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
