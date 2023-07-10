package AllAnimals;


import java.util.ArrayList;

public abstract class PackAnimals extends Animals {
    protected Integer carrying;
    protected Integer size;
    protected Float weight;

    public PackAnimals(String nickname, String species, String gender, String dob, ArrayList<Command> commands,
                       Integer carrying, Integer size, Float weight) {
        super(nickname, species, gender, dob, commands);
        this.carrying = carrying;
        this.size = size;
        this.weight = weight;


    }
}