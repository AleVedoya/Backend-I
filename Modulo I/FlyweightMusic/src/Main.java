import com.alevedoya.Cancion;
import com.alevedoya.FlyweightFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // lista de canciones "Let it be", "Yesterday", "Hey, Jude", "In My Life"

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        List<Cancion> listareproduccion = new ArrayList<>();

        Cancion cancion1 = factory.crearcanciones("Let it be");
        Cancion cancion2 = factory.crearcanciones("Yesterday");
        Cancion cancion3 = factory.crearcanciones("Hey, Jude");
        Cancion cancion4 = factory.crearcanciones("In My Love");


        listareproduccion.add(cancion1);
        listareproduccion.add(cancion2);
        listareproduccion.add(cancion3);
        listareproduccion.add(cancion4);

        listareproduccion.remove(cancion1);


        System.out.println("La lista de reproducción tiene las canciones: ");
        for (Cancion cancion : listareproduccion){
            System.out.println(cancion.toString());
        }
       }
}


