package ilandStructure;

import animalClasses.animalClassesStructure.Animal;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Island implements Runnable{
    private HashMap<Integer, IslandFieldLine> islandFilling;
    public final int linesCount;
    public final int columnCount;

    public Island(int linesCount, int columnCount) {
        this.linesCount = linesCount;
        this.columnCount = columnCount;
    }

    @Override
    public synchronized void run(){
        HashMap<Integer, IslandFieldLine> newIslandFilling = new HashMap<>(this.getIslandFilling());
        ArrayList<Thread> threads = new ArrayList<>();
        for(Map.Entry<Integer, IslandFieldLine> entry : newIslandFilling.entrySet()){
            Thread thread = new Thread(islandFilling.get(entry.getKey()));
            threads.add(thread);
            thread.start();
        }
        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Animal.island.toString());
    }

    @Override
    public String toString() {
        String status = "";
        for (Map.Entry<Integer, IslandFieldLine> lineEntry : islandFilling.entrySet()){
            IslandFieldLine line = lineEntry.getValue();
            int lineNum = lineEntry.getKey();
            for (Map.Entry<Integer, IslandField> fieldEntry : line.getLine().entrySet()){
                int fieldNum = fieldEntry.getKey();
                status += "Строка " + lineNum + ", поле " + fieldNum + ":\n{\n";
                ArrayList<ArrayList<Animal>> fieldFilling = fieldEntry.getValue().getFieldFilling();
                for (ArrayList<Animal> animalList : fieldFilling){
                    if(animalList.size() > 0){
                        status += "    " + animalList.get(0).getClass().getSimpleName().toString();
                        status += ": " + animalList.size() + "\n";
                    }
                }
                status += "}\n";
            }
        }
        return status;
    }
}
