package cadena;

import modelo.Documento;

public class HandlerPresidente extends Handler {

    @Override
    public String leerDocumento(Documento documento) {
        comprobarTipoDocumento(documento);
        return "El Presidente puede leer documentos del tipo 1, 2 y 3";
    }

    private void comprobarTipoDocumento(Documento documento) {
        if (documento.getTipo() == 1) {
            System.out.println("El Presidente puede leer documentos del tipo 1");
        } else if (documento.getTipo() == 2) {
            System.out.println("El Presidente puede leer documentos del tipo 1 y 2");
        }else{
            System.out.println("El Presidente puede leer documentos del tipo 1, 2 y 3");
        }
    }
}
