package proxy;

import com.company.model.Usuario;

public class ServicioDescarga implements Servicio {

    @Override
    public void descargar(Usuario usuario) {
        System.out.println("Descargando....");

    }
}
