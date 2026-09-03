package oop.projectgalacticfleetmanagement.app;

import oop.projectgalacticfleetmanagement.entities.Commander;
import oop.projectgalacticfleetmanagement.entities.Spacecraft;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageFleet {
    private List<Commander> commanders = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static void main() {
        ManageFleet manage = new ManageFleet();
        int option;
        do {
            manage.menu();
            option = manage.scanner.nextInt();
            switch (option) {
                case 1 -> manage.execRegisterCommander();
                case 2 -> {
                    if (manage.exist()) {
                        manage.execAssignShip();
                    } else System.out.println("YOU NEED A COMMANDER FIRST");
                }
                case 3 -> {
                    if (manage.exist()) {
                        manage.execFullFleet();
                    } else System.out.println("YOU NEED A COMMANDER FIRST");
                }
                case 4 -> {
                    if (manage.exist()) {
                        manage.execShipsByCommander();
                    } else System.out.println("YOU NEED A COMMANDER FIRST");
                }
                case 5 -> {
                    if (manage.exist()) {
                        manage.execTotalShips();
                    } else System.out.println("YOU NEED A COMMANDER FIRST");
                }
                case 6 -> {
                    if (manage.exist()) {
                        manage.execTotalCommanders();
                    } else System.out.println("YOU NEED A COMMANDER FIRST");
                }
                case 9 -> System.out.println("EXITING SYSTEM... GOODBYE!");
            }
        } while (option != 9);
    }

    private void menu() {
        System.out.println("=====MENU=====");
        System.out.println("1. Register commander");
        System.out.println("2. Assign a ship to a commander");
        System.out.println("3. Show full fleet");
        System.out.println("4. Report: Ships by commander");
        System.out.println("5. Grand total of ships in the alliance");
        System.out.println("6. Total of commanders");
        System.out.println("9. Leave");

    }

    private void execRegisterCommander() {
        Commander commander = new Commander();
        scanner.nextLine();
        System.out.println("REGISTER COMMANDER SELECT");
        System.out.println("Input the name");
        commander.setName(scanner.nextLine());
        System.out.println("Input the credential");
        commander.setCredential(scanner.nextLine());
        System.out.println("Input the patent");
        commander.setPatent(scanner.nextLine());


        try {
            System.out.println("Input year of commissioning date: ");
            int year = scanner.nextInt();
            System.out.println("Input month of commissioning date: ");
            int month = scanner.nextInt();
            System.out.println("Input day of commissioning date: ");
            int day = scanner.nextInt();
            commander.setCommissioningDate(LocalDate.of(year, month, day));
            commanders.add(commander);
            System.out.println("COMMANDER REGISTERED");
        } catch (DateTimeException e){
            System.out.println("Invalid date! Commander was not registered: "+ e.getMessage());
        }
    }

    private void execAssignShip() {
        System.out.println("Current commanders: ");
        System.out.println("ID   | Name ");
        int pos = 1;
        for (Commander commander : commanders) {
            System.out.printf("%4d | %-50s\n", pos, commander.getName());
            pos++;
        }
        System.out.println("Select the commander ID to register the vehicle.");
        pos = scanner.nextInt();
        pos--;
        Spacecraft spaceship = new Spacecraft();
        scanner.nextLine();
        System.out.println("Input the name of spaceship:");
        spaceship.setName(scanner.nextLine());
        System.out.println("Input the class:");
        spaceship.setClassSpaceship(scanner.nextLine());
        System.out.println("Input the year of manufacture:");
        spaceship.setYearManufacture(scanner.nextInt());
        System.out.println("Input the fire power:");
        spaceship.setFirePower(scanner.nextDouble());
        commanders.get(pos).addSpaceship(spaceship);
        System.out.println("Spaceship " + spaceship.getName() + " added to commander " + commanders.get(pos).getName());
    }

    private void execFullFleet() {
        for (Commander commander : commanders) {
            System.out.println(commander);
        }
    }

    private void execShipsByCommander() {
        for (Commander commander : commanders) {
            if (commander.getSpaceships().isEmpty()) {
                System.out.println("Commander " + commander.getName() + " doesn't have spaceships");
            } else {
                System.out.println("Commander " + commander.getName() + " has " + commander.getSpaceships().size() + " spaceships");
            }
        }
    }

    private void execTotalShips() {
        int quantity = 0;
        for (Commander commander : commanders) {
            quantity += commander.getSpaceships().size();
        }
        System.out.println("The total of spaceships in the alliance is " + quantity);
    }

    private void execTotalCommanders() {
        System.out.println("The total of commanders in the alliance is " + commanders.size());
    }

    private boolean exist() {
        return !commanders.isEmpty();
    }

}
