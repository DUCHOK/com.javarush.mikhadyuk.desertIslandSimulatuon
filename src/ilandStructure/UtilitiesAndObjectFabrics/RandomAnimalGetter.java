package ilandStructure.UtilitiesAndObjectFabrics;

import animalClasses.animalClassesStructure.Animal;
import ilandStructure.IslandField;

import java.util.ArrayList;
import java.util.Random;

public class RandomAnimalGetter {
    public Animal get(IslandField field) {
        Animal randomAnimal = null;
        if(field != null){
            Random random = new Random();
            ArrayList<Animal> randomAnimalList;
            randomAnimalList = field.getFieldFilling().get(random.nextInt(0, field.getFieldFilling().size()));
            try {
                randomAnimal = randomAnimalList.get(random.nextInt(0, randomAnimalList.size()));
            } catch (IllegalArgumentException e) {
                return null;
            }
            return randomAnimal;
        }
        return randomAnimal;
    }
}
