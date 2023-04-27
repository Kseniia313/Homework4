public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 10;
        if (age >= 18) {
            System.out.println(" Если возраст человека " + age + ", он достиг совершеннолетия ");
        } else {
            System.out.println(" Если возраст человека " + age + ", он не достиг совершеннолетия, нужно немного подождать ");
        }
    }

    public static void task2() {
        System.out.println(" Задача 2");
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println(" На улице " + temperature + " градусов, нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + temperature + " градусов, можно идти без шапки ");
        }
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        int speed = 60;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + ", то придется заплатить штраф ");
        } else {System.out.println("Если скорость " + speed + ", то можно ездить спокойно ");
        }
    }
    public static void task4(){
        System.out.println(" Задача 4 ");
        int age = 32;
        if (age < 2){
            System.out.println(" Если возраст человека равен " + age + ", ему пора спать ");
        } else if (age >=2 && age <= 6){
            System.out.println( " Если возраст человека равен " + age + ", ему нужно ходить в детский сад ");
        } else if (age >=7 && age <=18){
            System.out.println( " Если возраст человека равен " + age + " ему нужно ходить в школу ");
        } else if (age>18 && age <=24){
            System.out.println(" Если возраст человека равен " + age + " его место в университете ");
        }else if (age>24 && age<60){
            System.out.println(" Если возраст человека равен " + age + " ему пора ходить на работу");
        } else if (age>=60){
            System.out.println(" Если возраст человека равен " + age + " он может отдохнуть");
        }
    }
    public static void task5(){
        System.out.println(" Задача 5 ");
        int age = 10;
        if (age <5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе ");
        }
        else if (age>=5 && age <=14){
                System.out.println(" Если возраст ребенка равен " + age + ", то он может кататься на аттракционе только в сопровождении взрослого ");
            } else{
                System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе без сопровождения взрослого " );
            }
        }
        public static void task6(){
            System.out.println(" Задача 6 ");
            int capacity = 102;
            int totalSeat = 60;

            int busySeats = 0;
            int busyStandingPlaces = 0;

            int totalStandingPlaces = capacity-totalSeat;
            int freeSeats = totalSeat-busySeats;
            int freeStandingPlaces = totalStandingPlaces-busyStandingPlaces;

            if ( busySeats <=59 && busyStandingPlaces<=41){
                System.out.println(" В вагоне есть " + (totalSeat-busySeats) + " стоячих мест и " + (totalStandingPlaces-busyStandingPlaces) + " сидячих мест ");
            }
                else if (busySeats==totalSeat && busyStandingPlaces <=41){
                    System.out.println(" В вагоне есть только стоячие места , их " + (totalStandingPlaces-busyStandingPlaces));
                }else if (busySeats<=59 && busyStandingPlaces == (capacity-totalSeat)){
                System.out.println(" В вагоне есть только сидячие места, их " + (totalSeat-busySeats));
                } else {
                System.out.println( " Вагон полностью забит ");
            }
        }
        public static void task7() {
            System.out.println(" Задача 7 ");
            int one = 80;
            int two = 70;
            int three = 900;
            if (one >= two && two >= three || one >= three && two < three) {
                System.out.println( + one+ " Самое большое число ");
            } else if (two>=one && one >= three ||  two>=three && three>one) {
                System.out.println( + two + " Самое большое число ");
            } else if (three>=two&&three>one){
                System.out.println( + three + " Самое большое число ");
            }else{
                System.out.println(" Все три числа равны ");
            }
            }
            }







