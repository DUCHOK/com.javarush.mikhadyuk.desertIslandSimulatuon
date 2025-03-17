package animalClasses.animalClassesStructure;

import functionalAnimalInterfaces.Eat;
import functionalAnimalInterfaces.Eatable;
import functionalAnimalInterfaces.Movable;
import functionalAnimalInterfaces.multipliable;

public abstract class Animal implements Eat, Movable, multipliable, Eatable {
    Integer weight;
    Integer maxCount;
    Integer speed;
    Double satiety;
}
