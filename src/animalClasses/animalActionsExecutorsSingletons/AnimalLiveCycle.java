package animalClasses.animalActionsExecutorsSingletons;

import animalClasses.animalClassesStructure.Animal;

public class AnimalLiveCycle {
    public void executeLiveCycle(Animal animal){
        animal.eat();
        animal.multiply();
        animal.move();
    }
}
