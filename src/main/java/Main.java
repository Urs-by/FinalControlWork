import AllAnimals.Animals;
import AllAnimals.Command;
import AllAnimals.HomeAnml.Cats;
import AllAnimals.HomeAnml.Dogs;
import AllAnimals.HomeAnml.Hamsters;
import AllAnimals.PackAnml.Camels;
import AllAnimals.PackAnml.Donkeys;
import AllAnimals.PackAnml.Hors;
import AllAnimals.MyFormatException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MyFormatException {
        View enter = new View();
        ArrayList<Animals> zoo = new ArrayList<>();
        while (true) {
            Integer start = Integer.valueOf(enter.StartMenu());
            if (start == 1) {
                Integer typeAnimals = enter.enterType();
                String nickName = enter.enterNick();
                String gender = enter.enterGende();
                verificationChar(gender);
                String dob = enter.enterDOB();
                verificationDate(dob);
                ArrayList<Command> command = enter.listCommand();

                switch (typeAnimals) {
                    case 1:
                        String speciesDog = "собака";
                        String kindDog = enter.enterKind();
                        String colorDog = enter.enterColor();
                        Integer sizeDog = enter.enterSize();
                        //ArrayList<Command> commandDogs = enter.listCommand();
                        Dogs dog = new Dogs(nickName, speciesDog, gender, dob, command, colorDog, kindDog, sizeDog);
                        // System.out.println(dog);
                        zoo.add(dog);
                        break;
                    case 2:
                        String speciesCat = "кот";
                        String colorCat = enter.enterColor();
                        String kindCat = enter.enterKind();
                        Float weightCat = enter.enterWeight();
                        Cats cat = new Cats(nickName, speciesCat, gender, dob, command, colorCat, kindCat, weightCat);
                        zoo.add(cat);
                        //  System.out.println(cat);
                        break;
                    case 3:
                        String speciesHam = "хомяк";
                        String colorHam = enter.enterColor();
                        Float bodyLength = enter.enterBodyLength();
                        Float tailLength = enter.enterTailLength();
                        Hamsters ham = new Hamsters(nickName, speciesHam, gender, dob, command, colorHam, bodyLength, tailLength);
                        zoo.add(ham);
                        // System.out.println(ham);
                        break;
                    case 4:
                        String speciesHors = "лошадь";
                        Integer carryingHors = enter.enterСarrying();
                        Integer sizeHors = enter.enterSize();
                        Float weightHors = enter.enterWeight();
                        String lear = enter.enterLear();
                        Hors hors = new Hors(nickName, speciesHors, gender, dob, command, carryingHors, sizeHors, weightHors, lear);
                        zoo.add(hors);
                        // System.out.println(hors);
                        break;
                    case 5:
                        String speciesDonky = "осел";
                        Integer carryingDonky = enter.enterСarrying();
                        Integer sizeDonky = enter.enterSize();
                        Float weightDonky = enter.enterWeight();
                        String colorDonky = enter.enterColor();
                        Donkeys donky = new Donkeys(nickName, speciesDonky, gender, dob, command, carryingDonky, sizeDonky, weightDonky, colorDonky);
                        zoo.add(donky);
                        // System.out.println(donky);
                        break;
                    case 6:
                        String speciesCamel = "верблюд";
                        Integer carryingCamel = enter.enterСarrying();
                        Integer sizeCamel = enter.enterSize();
                        Float weightCamek = enter.enterWeight();
                        Integer humps = enter.enterHumps();
                        Camels camel = new Camels(nickName, speciesCamel, gender, dob, command, carryingCamel, sizeCamel, weightCamek, humps);
                        zoo.add(camel);
                        // System.out.println(camel);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + typeAnimals);
                }
            } else if (start == 2) {
                for (int i = 0; i < zoo.size(); i++) {
                    System.out.println(zoo.get(i));

                }
            } else if (start == 3) {
                String serchNick = enter.enterNick();
                enter.searchName(zoo, serchNick);


            } else if (start == 4) {
                String serchNick = enter.enterNick();
                enter.addCommand(zoo, serchNick);

            }else break;

        }
    }

    private static void verificationDate(String element) throws MyFormatException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date = LocalDate.parse(element, formatter);
        } catch (Exception e) {
            System.out.println("Вы неправильно ввели дату рождения, дата рождения - строка формата dd.mm.yyyy");
            String string = "Дата рождения";
            throw new MyFormatException(string);
        }
    }

    private static void verificationChar(String element) throws MyFormatException {
        if (!element.equals("ж") && !element.equals("м")) {
            System.out.println("Вы неправильно ввели пол, пол - символ ж-женский, м-мужской");
            String string = "Пол";
            throw new MyFormatException(string);
        }
    }

}