
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
       Задание 2
Один из сотовых операторов решил сделать своим клиентам приятный бонус:
если клиент пополняет счёт более чем на 1000 рублей,
то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.
 */
        int initialCount = 0;
        int replenishment = 1_100;
        int totalAmount;

        if (replenishment >= 1_000) {
            int bonus = replenishment / 100;
            totalAmount = initialCount + replenishment + bonus;
            System.out.println("Вам начисленно " + bonus + " бонусных рублей");
        } else {
            totalAmount = initialCount + replenishment;
        }

        System.out.println("Вы пополнили счет на " + replenishment + " рублей \n" +
                "Итого на Вашем счете " + totalAmount + " рублей");
    }
}