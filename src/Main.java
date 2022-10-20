public class Main {
    public static void main(String[] args) {

        System.out.println("___________Задание 1 ___________");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();

        System.out.println("___________Задание 2 ___________");
        String fullNameUp = fullName.toUpperCase();
        System.out.println(fullNameUp);
        System.out.println();

        System.out.println("___________Задание 3 ___________");
        String fullName3 = "Иванов Семён Семёнович";
        String fullNameCorrect = fullName3.replace("ё", "е");
        System.out.println(fullNameCorrect);
    }
}