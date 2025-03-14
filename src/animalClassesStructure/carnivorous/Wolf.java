package animalClassesStructure.carnivorous;

import animalClassesStructure.Animal;
import animalClassesStructure.Carnivorous;
import lombok.Getter;

@Getter
public class Wolf extends Carnivorous {
    private Integer weight;
    private Integer maxCount;
    private Integer speed;
    private Double satiety;

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
    public void eat(Animal herbivore) {

    }
}
