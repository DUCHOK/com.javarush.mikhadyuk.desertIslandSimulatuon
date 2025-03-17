package ilandApp;

import ilandStructure.Island;
import ilandStructure.UtilitiesAndObjectFabrics.IslandCreator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ожидаю параметры создаваемого острова:\nКоличество столбцов =");
        int linesCount = console.nextInt();
        System.out.println("Кoличетво линий =");
        int columnsCount = console.nextInt();

        IslandCreator islandFabric = new IslandCreator();
        Island island = islandFabric.generate(columnsCount, linesCount);

        console.close();
        System.out.println("Остров " + linesCount + " на " + columnsCount + " полей создан.\nПоехали!");

        Thread islandThread = new Thread(island);
        islandThread.run();
        try{
            islandThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Симуляция завершена");
    }
}
