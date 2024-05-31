import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Начальная сумма на счету
        int initialBalance = 0;

        // Сумма пополнения (вводится с клавиатуры)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму пополнения: ");
        int topUpAmount = scanner.nextInt();

        // Порог для начисления бонуса
        int bonusThreshold = 1000;

        // Количество бонусных рублей
        int bonus = 0;

        // Проверяем, превышает ли сумма пополнения порог
        if (topUpAmount > bonusThreshold) {
            // Рассчитываем количество бонусных рублей
            bonus = topUpAmount / 100;
        }

        // Рассчитываем итоговую сумму на счету
        int finalBalance = initialBalance + topUpAmount + bonus;

        // Выводим результаты
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}