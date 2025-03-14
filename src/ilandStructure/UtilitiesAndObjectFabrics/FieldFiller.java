package ilandStructure.UtilitiesAndObjectFabrics;

import animalClassesStructure.Animal;
import java.util.ArrayList;

public class FieldFiller implements AbstractObjectFabric{
    volatile ArrayList<ArrayList<Animal>> fieldFilling = new ArrayList<>();
    @Override
    public ArrayList<ArrayList<Animal>> generate(int... countsOfLinesAndColumns) {
        // должен создавать и заполнять лист заполненных листов, соответствующих всем видам животных
        AllAnimalFabricsCollector collector = new AllAnimalFabricsCollector();
        ArrayList<Object> allAnimalsFabrics = collector.collect();
        for(Object animalFabric : allAnimalsFabrics){
            try{
                new Runnable(){
                    public void run(){
                        for()
                    }
                }
            }
        }

        return this.fieldFilling;
    }
}
