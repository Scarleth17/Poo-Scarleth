public class EmpleadoMedioTiempo extends Empleado {

    private double salariohora;
    private int horastrabajadas;

    public EmpleadoMedioTiempo(String nombre,String Id, double salariohora,int horastrabajadas){
        super(nombre,Id);
        this.salariohora=salariohora;
        this.horastrabajadas=horastrabajadas;
    }
    @Override
    public double CalcularSalario(){
        return salariohora*horastrabajadas*4;
    
    }
    public double getSalariohora() {
        return salariohora;
    }
    public void setSalariohora(double salariohora) {
        this.salariohora = salariohora;
    }
    public int getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    @Override
    public void CalcularSalario(double CalcularSalario) {
    
    }
    

    


}
