package view;

import java.util.Scanner;

import Domain.Counter;
import Pets.*;
import Service.iAnimalDB;

public class ViewAnimalController {

    private iAnimalDB home;

    public ViewAnimalController(iAnimalDB home) {
        this.home = home;
    }

    private void printMenu(){
        System.out.println(
                        "\n1 - Список всех животных\n2 - Завести новое животное\n3 - Что умеет животное\n4 - Дрессировка\n0 - Выход");
    }

    private void printAnimalType(){
        System.out.println(
                        "\n1 - Кот\n2 - Собака\n3 - Хомяк\n0 - Выход");
    }

    public void run() {
        int target = 0;
        
         try (Counter cnt = new Counter()) {
            while (true) {
                printMenu();
                try {
                    target = promptInt("Выберите пункт меню: ");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                switch (target) {
                    case 1:
                        System.out.println(home);
                        break;
                    case 2:
                        int type = 0;
                        
                        while (true) {
                            printAnimalType();
                            try {
                                type = promptInt("Выберите пункт меню: ");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                continue;
                            }
                            if (type == 0){
                                break;
                            }

                            String row = prompt("Введите данные питомца в формате(\"кличка dd.mm.yyyy команда1,команда2,...,командаN\"): \n");
                            var pet = new Row();
                            try {
                                pet.parse(row);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                continue;
                            }
                            switch (type) {
                                case 1:
                                        home.addPet(new Cat(cnt.add(),pet.getName(), pet.getBirthday(), pet.getCommandList()));
                                    break;
                                    case 2:
                                        home.addPet(new Dog(cnt.add(),pet.getName(), pet.getBirthday(), pet.getCommandList()));
                                    break;
                                    case 3:
                                        home.addPet(new Hamster(cnt.add(),pet.getName(), pet.getBirthday(), pet.getCommandList()));
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }
                        break;
                    case 3:
                        try {
                            target = promptInt("Укажите ID животного: ");
                            home.getCmdListByID(target);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        break;

                    case 4:
                        try {
                            target = promptInt("Укажите ID животного: ");
                            var cmd = prompt("Укажите команду для дрессировки: ");
                            home.addCmdInList(target, cmd);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        
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
