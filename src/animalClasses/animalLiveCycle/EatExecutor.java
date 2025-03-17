package animalClasses.animalLiveCycle;


import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalEatingChancesMechanism.CanEatChecker;
import ilandApp.App;
import ilandStructure.Island;
import ilandStructure.IslandField;
import ilandStructure.UtilitiesAndObjectFabrics.FieldGetter;
import ilandStructure.UtilitiesAndObjectFabrics.RandomAnimalGetter;

public class EatExecutor {

    public synchronized void chooseAndEat(Animal animal, int lineNum, int numInLine){
        IslandField thisField = new FieldGetter().getField(lineNum, numInLine);
        Animal randomAnimal = new RandomAnimalGetter().get(thisField);
        CanEatChecker checker = new CanEatChecker(animal, App.animalEatingChances);
        if(checker.check(randomAnimal)){
            randomAnimal.beEated();
        }
    }
}
