public class Main {
    public static void main(String[] args) {
        int check = 100;// Начальный счет
        int refill = 1500;// Сумма пополнения
        if (refill >= 1000) {
            int bonus = refill / 100;// Количество бонусных рублей
        int endCeck = check + refill + bonus;// Итоговый счет
        System.out.println((endCeck) + "Итоговый счет");
        System.out.println((bonus) + "Количество бонусных рублей");
        }
    }
}