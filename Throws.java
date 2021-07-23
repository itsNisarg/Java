import java.io.IOException;

public class Throws {
    public static void main(String [] args) throws IOException {
        try {
            Throws t1 = new Throws();
            t1.f1();
            Example e1 = new Example();
            e1.f1();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void f1() throws IOException
    {
        throw new IOException("Error");
    }
}

class Example
{
    public void f1() throws IOException {
        throw new IOException();
    }
}