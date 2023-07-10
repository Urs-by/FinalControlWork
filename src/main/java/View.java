import AllAnimals.Animals;
import AllAnimals.Command;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class View {

    public static String StartMenu() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Выберите пункт меню: ");
        System.out.println("""
                1. добавить животное в каталог
                2. вывести список животных
                3. вывести команды, которые умеет выполнять животное
                4. обучить животное новым командам
                5. выйти из программы """);
        return enter.nextLine();
    }

    public static Integer enterType() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите номер вида животного: ");
        System.out.println("""
                1. собака
                2. кот
                3. хомяк
                4. лошадь
                5. осел
                6. верблюд
                7. другое """);
        return enter.nextInt();
    }

    public static String enterNick() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите кличку животного: ");
        return enter.nextLine();
    }

    public static String enterGende() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите пол животного: ");
        System.out.println("""                        
                м - мужская особь
                ж - женская особь """);
        return enter.nextLine();
    }

    public static String enterDOB() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите дату рождения животного в формате: дд.мм.гггг ");
        return enter.nextLine();
    }

    public static Integer enterSize() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите рост животного в см.:  ");
        return enter.nextInt();
    }

    public static Float enterWeight() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите вес животного в кг в формате кг,гр :  ");
        return enter.nextFloat();
    }

    public static String enterColor() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите цвет животного:  ");
        return enter.nextLine();
    }

    public static String enterLear() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите масть животного:  ");
        return enter.nextLine();
    }

    public static String enterKind() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите породу животного:  ");
        return enter.nextLine();
    }

    public static Float enterBodyLength() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите  длину тела животного в см в формате кг,гр:  ");
        return enter.nextFloat();
    }

    public static Float enterTailLength() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите длину хвоста животного в см в формате кг,гр:  ");
        return enter.nextFloat();
    }

    public static Integer enterHumps() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите количество горбов :  ");
        return enter.nextInt();
    }

    public static Integer enterСarrying() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите грузоподъемность животного в кг :  ");
        return enter.nextInt();
    }

    public static String nameCommand() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите команду:  ");
        return enter.nextLine();
    }

    public static String actionCommand(String command) {
        Scanner enter = new Scanner(System.in);
        System.out.printf("Введите действие, которое должно выполнить животное по команде:  %s \n", command);
        return enter.nextLine();
    }

    public static Command enterCommand() {
        String nameCommand = nameCommand();
        String actionCommand = actionCommand(nameCommand);
        Command commands = new Command(nameCommand, actionCommand);
        return commands;
    }

    public static ArrayList<Command> listCommand() {

        ArrayList<Command> listcommands = new ArrayList<>();

        while (true) {
            Scanner enter = new Scanner(System.in);
            System.out.println("""
                    Для  ввода команд нажмите 1:
                    Для выхода нажмите 2: """);
            if (enter.nextInt() == 1) {
                Command commands = enterCommand();
                listcommands.add(commands);
            } else break;
        }
        return listcommands;
    }

    public static void searchName(ArrayList<Animals> zoo, String name) {
        boolean result = false;
        for (Animals animals : zoo) {
            if (Objects.equals(animals.getNickname(), name)) {
                System.out.printf("%s, знает команды: %s\n", animals.getNickname(), animals.getCommands());
                result = true;
            }
        }
        if (!result) {
            System.out.println("Животное с данной кличкой в справочнике не найдено");
        }

    }

    public static void addCommand(ArrayList<Animals> zoo, String name) {
        boolean result = false;
        for (Animals animals : zoo) {
            if (Objects.equals(animals.getNickname(), name)) {
                result = true;
                System.out.printf("%s, знает команды: %s\n", animals.getNickname(), animals.getCommands());
                ArrayList<Command> listcommands = animals.getCommands();
                while (true) {
                    Scanner enter = new Scanner(System.in);
                    System.out.println("""
                            Для  ввода команд нажмите 1:
                            Для выхода нажмите 2: """);
                    if (enter.nextInt() == 1) {
                        Command newcommands = enterCommand();
                        listcommands.add(newcommands);

                        //;
                    } else break;
                }
                animals.setCommands(listcommands);
            }
        }
        if (!result) {
            System.out.println("Животное с данной кличкой в справочнике не найдено");
        }
    }

}
