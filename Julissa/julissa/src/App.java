public class App {
    public static void main(String[] args) throws Exception {

        Empleado empleados[]=new Empleado[3];

        empleados[0] = new EmpleadoTiempoCompleto("Juana Vindel", ", Sv202415",    200000);
        System.out.println();
        empleados [1]=new EmpleadoTiempoCompleto("Maria Perez", ", MP34567",   100000);
        empleados[2]= new EmpleadoMedioTiempo("Juan Garcia", "JG23456", 350, 5);

        System.out.println();
        for(Empleado empleado:empleados){
            System.out.println("Empleado:"  + empleado.getNombre( )  + ",  Salario Empleado:"   +   empleado.CalcularSalario());
        }
    }    
}
