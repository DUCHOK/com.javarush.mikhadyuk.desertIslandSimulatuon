package animalClasses.animalLiveCycle;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.plants.Plant;

public class AnimalLiveCycle {
    public synchronized void executeLiveCycle(Animal animal){
        if(animal != null){
            animal.eat();
            animal.multiply();
            animal.move();
        }

    }


}
