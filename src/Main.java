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
        if (temperature >= 5) ;
        {
            System.out.println("На улице" + " " + temperature + " " + "градусов, можно идти без шапки");
        }
        temperature = 2;
        if (temperature < 5) ;
        {
            System.out.println("На улице" + " " + temperature + " " + "градусов, нужно надеть шапку");
        }

        //Task 3

        int speed = 60;
        if (speed <= 60) ;
        {
            System.out.println("Если скорость" + " " + speed + " " + "км/ч,можно ехать спокойно");
        }
        speed = 89;
        if (speed > 60) ;
        {
            System.out.println("Если скорость" + " " + speed + " " + "км/ч,будет штраф");
        }

        //Task 4
        int peopleAge = 3;
        if (peopleAge >= 2 && peopleAge <= 6) ;
        {
            System.out.println("Если возраст человека равен" + " " + peopleAge + " " + "то ему нужно ходить в детский сад");
        }
        peopleAge = 8;
        if (peopleAge >= 7 && peopleAge <= 17) ;
        {
            System.out.println("Если возраст человека равен" + " " + peopleAge + " " + "то ему нужно ходить в школу");
        }
        peopleAge = 19;
        if (peopleAge >= 18 && peopleAge <= 24) ;
        {
            System.out.println("Если возраст человека равен" + " " + peopleAge + " " + "то ему нужно ходить в университет");
        }
        peopleAge = 25;
        if (peopleAge >= 24) ;
        {
            System.out.println("Если возраст человека равен" + " " + peopleAge + " " + "то ему нужно ходить на работу");
        }

        //Task 5

        int childrenAge = 3;
        if (childrenAge < 5) ;
        {
            System.out.println("Если вовзраст ребенка равен" + " " + childrenAge + " " + "то он не может кататься на атракционе");
        }
        childrenAge = 7;
        if (childrenAge > 5 && childrenAge < 14) ;
        {
            System.out.println("Если вовзраст ребенка равен" + " " + childrenAge + " " + "то он может кататься на атракционе в сопровождении взрослого");
        }
        childrenAge = 15;
        if (childrenAge >= 14) ;
        {
            System.out.println("Если вовзраст ребенка равен" + " " + childrenAge + " " + "то он может кататься на атракционе без сопровождении взрослого");
        }

        //Task 6

        int passengerSeet=102;
        if (passengerSeet<=100)
        {
            System.out.println("В вагоне 60 сидячих и 60 стоячих мест");
        }else {
            System.out.println("Вагон переполнен");
        }

        //Task 7

        int one=3;
        int two=5;
        int three=8;
        if (one >two && one>three) {
            System.out.println("Число one больше остальных");
        } else if (two>one && two>three) {
            System.out.println("Число two больше остальных");
        } else if (three>one && three>two); {
            System.out.println("Число three больше остальных");
        }
    }



}