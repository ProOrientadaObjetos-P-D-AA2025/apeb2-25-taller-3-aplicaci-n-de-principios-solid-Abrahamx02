/*package p1;
public class MatriculaJardin {
    private double tarifa;           
    public void establecerTarifa(){
        // tarifa = costo desayunos + costo libros + costo paseos
        tarifa = 50.2 + 140.2 + 40;
    }        
    public double obtenerTarifa(){
        return tarifa;
    }
}
*/
package p1;
public class MatriculaJardin extends Matricula {
    @Override
    public void establecerTarifa() {
        tarifa = 80.00;
    }
}

