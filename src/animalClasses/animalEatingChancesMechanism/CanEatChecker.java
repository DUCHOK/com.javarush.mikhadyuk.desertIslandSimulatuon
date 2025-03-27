package animalClasses.animalEatingChancesMechanism;

import animalClasses.animalClassesStructure.Animal;
import ilandStructure.UtilitiesAndObjectFabrics.RandomAnimalGetter;
import ilandStructure.UtilitiesAndObjectFabrics.RandomSingleton;
import lombok.AllArgsConstructor;

import java.util.Random;

@AllArgsConstructor
public class CanEatChecker {
    Animal animal;
    AnimalEatingChances animalEatingChances;

    public boolean check(Animal eatedAnimal){
        int eatingChance;

        try{
            String firstKey = this.animal.getClass().toString().replaceFirst("class ", "");
            String secondKey = eatedAnimal.getClass().toString().replaceFirst("class ", "");
            eatingChance = animalEatingChances.getAnimalsEatingChancesMap().get(firstKey).get(secondKey);
        }catch (NullPointerException e){
            return false;
        }
        if(new Random().nextInt(1, 101) <= eatingChance){
            return true;
        }else{
            return false;
        }

    }
}
