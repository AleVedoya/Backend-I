package cadena;

import modelo.Documento;

public class HandlerMinistro extends Handler{

    @Override
    public String leerDocumento(Documento documento) {
        //comprobarTipoDocumento(documento);
        return this.getNextHandler().leerDocumento(documento);
    }

    /*private void comprobarTipoDocumento(Documento documento) {
        if (documento.getTipo() == 1) {
            System.out.println("El Ministro puede leer documentos del tipo 1");
        } else if (documento.getTipo() == 2) {
            System.out.println("El Ministro puede leer documentos del tipo 1 y 2");
        }else {
            System.out.println("El Ministro no puede leer documentos de este tipo");
        }
    }*/
}
