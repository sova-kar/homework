public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task 1

        int age = 19;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        } else {
            System.out.println("Ты не можешь водить, нужно подождать");
        }
        age = 17;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        } else {
            System.out.println("Ты не можешь водить, нужно подождать");
        }

        //Task 2

        int temperature = 5;
        if (temperature >= 5) {
            System.out.println("На улице" + " " + temperature + " " + "градусов, можно идти без шапки");
        } else {
            System.out.println("На улице" + " " + temperature + " " + "градусов, нужно надеть шапку");
        }

        //Task 3

        int speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость" + " " + speed + " " + "км/ч,можно ехать спокойно");
        } else {
            System.out.println("Если скорость" + " " + speed + " " + "км/ч, будет штраф");
        }

        //Task 4
        int peopleAge = 3;
        if (peopleAge >= 2 && peopleAge <= 6) {
            System.out.println("Если возраст человека равен" + " " + peopleAge + " " + "то ему нужно ходить в детский сад");
        }
        peopleAge = 8;
        if (peopleAge >= 7 && peopleAge <= 17) {
            System.out.println("Если возраст человека равен" + " " + peopleAge + " " + "то ему нужно ходить в школу");
        }
        peopleAge = 19;
        if (peopleAge >= 18 && peopleAge <= 24) {
            System.out.println("Если возраст человека равен" + " " + peopleAge + " " + "то ему нужно ходить в университет");
        }
        peopleAge = 25;
        if (peopleAge >= 24) {
            System.out.println("Если возраст человека равен" + " " + peopleAge + " " + "то ему нужно ходить на работу");
        }

        //Task 5

        int childrenAge = 3;
        if (childrenAge < 5) {
            System.out.println("Если вовзраст ребенка равен" + " " + childrenAge + " " + "то он не может кататься на атракционе");
        }
        childrenAge = 7;
        if (childrenAge > 5 && childrenAge < 14) {
            System.out.println("Если вовзраст ребенка равен" + " " + childrenAge + " " + "то он может кататься на атракционе в сопровождении взрослого");
        }
        childrenAge = 15;
        if (childrenAge >= 14) {
            System.out.println("Если вовзраст ребенка равен" + " " + childrenAge + " " + "то он может кататься на атракционе без сопровождении взрослого");
        }

        //Task 6

        int passengerSeet = 60;
        int people = 102;
        int place = 100;
        if (people < passengerSeet) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (people > place) {
            System.out.println("В вагоне нет мест");
        }
        if (people >= passengerSeet && people < place) {
            System.out.println("В вагоне есть стоячие места");
        }

        //Task 7

        int one = 3;
        int two = 5;
        int three = 8;
        if (one > two && one > three) {
            System.out.println("Число one больше остальных");
        } else {
            if (two > one && two > three) {
                System.out.println("Число two больше остальных");
            } else {
                System.out.println("Число three больше остальных");
            }
        }

        //Homework.Part 2
        //Task 1

        int clientOS=0;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Ошибка");
        }

        //Task 2

        clientOS=0;
        int clientDeviceYear=2017;
        if (clientDeviceYear<=2015&&clientOS==0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear>2015&&clientOS==0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear<=2015&&clientOS==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear>2015&&clientOS==1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }else {
            System.out.println("Ошибка данных");
        }

        //Task 3

        int year=2024;
        if (year>1584 && ((year %4==0 && year %100!=0)||year %400==0)) {
            System.out.println(year+" "+"год является високосным");
        }else {
            System.out.println(year+" "+"год не является високосным");
        }

        //Task 4

        int deliveryDistance=95;
        int days=1;
        if (deliveryDistance<=20) {
            System.out.println("Потребуется" + " " + days +" " + "дня для доставки карты");
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            System.out.println("Потребуется" + " " + days*2 +" " + "дня для доставки карты");
        } else if (deliveryDistance>60 && deliveryDistance<=100) {
            System.out.println("Потребуется" + " " + days*3 +" " + "дня для доставки карты");
        }else{
            System.out.println("Доставки нет");
        }

        //Task 5

        int monthNumber=12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверные данные");
        }
    }
}

