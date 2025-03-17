package ilandStructure;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
@Getter
@Setter
public class Island implements Runnable{
    private HashMap<Integer, IslandFieldLine> islandFilling;

    @Override
    public void run(){
        for(int fieldLineNum : islandFilling.keySet()){
            new Thread(islandFilling.get(fieldLineNum)).run();
        }
    }
}
