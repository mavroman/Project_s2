package Project_1;

import Project_1.factory.SpaceShipFactory;
import Project_1.ships.Dragon;
import Project_1.ships.Proton;
import Project_1.ships.Soyuz;
import Project_1.ships.SpaceShip;

import static Project_1.constants.Constants.GENERATION_1;
import static Project_1.constants.Constants.GENERATION_2;

public class Main {

    
    public static void main(String[] args) {

        SpaceShip[] ships = new SpaceShip[] { // массив с кораблями с любым набором объетов классов
                new Soyuz(3, 7, GENERATION_1),
                new Soyuz(1, 8, GENERATION_2),
                new Proton(4, 10),
                new Dragon(2, 8)
        };

        // создаем объект, который с этим работает
        SpaceShipFactory factory = new SpaceShipFactory(ships);
        // Результат выводим в консоль
        System.out.println(factory.getTotalMonths());
    }
}


