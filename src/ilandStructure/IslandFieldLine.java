package ilandStructure;

import ilandStructure.UtilitiesAndObjectFabrics.SimulationExecutor;

import java.util.ArrayList;

public class IslandFieldLine implements Runnable{
    private ArrayList<IslandField> line = new ArrayList<>();

    @Override
    public void run(){
        SimulationExecutor simulationExecutor = new SimulationExecutor();
        for (IslandField field : line){
            simulationExecutor.execute(field);
        }
    }

    public ArrayList<IslandField> getLine() {
        return line;
    }

    public void setLine(ArrayList<IslandField> line) {
        this.line = line;
    }
}
