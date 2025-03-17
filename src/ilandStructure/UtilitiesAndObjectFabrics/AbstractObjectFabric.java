package ilandStructure.UtilitiesAndObjectFabrics;

import ilandStructure.Island;

public interface AbstractObjectFabric {
    Object generate(int countsOfLines, int countOfColumns, Island island);
}
