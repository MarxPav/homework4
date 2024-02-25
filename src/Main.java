public class Main {
    public static void main(String[] args) {
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " то он совершеннолетний");
        }
        int age2 = 17;
        if (age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + " то он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperature1 = 0;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градусов, нужно надеть шапку");
        }
        int temperature2 = 13;
        if (temperature2 > 5) {
            System.out.println("На улице " + temperature2 + " градусов, можно идти без шапки");
        }
        int speed1 = 78;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + " то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed1 + " то можно ездить спокойно");
        }
        int age3 = 14;
        if (age3 >= 2 && age3 <= 6) {
            System.out.println("Если возраст равен " + age3 + " то ему нужно ходить в детский сад");
        } else if (age3 >= 7 && age3 <= 17) {
            System.out.println("Если возвраст равен " + age3 + " то ему нужно ходит в школу");
        } else if (age3 >= 18 && age3 <= 24) {
            System.out.println("Если возраст равен " + age3 + " то ему нужно ходить в университет");
        } else  if (age3 > 24) {
            System.out.println("Если возраст равен " + age3 + " то ему нужно ходить на работу");
        }
        int age4 = 13;
        if (age4 < 5) {
            System.out.println("Если возраст рёбенка равен " + age4 + " то ему нельзя кататься на аттракционе");
        } else if (age4 < 5 || age4 < 14) {
            System.out.println("Если возраст ребёнка равен " + age4 + " то ему можно кататься в сопровождении родителей");
        } else if (age4 > 14) {
            System.out.println("Если возраст ребёнка равен " + age4 + " то ему можно кататься без сопровождения родителей");
        }
        int carriageCapacity = 102;
        int seatPlace = 60;
        int passengers = 58;
        if (passengers > seatPlace && passengers > carriageCapacity) {
            System.out.println("Вагон полностью забит");
        } else if (passengers > seatPlace && passengers < carriageCapacity) {
            System.out.println("В вагоне осталось " + (carriageCapacity - passengers) + " стоячих мест");
        } else if (passengers < seatPlace) {
            System.out.println("В вагоне осталось " + (seatPlace - passengers) + " сидячих места и " + (carriageCapacity - seatPlace) + " стоячих места");
        }
        int one = 34;
        int two = 69;
        int three = 666;
        boolean biggestOne = one > two && one > three;
        boolean biggestTwo = two > one && two > three;
        if (biggestOne) {
            System.out.println("Число " + one + " наибольшее из всех");
        } else if (biggestTwo) {
            System.out.println("Число " + two + " наибольшее из всех");
        } else
            System.out.println("Число " + three + " наибольшее из всех");


        }

        }

