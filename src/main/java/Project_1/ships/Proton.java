package Project_1.ships;

public class Proton extends SpaceShip {
    // наследуемся от него

    public Proton(int amount, double prodMonths) {
        super(amount, prodMonths); // ссылка на родительский конструктор
    }

//    @Override
//    public int getMonthsRisk() {
//        return 0;
//    }
}
