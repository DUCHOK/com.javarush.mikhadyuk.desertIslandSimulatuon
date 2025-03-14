package animalClassesStructure.herbivore;

import animalClassesStructure.Animal;
import animalClassesStructure.Herbivore;
import lombok.Getter;

@Getter
public class Boar extends Herbivore {
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
