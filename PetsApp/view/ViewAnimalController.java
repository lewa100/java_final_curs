package view;

import java.util.Scanner;

import Service.iAnimalDB;

public class ViewAnimalController {

    private iAnimalDB home;

    public ViewAnimalController(iAnimalDB home) {
        this.home = home;
    }

    private void printMenu(){
        System.out.println(
                        "\n1 - Список всех животных\n2 - Завести новое животное\n3 - Изменить данные о животном\n4 - Что умеет животное\n5 - Дрессировка\n6 - Удалить запись\n0 - Выход");
    }

    private void printAnimalType(){
        System.out.println(
                        "\n1 - Список всех животных\n2 - Завести новое животное\n3 - Изменить данные о животном\n4 - Что умеет животное\n5 - Дрессировка\n6 - Удалить запись\n0 - Выход");
    }

    public void run() {
        while (true) {
            printMenu();
            int target = promptInt("Выберите пункт меню: ");
            switch (target) {
                case 1:
                    
                    break;
                case 2:
                    printAnimalType();
                    break;
            
                default:
                    break;
            }
            if (target != 0) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
