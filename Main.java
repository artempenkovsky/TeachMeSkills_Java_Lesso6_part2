/**
 * Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который печатает название
 * должности и имплементировать этот метод в созданные классы.
 */
public class Main {
    public static void main(String[] args) {
        Interface dir = new Director("Григорьев Александр Сергеевич");
        dir.print(dir.getClass().getSimpleName());

        Interface emp = new Worker("Сан Саныч");
        emp.print(emp.getClass().getSimpleName());

        Interface acc = new Accountant("Зоя Петровна");
        acc.print(acc.getClass().getSimpleName());

    }
}