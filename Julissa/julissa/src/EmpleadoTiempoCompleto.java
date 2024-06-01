public class EmpleadoTiempoCompleto extends Empleado{

    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, String Id,double salarioAnual){
        super(nombre,Id);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double CalcularSalario(){
        return salarioAnual/12;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    @Override
    public void CalcularSalario(double CalcularSalario) {
        
  }
}   