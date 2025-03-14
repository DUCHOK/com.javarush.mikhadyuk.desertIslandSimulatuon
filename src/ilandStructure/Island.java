package ilandStructure;

import java.util.HashMap;

public class Island {
    private HashMap<Integer, IslandField> islandFilling;

    public void setIslandFilling(HashMap<Integer, IslandField> islandFilling) {
        this.islandFilling = islandFilling;
    }

    public HashMap<Integer, IslandField> getIslandFilling() {
        return islandFilling;
    }

}
