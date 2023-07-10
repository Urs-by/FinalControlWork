package AllAnimals.PackAnml;


import AllAnimals.Command;
import AllAnimals.PackAnimals;

import java.util.ArrayList;

public class Hors extends PackAnimals {
    String lear;

    public Hors(String nickname, String species, String gender, String dob, ArrayList<Command> commands,
                Integer carrying, Integer size, Float weight, String lear) {
        super(nickname, species, gender, dob, commands, carrying, size, weight);
        this.lear = lear;
    }

    @Override
    public String toString() {
        return "Hors{" +

                "вид='" + species + '\'' +
                ", кличка='" + nickname + '\'' +
                ", пол='" + gender + '\'' +
                ", дата рождения='" + dob + '\'' +
                ", грузоподъемность=" + carrying +
                ", размер=" + size +
                ", вес=" + weight +
                ", масть='" + lear + '\'' +
                ", список команд=" + commands + '\'' +
                '}';
    }
}
