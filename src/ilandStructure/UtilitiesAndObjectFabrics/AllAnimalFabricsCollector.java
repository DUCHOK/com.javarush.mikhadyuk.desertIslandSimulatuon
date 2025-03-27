package ilandStructure.UtilitiesAndObjectFabrics;

import animalClasses.animalsAndPlantsFabrics.carnivorousesFabrics.*;
import animalClasses.animalsAndPlantsFabrics.plantsFabrics.*;
import animalClasses.animalsAndPlantsFabrics.herbivoresFabrics.*;

import java.util.ArrayList;

public class AllAnimalFabricsCollector {
    public ArrayList<Object> collect(){
        ArrayList<Object> allAnimalFabricsList = new ArrayList<>();
        allAnimalFabricsList.add(new PlantFabric());
        allAnimalFabricsList.add(new BearFabric());
        allAnimalFabricsList.add(new EagleFabric());
        allAnimalFabricsList.add(new FoxFabric());
        allAnimalFabricsList.add(new WolfFabric());
        allAnimalFabricsList.add(new BoaFabric());
        allAnimalFabricsList.add(new BoarFabric());
        allAnimalFabricsList.add(new BuffaloFabric());
        allAnimalFabricsList.add(new CaterpillarFabric());
        allAnimalFabricsList.add(new DeerFabric());
        allAnimalFabricsList.add(new DuckFabric());
        allAnimalFabricsList.add(new GoatFabric());
        allAnimalFabricsList.add(new HorseFabric());
        allAnimalFabricsList.add(new MouseFabric());
        allAnimalFabricsList.add(new RabbitFabric());
        allAnimalFabricsList.add(new SheepFabric());


        return allAnimalFabricsList;
    }
}
