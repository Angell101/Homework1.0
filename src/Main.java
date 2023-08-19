public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        int cat = 3;
        System.out.println(cat);
        int paper = 763789;
        System.out.println(paper);
    }

    private static void task2() {
        System.out.println("Задача 2");
        int dog = 8;
        dog += 4;
        System.out.println(dog);
        int cat = 3;
        cat += 4;
        System.out.println(cat);
        int paper = 763789;
        paper += 4;
        System.out.println(paper);
    }

    private static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog -= 3.5;
        System.out.println(dog);
        var cat = 3.0;
        --cat;
        System.out.println(cat);
        double paper = 763789.0;
        paper -= 7639.0;
        System.out.println(paper);
    }

    private static void task4() {
        System.out.println("Задача 4");
        int friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    private static void task5() {
        System.out.println("Задача 5");
        double frog = 3.5;
        System.out.println(frog);
        frog *= 10.0;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4.0;
        System.out.println(frog);
    }

    private static void task6() {
        System.out.println("Задача 6");
        double boxerWaigt1 = 78.2;
        System.out.println("вес первого боксера " + boxerWaigt1 + " кг");
        double boxerWaight2 = 82.7;
        System.out.println("вес второго боксера " + boxerWaight2 + " кг");
        double differenceWeightBoxers = boxerWaigt1 - boxerWaight2;
        System.out.println("разница между бойцами составила " + differenceWeightBoxers + " кг!");
    }

    private static void task7() {
        double difference = 160.9;
        System.out.println("Задача 7");
        double boxerWaigt1 = 78.2;
        System.out.println("вес первого боксера " + boxerWaigt1 + " кг");
        double boxerWaight2 = 82.7;
        System.out.println("вес второго боксера " + boxerWaight2 + " кг");
        double totalWeight = boxerWaigt1 + boxerWaight2;
        System.out.println("общий вес бойцов " + totalWeight + " кг");
        System.out.println("Первый способ");
        double differenceWeightBoxers = boxerWaight2 - boxerWaigt1;
        System.out.println("первая разница веса бойцов стоставила " + differenceWeightBoxers + " кг");
        System.out.println("Второй способ");
        double differenceWeightBoxers2 = (boxerWaight2 - boxerWaigt1) % difference;
        System.out.println("вторая разница веса бойцов стоставила" + differenceWeightBoxers2 + " кг");
    }

    private static void task8() {
        System.out.println(1);
        System.out.println("Задача 8");
        int totalNumberOfHours = 640;
        System.out.println("общее число часов работников " + totalNumberOfHours);
        int namberOfEmployees = totalNumberOfHours / 8;
        System.out.println("Всего работников в компании — " + namberOfEmployees + " человек");
        System.out.println(2);
        namberOfEmployees += 94;
        System.out.println(namberOfEmployees);
        int totalNumberOfHours2 = 640 / namberOfEmployees;
        System.out.println("Если в компании работает " + namberOfEmployees + " человек, то всего " + totalNumberOfHours2 + "e  часов работы может быть поделено между сотрудниками");
    }
}