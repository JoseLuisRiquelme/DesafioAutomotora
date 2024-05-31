public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("rojo","pp-ll-55");

        Taxi taxi= new Taxi(700);

        Bus bus = new Bus("Azul","xx-yy-00",45);

        MiniBus miniBus = new MiniBus("Verde","ee-ii-22",25,"Corporativo");

        Cliente cliente = new Cliente("99.555.222.-1","Nombre1",20,"Calle falsa 1234");

        Vendedor vendedor = new Vendedor("99.555.222.-2","Nombre2",21,"Calle falsa 1235");

        Tienda tienda = new Tienda(vendedor,vehiculo,25);

        taxi.pagarPasaje(700);

        bus.asientosDisponibles(42);

        miniBus.imprimeBus(miniBus);

        tienda.existeStock(44);



    }
}