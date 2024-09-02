package HomeworkStream;

import HomeworkStream.Trader;

import java.util.*;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

//        3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        System.out.println("1. Все транзакции за 2011 год и отсортировать их по сумме.");
        transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(v -> v.getValue()))
                .map(name -> name.getTrader().getName())
                .forEach(s -> System.out.println(s));

//        2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        System.out.println("2. Список неповторяющихся городов, в которых работают трейдеры.");
        List<String> listCity = transactions.stream()
                .map(city -> city.getTrader().getCity())
                .distinct()
                .toList();
        System.out.println(listCity);


//        3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        System.out.println("3. Все трейдеры из Кембриджа отсортированы по именам.");
        transactions.stream()
                .filter(isCambridge -> isCambridge.getTrader().getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(name -> name.getTrader().getName()))
                .map(name -> name.getTrader().getName())
                .distinct()
                .forEach(s -> System.out.println(s));

//        4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.
        System.out.println("4. Строка со всеми именами трейдеров, отсортированными в алфавитном порядке.");
        List<String> traderName = transactions.stream()
                .map(name -> name.getTrader().getName())
                .sorted(Comparator.comparing(name -> name))
                .distinct()
                .toList();
        System.out.println(String.join(", ", traderName));

//        5. Выяснить, существует ли хоть один трейдер из Милана.
        System.out.println("5. Хоть один трейдер из Милана.");
        boolean isTrader = transactions.stream()
                .anyMatch(onMilan -> onMilan.getTrader().getCity().equals("Milan"));
        if (isTrader) System.out.println("Трейдер из Милана существует");


//        6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        System.out.println("6. Вывести суммы всех транзакций трейдеров из Кембриджа.");
        int sum = 0;
        transactions.stream()
                .filter(isCambridge -> isCambridge.getTrader().getCity().equals("Cambridge"))
                .map(value -> value.getValue())
                .forEach(s -> System.out.println(s));

//        7. Какова максимальная сумма среди всех транзакций?
        System.out.println("7. Какова максимальная сумма среди всех транзакций?");
        int max = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compare).get();
        System.out.println(max);

//        8. Найти транзакцию с минимальной суммой.
        System.out.println("8. Найти транзакцию с минимальной суммой.");
        int min = transactions.stream()
                .map(Transaction::getValue)
                .min(Integer::compare).get();
        System.out.println(min);
    }
}

