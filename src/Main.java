public class Main {
    public static void main(String[] args) {
        int check = 100;// Начальный счет
        int refill = 1000;// Сумма пополнения
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;// Количество бонусных рублей
        } else {
            bonus = 0;
        }
        int endCeck = check + refill + bonus;// Итоговый счет
        System.out.println((endCeck) + "Итоговый счет");
        System.out.println((bonus) + "Количество бонусных рублей");

    }
}