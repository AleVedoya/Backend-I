package cadena;

import modelo.Documento;

public class HandlerDiputado extends Handler{

    @Override
    public String leerDocumento(Documento documento) {
        comprobarTipoDocumento(documento);
        return this.getNextHandler().leerDocumento(documento);
    }

    public void comprobarTipoDocumento(Documento documento){
        String mensaje;
        if (documento.getTipo() == 1){
            mensaje = "El Diputado puede leer documentos del tipo " + documento.getTipo();
            System.out.println(mensaje);
        }
    }
}
