package gt.edu.url.examen2.problema2;

/**
 *
 * @author tuxtor
 */
public class DemostracionLista implements DemoList {

    @Override
    public List<Integer> crearDemoLista() {
        List<Integer> listaSolucion = new ArrayList<>();
        listaSolucion.add(0, 4);
        listaSolucion.add(0, 3);
        listaSolucion.add(0, 2);
        listaSolucion.add(2, 1);
        listaSolucion.add(1, 5);
        listaSolucion.add(1, 6); 
        listaSolucion.add(3, 7);
        listaSolucion.add(0, 8);
        return listaSolucion;
    }
    
    
}
