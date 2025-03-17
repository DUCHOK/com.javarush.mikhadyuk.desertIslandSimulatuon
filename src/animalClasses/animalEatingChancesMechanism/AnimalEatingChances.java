package animalClasses.animalEatingChancesMechanism;

import animalClasses.animalClassesStructure.Animal;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.Getter;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
@Getter
public class AnimalEatingChances implements Serializable {
    @JsonProperty
    private HashMap<String, HashMap<String, Integer>> animalsEatingChancesMap;

    public void setAnimalEatingChancesMap(String path) {
        AnimalEatingChances animalEatingChances = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            animalsEatingChancesMap = objectMapper.readValue(new File(path), AnimalEatingChances.class).getAnimalsEatingChancesMap();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
