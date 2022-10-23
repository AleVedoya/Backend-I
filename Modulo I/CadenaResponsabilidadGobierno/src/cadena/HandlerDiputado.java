package cadena;

import modelo.Documento;

public class HandlerDiputado extends Handler{


    @Override
    public String leerDocumento(Documento documento) {
        if (documento.getTipo() == 1){
            System.out.println("El Diputado puede leer este documento del tipo " + documento.getTipo());
        }
        return this.getNextHandler().leerDocumento(documento);
    }
}
