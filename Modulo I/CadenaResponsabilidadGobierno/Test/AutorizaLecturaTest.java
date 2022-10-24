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

        //Act
        System.out.println("Caso 1");
        String result1 = AutorizaLectura.autorizarLectura(documento1);
        System.out.println();
        System.out.println("Caso 2");
        String result2 = AutorizaLectura.autorizarLectura(documento2);
        System.out.println();
        System.out.println("Caso 3");
        String result3 = AutorizaLectura.autorizarLectura(documento3);

        //Assert
        Assertions.assertEquals("El Diputado, el Ministro y el Presidente pueden leer documentos del tipo 1", result1);
        Assertions.assertEquals("El Ministro y el Presidente pueden leer documentos del tipo 2", result2);
        Assertions.assertEquals("El Presidente puede leer documentos del tipo 3", result3);
    }

}