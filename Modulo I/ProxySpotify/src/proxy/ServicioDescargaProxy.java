package proxy;

import com.company.model.Usuario;

public class ServicioDescargaProxy implements Servicio{

    @Override
    public void descargar(Usuario usuario) {
        if (validarUsuario(usuario.getTipoUsuario())){
            ServicioDescarga servicio = new ServicioDescarga();
            servicio.descargar(usuario);
        }else {
            System.out.println("El usuario " + usuario.getNombre() + " no es Premium");
        }
    }

    private boolean validarUsuario(String tipoUsuario) {
        return tipoUsuario.equals("Premium");
    }
}


