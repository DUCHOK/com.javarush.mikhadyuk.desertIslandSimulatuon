package ilandApp;

import animalClasses.animalClassesStructure.Animal;
import animalClasses.animalEatingChancesMechanism.AnimalEatingChances;
import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.IslandCreator;

import java.util.Scanner;

public class App {
    public static AnimalEatingChances animalEatingChances = new AnimalEatingChances();
    public static void main(String[] args) {
        animalEatingChances.setAnimalEatingChancesMap("D:\\IntelliJ IDEA Community Edition 2024.2.0.1\\projects\\com.javarush.mikhadyuk.desertIslandSimulatuon\\src\\animalClasses\\animalEatingChancesMechanism\\AnimalsEatingChances.json");
        System.out.println(animalEatingChances.getAnimalsEatingChancesMap().toString());

        Scanner console = new Scanner(System.in);
        System.out.println("Ожидаю параметры создаваемого острова:\nКоличество столбцов =");
        int linesCount = console.nextInt();
        System.out.println("Кoличетво линий =");
        int columnsCount = console.nextInt();

        IslandCreator islandCreator = new IslandCreator();
        Animal.island = islandCreator.generate(columnsCount, linesCount, null);

        System.out.println("Остров " + linesCount + " на " + columnsCount + " полей создан.");
        boolean work = true;
        while (work){
            System.out.println("Сколько тактов симуляции выполнить?");
            int tactsCount = console.nextInt();
            if(tactsCount > 0){
                for (int i = 0; i < tactsCount; i++) {
                    Thread islandThread = new Thread(Animal.island);
                    islandThread.start();
                    try {
                        islandThread.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }else{
                work = false;
            }
        }
        System.out.println("Симуляция завершена");
    }
}
