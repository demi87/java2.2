public class Main {

    public static void main(String[] args) {
        int startingBalance = 100;
        int replenishment = 2000;
        int bonus = replenishment / 100;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int newBalance = startingBalance + replenishment + bonus;
        System.out.println("Бонус:" + bonus + "рублей");
        System.out.println("Итоговый баланс:" + newBalance + "рублей" );
    }
}
