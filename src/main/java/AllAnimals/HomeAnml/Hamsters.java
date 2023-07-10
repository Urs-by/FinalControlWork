package AllAnimals.HomeAnml;


import AllAnimals.Command;
import AllAnimals.HomeAnimals;

import java.util.ArrayList;


public class Hamsters extends HomeAnimals {
    Float bodyLength;
    Float tailLength;
    public Hamsters(String nickname, String species, String gender, String dob, ArrayList<Command> commands, String color,
                    Float bodyLength, Float tailLength) {
        super(nickname, species, gender, dob, commands, color);
        this.bodyLength = bodyLength;
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Hamsters{" +
                "вид='" + species + '\'' +
                ", кличка='" + nickname + '\'' +
                ", пол='" + gender + '\'' +
                ", дата рождения='" + dob + '\'' +
                ", окрас='" + color + '\'' +
                ", длина тела =" + bodyLength +
                ", длина хвоста =" + tailLength +
                ", список команд=" + commands + '\'' +
                '}';
    }
}
