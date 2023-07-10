package AllAnimals.HomeAnml;


import AllAnimals.Command;
import AllAnimals.HomeAnimals;

import java.util.ArrayList;

public class Dogs extends HomeAnimals {
    String kind;
    Integer size;


    public Dogs(String nickname, String species, String gender, String dob, ArrayList<Command> commands, String color,
                String kind, Integer size) {
        super(nickname, species, gender, dob, commands, color);
        this.size = size;
        this.kind = kind;


    }

    @Override
    public String toString() {
        return "Dogs{" +
                "вид='" + species + '\'' +
                ", кличка='" + nickname + '\'' +
                ", пол='" + gender + '\'' +
                ", дата рождения='" + dob + '\'' +
                ", окрас='" + color + '\'' +
                ", порода='" + kind + '\'' +
                ", размер=" + size + '\'' +
                ", список команд=" + commands + '\'' +
                '}';
    }


}