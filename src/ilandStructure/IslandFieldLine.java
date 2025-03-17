package ilandStructure;

import ilandStructure.UtilitiesAndObjectFabrics.SimulationExecutor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

@Getter
@Setter
public class IslandFieldLine implements Runnable{
    private int lineNumber;
    private HashMap<Integer, IslandField> line = new HashMap<>();

    @Override
    public synchronized void run(){
        new SimulationExecutor().execute(this.getLineNumber());
    }
}
