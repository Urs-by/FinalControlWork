package AllAnimals.HomeAnml;

import AllAnimals.Command;
import AllAnimals.HomeAnimals;

import java.util.ArrayList;

public class Cats extends HomeAnimals {
    String kind;
    Float weight;
    public Cats(String nickname, String species, String gender, String dob, ArrayList<Command> commands, String color,
                String kind, Float weight ) {
        super(nickname, species, gender, dob, commands, color);
        this.kind = kind;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "вид='" + species + '\'' +
                ", кличка='" + nickname + '\'' +
                ", пол='" + gender + '\'' +
                ", дата рождения='" + dob + '\'' +
                ", окрас='" + color + '\'' +
                ", порода='" + kind + '\'' +
                ", вес=" + weight +
                ", список команд=" + commands + '\'' +
                '}';
    }
}
