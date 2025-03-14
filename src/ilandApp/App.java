package ilandApp;

import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.IslandFabric;

public class App {
    public static void main(String[] args) {
        IslandFabric islandFabric = new IslandFabric();
        Island island = islandFabric.generate(10, 10);


    }
}
