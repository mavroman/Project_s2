package Project_1.ships;

abstract public class SpaceShip implements Timeriskable {

    private final int amount; // количество кораблей
    private final double prodMonths; // кол. месяцев, которое требуется для их производства

    public SpaceShip(int amount, double prodMonths) {
        this.amount = amount;
        this.prodMonths = prodMonths;
    } // делаем конструктор

    public  double  getTotalMonths() {
        return amount * prodMonths; // метод подсчета
    }

}
