public class Main {
    public static void main(String[] args) {
                System.out.println("Задача 1");
                String firstName = "Семён";
                String lastName = "Иванов";
                String middleName = "Семёнович";
                String fullName = lastName + " " + firstName + " " + middleName;
                System.out.println("Фио сотрудника "+ fullName);
                System.out.println("Задача №2");
                String upperName = fullName.toUpperCase();
                System.out.println("Данные ФИО сотрудника для заполнения отчета "+ upperName);
                System.out.println("Задача №3");
                fullName = fullName.replace("ё","е");
                System.out.println(fullName);

            }
}