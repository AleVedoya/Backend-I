package cadena;

import modelo.Documento;

public class HandlerPresidente extends Handler {
    @Override
    public String leerDocumento(Documento documento) {
        return "El Presidente puede leer este documento del tipo " + documento.getTipo();
    }
}
