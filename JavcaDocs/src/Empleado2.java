

public class Empleado2 {
 
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    public boolean plus (double sueldoPlus){
        boolean aumento=false;
        if (edad>40 && compruebaNombre()){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }
    private boolean compruebaNombre(){
    	
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
 
   
    public Empleado2(){
        this ("", "", 0, 0);
    }
 
  
    public Empleado2(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }
}