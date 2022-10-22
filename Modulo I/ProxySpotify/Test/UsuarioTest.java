import com.company.model.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import proxy.Servicio;
import proxy.ServicioDescargaProxy;

class UsuarioTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void validar_usuario_premium() {
        //Arrange
        Usuario usuario = new Usuario(10, "Ale", "Premium");
        Usuario usuario2 = new Usuario(15, "Fer", "Free");


        Servicio servicio = new ServicioDescargaProxy();

        //Act
        servicio.descargar(usuario);
        servicio.descargar(usuario2);

        //Assert
        Assertions.assertEquals("Premium", usuario.getTipoUsuario());
        Assertions.assertEquals("Premium", usuario2.getTipoUsuario());
    }

}