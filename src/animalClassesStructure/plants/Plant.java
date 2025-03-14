package animalClassesStructure.plants;

import animalClassesStructure.Animal;
import lombok.Getter;

@Getter
public class Plant extends Animal {
    private Integer weight;
    private Integer maxCount;
    private Integer speed;
    private Double satiety;

    @Override
    public void eat(Animal organism) {

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
