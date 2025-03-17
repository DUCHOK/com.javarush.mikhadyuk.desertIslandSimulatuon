package ilandStructure.UtilitiesAndObjectFabrics;

import ilandStructure.Island;
import ilandStructure.IslandFieldLine;

import java.util.HashMap;

public class IslandCreator implements AbstractObjectFabric {

    public Island generate(int countsOfLines, int countOfColumns, Island creatingIsland) {
        Island island = new Island(countOfColumns, countOfColumns);
        HashMap<Integer, IslandFieldLine> islandMap = new HashMap<>();
        IslandFieldLineGenerator islandFieldLineGenerator = new IslandFieldLineGenerator();

        for (int lineNum = 1; lineNum <= countsOfLines; lineNum++) {
            IslandFieldLine fieldLine = islandFieldLineGenerator.generate(countOfColumns, lineNum, island);
            islandMap.put(Integer.valueOf(lineNum), fieldLine);
        }

        island.setIslandFilling(islandMap);
        return island;
    }
}

