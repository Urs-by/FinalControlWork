package AllAnimals;

import java.util.ArrayList;

public abstract class Animals {
    protected String nickname, species, gender, dob;
    protected ArrayList<Command> commands;



    public Animals(String nickname, String species, String gender, String dob,  ArrayList<Command> commands) {
        this.nickname = nickname;
        this.species = species;
        this.gender = gender;
        this.dob = dob;
        this.commands =commands;
    }

    public Animals() {

    }

    public String getNickname() {
        return nickname;
    }

    public String getSpecies() {
        return species;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public ArrayList<Command> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<Command> commands) {
        this.commands = commands;
    }
}
