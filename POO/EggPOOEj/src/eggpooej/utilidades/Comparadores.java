
package eggpooej.utilidades;

import java.util.Comparator;
import eggpooej.entidades.Mascota;

public class Comparadores {
    public static Comparator<Mascota> ordenarXNombreDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getNombre().compareTo(t.getNombre());
            
        }
    };
    
}
