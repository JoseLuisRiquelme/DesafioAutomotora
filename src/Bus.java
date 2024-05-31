public class Bus extends Vehiculo{

    int cantidadDeAsientos;

    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int asientosDisponibles(int cantidadDeAsientos){
        int asientosDisponibles = 45-cantidadDeAsientos;
        setCantidadDeAsientos(asientosDisponibles);
        System.out.println(getCantidadDeAsientos());
        return getCantidadDeAsientos();
    };
}
