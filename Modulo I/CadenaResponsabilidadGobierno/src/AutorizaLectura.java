import cadena.HandlerDiputado;
import cadena.HandlerMinistro;
import cadena.HandlerPresidente;
import modelo.Documento;

public class AutorizaLectura {

    public static void autorizarLectura(Documento documento){

        HandlerDiputado handlerDiputado = new HandlerDiputado();
        HandlerMinistro handlerMinistro = new HandlerMinistro();
        HandlerPresidente handlerPresidente = new HandlerPresidente();

        handlerDiputado.setNextHandler(handlerMinistro);
        handlerMinistro.setNextHandler(handlerPresidente);

        handlerDiputado.leerDocumento(documento);
    }

}
