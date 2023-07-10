package AllAnimals;

import java.util.ArrayList;

public abstract class HomeAnimals extends Animals {
    protected String color;

    public HomeAnimals(String nickname, String species, String gender, String dob, ArrayList<Command> commands, String color) {
        super(nickname, species, gender, dob, commands);
        this.color = color;

    }

    @Override
    public String toString() {
        return "HomeAnimals{" +
                "вид='" + species + '\'' +
                ", кличка='" + nickname + '\'' +
                ", пол='" + gender + '\'' +
                ", дата рождения='" + dob + '\'' +
                ", окрас='" + color + '\'' +
                '}';
    }

}