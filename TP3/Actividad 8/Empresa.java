import java.util.List;
import java.util.ArrayList;

public class Empresa{
    private List<Empleado> empleados;
    
    public Empresa(){
        this.empleados = new ArrayList<Empleado>();
    }
    
    public void agregarEmpleado(Empleado e){
        if(e == null){
            throw new IllegalArgumentException(
            "Empleado no existe.");
        }
        this.empleados.add(e);
    }
    
    public double montoTotal(){
        double total = 0;
        for(Empleado e : empleados){
            total += e.calcularSalario();
        }
        return total;
    }
}