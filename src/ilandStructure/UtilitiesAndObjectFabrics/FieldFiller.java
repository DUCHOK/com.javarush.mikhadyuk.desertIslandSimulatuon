package ilandStructure.UtilitiesAndObjectFabrics;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalsOrPlantsFabrics.AbstractAnimalFabric;

import java.util.ArrayList;

public class FieldFiller implements AbstractObjectFabric{
    volatile ArrayList<ArrayList<Animal>> fieldFilling = new ArrayList<>();
    @Override
    public ArrayList<ArrayList<Animal>> generate(int... countsOfLinesAndColumns) {
        // должен создавать и заполнять лист заполненных листов, соответствующих всем видам животных
        ArrayList<Object> allAnimalsFabrics = new AllAnimalFabricsCollector().collect();
        for(Object animalFabric : allAnimalsFabrics){
            try{
                Thread thread = new Thread(new Runnable(){
                    public void run(){
                        Object anFabr = animalFabric;
                        fieldFilling.add(((AbstractAnimalFabric) anFabr).createAnimalList());
                    }
                });
                thread.run();
                thread.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        return this.fieldFilling;
    }
}
