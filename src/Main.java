public class Main {
    public static void main(String[] args) {
        int score = 70;
        if (score <= 60) {
            System.out.println("Ты не прошел тест");
        } else {
            System.out.println("Ты прошел тест");
        }
        int age = 19;
        if (age >= 18 && age <=21) {
            System.out.println("Ты достаточно взрослый, чтобы водить машину, но недостаточно, чтобы пить алкоголь");
        }

        if (age < 18) {
            System.out.println("Ты не можешь водить");
        }
    }

}