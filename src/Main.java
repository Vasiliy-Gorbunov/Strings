public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println("ФИО сотрудника - " + lastName + " " + firstName + " " + middleName);
    }

    public static void task2() {
        System.out.println("Задание 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }
}