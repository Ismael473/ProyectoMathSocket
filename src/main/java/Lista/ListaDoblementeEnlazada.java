package Lista;

public class ListaDoblementeEnlazada {

    private Nodo primero;
    private Nodo ultimo;

    public void agregar(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if(primero == null){
            primero = nuevo;
            ultimo = primero;
        }else{
            Nodo temporal = ultimo;
            ultimo = nuevo;
            ultimo.setAnterior(temporal);
            temporal.setSiguiente(ultimo);

        }
    }

    public void eliminar(int valor){
        Nodo temporal = null;//nodo que se desea eliminar
        Nodo auxiliar = null;//nodo que está antes del que queremos eliminar

        if (primero != null) {

            if(primero.getValor() == valor) {
                // se desea eliminar el primero
                temporal = primero;
                primero = temporal.getSiguiente();
                primero.setAnterior(null);
            }else if (ultimo.getValor() == valor){
                
            }
        }

    }

    public void consultar(){

    }
}
