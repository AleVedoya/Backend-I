import com.company.model.Usuario;
import proxy.Servicio;
import proxy.ServicioDescargaProxy;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario(10, "Ale", "Premium");
        Usuario usuario2 = new Usuario(15, "Fer", "Free");

        Servicio servicio = new ServicioDescargaProxy();

        servicio.descargar(usuario);
        servicio.descargar(usuario2);
    }
}
