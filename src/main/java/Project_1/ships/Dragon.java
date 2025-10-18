package Project_1.ships;

public class Dragon extends SpaceShip {
    // наследуемся от него

    public Dragon(int amount, double prodMonths) {
        super(amount, prodMonths); // ссылка на родительский конструктор
    }

//    @Override
//    public int getMonthsRisk() {
//        return 0;
//    }

}