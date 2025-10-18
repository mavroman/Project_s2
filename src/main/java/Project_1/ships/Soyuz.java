package Project_1.ships;

import static Project_1.constants.Constants.GENERATION_1;
import static Project_1.constants.Constants.SOYUZ_GENERATION_1_MONTHS_RISK;

public class Soyuz extends SpaceShip {

    private final String generation;
    // наследуемся от него

    public Soyuz(int amount, double prodMonths, String generation) {
       super(amount, prodMonths); // ссылка на родительский конструктор
        this.generation = generation;
    }

    @Override
    public int getMonthsRisk() {
       if (generation.equals(GENERATION_1)) {
           return SOYUZ_GENERATION_1_MONTHS_RISK;
       } else {
           return 0;
       }
    }
    // return generation.equals("gen1") ? 2 : 0

}

