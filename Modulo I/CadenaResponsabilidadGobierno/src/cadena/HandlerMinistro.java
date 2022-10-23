package cadena;

import modelo.Documento;

public class HandlerMinistro extends Handler{

    @Override
    public String leerDocumento(Documento documento) {
        if (documento.getTipo() <= 2){
            System.out.println("El Ministro puede leer este documento del tipo " + documento.getTipo());
        }
        return this.getNextHandler().leerDocumento(documento);
    }
}
