public class MiniBus extends Bus{

    String tipoViaje;

    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    @Override
    public String toString() {
        return "MiniBus{color: "+getColor()
                +"\npatente: "+getPatente()+
                "\ncantidad de asientos: "+getCantidadDeAsientos()+
                "\ntipo de viaje: "+getTipoViaje();
    }
    public void imprimeBus(MiniBus miniBus){

        System.out.println(miniBus.toString());
    }



}
