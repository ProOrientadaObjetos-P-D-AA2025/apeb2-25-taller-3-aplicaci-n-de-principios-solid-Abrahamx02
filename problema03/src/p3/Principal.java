/*package p3;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;
public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        MatriculaJardin mjardin = new MatriculaJardin();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        
        tipos.establecerMatriculaCampamento(mcamp);
        tipos.establecerMatriculaColegio(mcolegio);
        tipos.establecerPromedioTarifas();
        System.out.printf("%s\n", tipos);
    }
}
*/

package p1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> listaMatriculas = new ArrayList<>();

        listaMatriculas.add(new MatriculaCampamento());
        listaMatriculas.add(new MatriculaColegio());
        listaMatriculas.add(new MatriculaEscuela());
        listaMatriculas.add(new MatriculaJardin());
        listaMatriculas.add(new MatriculaMaternal());

        for (Matricula m : listaMatriculas) {
            m.establecerTarifa();
            System.out.printf("Tarifa: %.2f\n", m.obtenerTarifa());
        }
    }
}
