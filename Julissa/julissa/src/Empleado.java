abstract class Empleado {

    private String nombre;
    private String Id;

    public Empleado(String nombre, String Id){
        this.nombre = nombre;
        this.Id = Id;
    }

    public String getNombre(){

        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNumeroId(){
        return Id;
    }

    public abstract double CalcularSalario();
    public abstract void CalcularSalario(double CalcularSalario);

}
