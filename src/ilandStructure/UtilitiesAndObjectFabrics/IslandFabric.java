package ilandStructure.UtilitiesAndObjectFabrics;

import ilandStructure.Island;
import ilandStructure.IslandField;

import java.util.HashMap;

public class IslandFabric implements AbstractObjectFabric {

    public Island generate(int... countsOfLinesAndColumns) {
        Island island = new Island();
        HashMap<Integer, IslandField> islandMap = new HashMap<>();
        FieldFabric fieldFabric = new FieldFabric();

        int linesCount = countsOfLinesAndColumns[0];
        for (int i = 1; i <= linesCount; i++) {
            IslandField field = fieldFabric.generate();
            islandMap.put(Integer.valueOf(i), field);
        }

        island.setIslandFilling(islandMap);
        return island;
    }
}

