public class Taxi {

    int valorPasaje;

    public Taxi(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int pagarPasaje(int valorPasaje){

        if(valorPasaje<1000){
            System.out.println("El dinero es insuficiente para pagar el pasaje");
            return valorPasaje;
        }
         if(valorPasaje==1000)
        {setValorPasaje(valorPasaje);
            System.out.println("A pagado su pasaje exitosamente");
        return valorPasaje;
        }
         if(valorPasaje>1000){
            int vuelto=valorPasaje-1000;
            setValorPasaje(1000);
            return vuelto;
        }
        return valorPasaje;
    }
}
