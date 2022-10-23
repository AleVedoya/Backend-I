import cadena.HandlerDiputado;
import cadena.HandlerMinistro;
import cadena.HandlerPresidente;
import modelo.Documento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AutorizaLecturaTest {

    @BeforeEach
    public void setUp() {
    }

    @Test
    void testAutorizaLectura() {
        //Arrange
        Documento documento1 = new Documento("Resolucion 1", 1);
        Documento documento2 = new Documento("Resolucion 2", 2);
        Documento documento3 = new Documento("Resolucion 3", 3);

        HandlerDiputado diputado = new HandlerDiputado();
        HandlerMinistro ministro = new HandlerMinistro();
        HandlerPresidente presidente = new HandlerPresidente();

        //Act
        AutorizaLectura.autorizarLectura(documento1);
        AutorizaLectura.autorizarLectura(documento2);
        AutorizaLectura.autorizarLectura(documento3);

        //Assert
        Assertions.assertEquals("El Presidente puede leer este documento del tipo 3", presidente.leerDocumento(documento3));
        Assertions.assertEquals("El Diputado puede leer este documento del tipo 1", diputado.leerDocumento(documento2));
        Assertions.assertEquals("El Ministro puede leer este documento del tipo 2", ministro.leerDocumento(documento2));

    }

}