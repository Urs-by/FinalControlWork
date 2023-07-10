package AllAnimals.PackAnml;


import AllAnimals.Command;
import AllAnimals.PackAnimals;

import java.util.ArrayList;

public class Camels extends PackAnimals {
    Integer humps;
    public Camels(String nickname, String species, String gender, String dob, ArrayList<Command> commands,
                  Integer carrying, Integer size, Float weight, Integer humps) {
        super(nickname, species, gender, dob, commands, carrying, size, weight);
        this.humps = humps;
    }

    @Override
    public String toString() {
        return "Camels{" +
                "вид='" + species + '\'' +
                ", кличка='" + nickname + '\'' +
                ", пол='" + gender + '\'' +
                ", дата рождения='" + dob + '\'' +
                ", грузоподъемность=" + carrying +
                ", размер=" + size +
                ", вес=" + weight +
                ", горбов=" + humps +
                ", список команд=" + commands + '\'' +
                '}';
    }
}
