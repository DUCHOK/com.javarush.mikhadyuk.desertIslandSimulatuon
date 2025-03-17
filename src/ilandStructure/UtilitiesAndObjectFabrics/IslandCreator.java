package ilandStructure.UtilitiesAndObjectFabrics;

import ilandStructure.Island;
import ilandStructure.IslandFieldLine;

import java.util.HashMap;

public class IslandCreator implements AbstractObjectFabric {

    public Island generate(int... countsOfLinesAndColumns) {
        Island island = new Island();
        HashMap<Integer, IslandFieldLine> islandMap = new HashMap<>();
        IslandFieldLineGenerator islandFieldLineGenerator = new IslandFieldLineGenerator();

        int linesCount = countsOfLinesAndColumns[0];
        int fieldsCountInLine = countsOfLinesAndColumns[1];

        for (int lineNum = 1; lineNum <= linesCount; lineNum++) {
            IslandFieldLine fieldLine = islandFieldLineGenerator.generate(fieldsCountInLine, lineNum);
            islandMap.put(Integer.valueOf(lineNum), fieldLine);
        }

        island.setIslandFilling(islandMap);
        return island;
    }
}

