import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntContainer container = new IntContainer();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Получить элемент");
            System.out.println("3. Удалить элемент");
            System.out.println("4. Вывести размер контейнера");
            System.out.println("5. Вывести все элементы");
            System.out.println("0. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите целое число для добавления:");
                    int valueToAdd = scanner.nextInt();
                    container.add(valueToAdd);
                    System.out.println("Элемент успешно добавлен.");
                    break;
                case 2:
                    System.out.println("Введите индекс для получения элемента:");
                    int indexToGet = scanner.nextInt();
                    try {
                        int element = container.get(indexToGet);
                        System.out.println("Элемент с индексом " + indexToGet + ": " + element);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Индекс вне диапазона.");
                    }
                    break;
                case 3:
                    System.out.println("Введите индекс для удаления элемента:");
                    int indexToRemove = scanner.nextInt();
                    try {
                        container.remove(indexToRemove);
                        System.out.println("Элемент успешно удален.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Индекс вне диапазона.");
                    }
                    break;
                case 4:
                    System.out.println("Размер контейнера: " + container.size());
                    break;
                case 5:
                    System.out.println("Элементы контейнера:");
                    for (int i = 0; i < container.size(); i++) {
                        System.out.println(container.get(i));
                    }
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Неверный ввод. Попробуйте еще раз.");
            }
        }
    }
}
