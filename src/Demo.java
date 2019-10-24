import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<AsciiArt> cosas = new ArrayList<>();
        cosas.add(new Cuadrado(3,'o'));
        cosas.add(new Triangulo(5, 't'));
        for(AsciiArt cosa : cosas)
            dibuja(new Marco(cosa, '.'));



    }

    private static void dibuja(AsciiArt art) {
        for (String linea : art.getLineas()) System.out.println(linea);
    }
}
