public class Main {
    public static void main(String[] args) {
        int existingBalance;
        existingBalance = 100;
        int replenishmentAmount;
        replenishmentAmount = 1299;
        int rubleBonus;
        if (replenishmentAmount >= 1100) {

            rubleBonus = replenishmentAmount / 100;
            System.out.println("Ваших бонусных рублей = " + rubleBonus);
        } else {
            rubleBonus = 0;
        }
        int totalBalance;
        totalBalance = existingBalance + replenishmentAmount + rubleBonus;
        System.out.println("Ваш итоговый баланс : " + totalBalance + " руб");

    }
}
