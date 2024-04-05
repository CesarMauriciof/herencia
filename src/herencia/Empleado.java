
package herencia;


public class Empleado extends Persona{
    
    private double sueldo;

    public Empleado(double sueldo, String nombre, String apellido, String documento) {
        super(nombre, apellido, documento);
        this.sueldo = sueldo;
    }
    
    public String mostrarEmpleado(){
    
    return getNombre()+ "Apellido\n"+getApellido()+ "Documento"+ getDocumento()+"Nombre"+ getNombre()+ "Sueldo"+sueldo;
    
    }
    
}
