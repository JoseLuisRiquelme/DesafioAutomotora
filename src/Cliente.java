public class Cliente extends Persona{

    private String direccion;

    public Cliente(String rut, String nombre, int edad, String direccion) {
        super(rut, nombre, edad);
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente = {" +
                "direccion:'" + direccion + '\'' +
                ", rut:'" + getRut() + '\'' +
                ", nombre:'" + getNombre() + '\'' +
                ", edad:" + getEdad() +" anhos"+
                '}';
    }

    public String toStringEdad(){
        return "Edad del cliente: { "+getEdad()+ " anhos}";
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}


