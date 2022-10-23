import cadena.Handler;
import cadena.HandlerDiputado;
import cadena.HandlerMinistro;
import cadena.HandlerPresidente;
import modelo.Documento;

public class Main {
    public static void main(String[] args) {
        Documento documento1 = new Documento("Resolucion 1", 1);
        Documento documento2 = new Documento("Resolucion 2", 2);
        Documento documento3 = new Documento("Resolucion 3", 3);

        System.out.println("Caso 1");
        AutorizaLectura.autorizarLectura(documento1);

        System.out.println();
        System.out.println("Caso 2");
        AutorizaLectura.autorizarLectura(documento2);

        System.out.println();
        System.out.println("Caso 3");
        AutorizaLectura.autorizarLectura(documento3);

    }
}
