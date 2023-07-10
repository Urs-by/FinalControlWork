package AllAnimals;

public class Command {
    protected String name, acton ;

    public Command(String name, String action) {
        this.name = name;
        this.acton = action;
    }

    @Override
    public String toString() {
        return "{" +
                "команда='" + name + '\'' +
                ", действие='" + acton + '\'' +
                '}';
    }


}

