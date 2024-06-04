import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


public class LibroVenta {


    String nombreDirectorio;

    private String nombreVenta;
    private String fechaVenta;



    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Vehiculo> vehiculos =  new ArrayList<Vehiculo>();

    public void guardarVenta(Cliente cliente,Vehiculo vehiculo){

        File directorio = new File("src/"+"fichero");
        File archivo = new File("src/"+"fichero"+"/"+getNombreVenta()+".txt");

        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
                try {
                    archivo.createNewFile();
                    FileWriter fileW = new FileWriter(archivo);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileW);

                    clientes.add(cliente);
                    vehiculos.add(vehiculo);

                    for (Iterator<Vehiculo> iterator = vehiculos.iterator(); iterator.hasNext();) {

                        Vehiculo vehiculo1 = iterator.next();


                        String elemento = vehiculo1.toStringPatente();

                        bufferedWriter.write(elemento);
                        bufferedWriter.newLine();
                    }

                    for (Iterator<Cliente> iterator = clientes.iterator(); iterator.hasNext();) {

                        Cliente cliente1 =  iterator.next();

                        String elemento = cliente1.toStringEdad();

                        bufferedWriter.write(elemento);
                        bufferedWriter.newLine();
                    }


                    bufferedWriter.write("Fecha venta: { "+getFechaVenta()+" }");
                    bufferedWriter.newLine();

                    bufferedWriter.write("Nombre venta : { "+getNombreVenta()+" }");
                    bufferedWriter.newLine();


                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.printf("Error al crear el directorio %s",nombreDirectorio);
                }
            } else {
                System.out.println("Error al crear directorio");
            }
        } else {
            System.out.println("Directorio ya esta creado");

        }
    }

    public String toStringVenta() {
        return "Nombre venta :{ "+ getNombreVenta() +" }";
    }

    public String toStringFecha() {
        return "fechaVenta: { " + getFechaVenta()+
                " }";
    }
}






