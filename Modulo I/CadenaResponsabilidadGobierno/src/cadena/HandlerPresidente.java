package cadena;

import modelo.Documento;

public class HandlerPresidente extends Handler {

    @Override
    public String leerDocumento(Documento documento) {
        return comprobarTipoDocumento(documento);
    }

    private String comprobarTipoDocumento(Documento documento) {
        String mensaje;
        if (documento.getTipo() == 1) {
            mensaje = "El Diputado, el Ministro y el Presidente pueden leer documentos del tipo " + documento.getTipo();
            System.out.println(mensaje);
        } else if (documento.getTipo() == 2) {
            mensaje = "El Ministro y el Presidente pueden leer documentos del tipo " + documento.getTipo();
            System.out.println(mensaje);
        }else{
            mensaje = "El Presidente puede leer documentos del tipo " + documento.getTipo();
            System.out.println(mensaje);
        }
        return mensaje;
    }
}
