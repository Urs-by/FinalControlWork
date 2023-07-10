package AllAnimals.PackAnml;


import AllAnimals.Command;
import AllAnimals.PackAnimals;

import java.util.ArrayList;

public class Donkeys extends PackAnimals {

    String color;



    public Donkeys(String nickname, String species, String gender, String dob, ArrayList<Command> commands,
                   Integer carrying, Integer size, Float weight, String color) {
        super(nickname, species, gender, dob, commands, carrying, size, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Donkeys{" +
                "вид='" + species + '\'' +
                ", кличка='" + nickname + '\'' +
                ", пол='" + gender + '\'' +
                ", дата рождения='" + dob + '\'' +
                ", грузоподъемность=" + carrying +
                ", размер=" + size +
                ", вес=" + weight +
                ", окрас='" + color + '\'' +
                ", список команд=" + commands + '\'' +
                '}';
    }


}
