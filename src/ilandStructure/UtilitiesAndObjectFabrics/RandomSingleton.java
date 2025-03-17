package ilandStructure.UtilitiesAndObjectFabrics;


import java.util.Random;
public class RandomSingleton {
    public static final Random randomizer = new Random();

    private RandomSingleton(){
    }

    public synchronized Random getRandomizer(){
        if(randomizer != null){
            return randomizer;
        }
        else{
            throw new RuntimeException("Не найден рандомайзер");
        }
    }
}
