package AllAnimals;

public class MyFormatException extends Exception{
    public MyFormatException(String key) {
        super(String.format("%s , не верный формат данных!", key));
    }
}
