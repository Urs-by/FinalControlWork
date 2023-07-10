package AllAnimals;


import java.io.IOException;

public class Counter implements AutoCloseable {
    int number;
    boolean closed = false;
    public void add() throws IOException {
        if (closed) throw new IOException("Ресурс закрыт");
        number++;
    }

    @Override
    public void close() throws Exception {
        closed = true;
    }

    public int getNumber() {
        return number;
    }
}

