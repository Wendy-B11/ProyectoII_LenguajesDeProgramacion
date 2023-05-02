import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

        //Creamos la lista para guardar los objetos "Venta"
        List<Ventas> ventasList = new ArrayList<>();

        //Usamos BufferedReader y FileReader para leer el archivo sales_data.csv, con el try-catch hacemos control de errores
        try (BufferedReader br = new BufferedReader(new FileReader("sales_data.csv"))) {

            // Saltar la primera línea (encabezado)
            br.readLine();

            //Obtenemos stream de lineas usando .lines()
            //Llenamos ventasList usando la expresión regular "," para que se separe por comas, usando el .map para crear los objetos tipo Ventas
            ventasList = br.lines().map(linea -> {

                        String[] campos = linea.split(",");
                        Ventas ventas = new Ventas(Integer.parseInt(campos[0]), Integer.parseInt(campos[1]), Double.parseDouble(campos[2]), Integer.parseInt(campos[3]), Double.parseDouble(campos[4]), campos[5], campos[6], Integer.parseInt(campos[7]), Integer.parseInt(campos[8]), Integer.parseInt(campos[9]), campos[10], Integer.parseInt(campos[11]), campos[12], campos[13], campos[14], campos[15], campos[16], campos[17], campos[18], campos[19], campos[20], campos[21], campos[22], campos[23], campos[24]);
                        return ventas;

                    }).toList();

        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Ventas> ventasNYC = coleccionNewYork(ventasList);
        totalVentasNYC(ventasNYC);
        cantAutosClasicos(ventasNYC);
        ventAutosClasicos(ventasNYC);
        cantMotoNYC(ventasNYC);
        totalMotocicletasNY(ventasNYC);
        clienteMasAutosNY(ventasNYC);
        clienteMasCompra(ventasList);
        clienteMenosCompra(ventasList);


    }
    public static List<Ventas> coleccionNewYork(List<Ventas> ventasList){
        //Creamos una colección con las ventas de New York
        List<Ventas> ventasNYC = ventasList.stream().filter(venta -> "NYC".equals(venta.getCiudad())).collect(Collectors.toList());
        return ventasNYC;
    }
    public static void totalVentasNYC(List<Ventas> ventasNYC){
        //Total de las ventas de New York
        double salesNYC = ventasNYC.stream().mapToDouble(Ventas::getVentas).sum();
        System.out.println("¿Cuánto fue el total de las ventas de New York?: "+salesNYC);
    }
    public static void cantAutosClasicos(List<Ventas> ventasNYC){
        //Cantidad de autos clásicos de New York
        int cantAutosClasicos = (int)ventasNYC.stream().filter(venta -> venta.getProductLine().equals("Classic Cars")).count();
        System.out.println("¿Cuántos Autos Clásicos vendió New York?: " + cantAutosClasicos);
    }
    public static void ventAutosClasicos(List<Ventas> ventasNYC){
        //Total de las ventas de Autos Clásicos de New York
        double salesCCNYC = ventasNYC.stream().filter(venta -> venta.getProductLine().equals("Classic Cars")).mapToDouble(Ventas::getVentas).sum();
        System.out.println("¿Cuánto fue el total de ventas de Autos Clásicos en New York?: " + salesCCNYC);
    }
    public static void cantMotoNYC(List<Ventas> ventasNYC){
        //Cantidad de motocicletas de New York
        int cantMotocicletas = (int)ventasNYC.stream().filter(venta -> venta.getProductLine().equals("Motorcycles")).count();
        System.out.println("¿Cuántas motocicletas vendió New York?: " + cantMotocicletas);
    }

    public static void totalMotocicletasNY(List<Ventas> ventasNYC){
        //Total de las ventas de de motocicletas de New York
        double salesMNYC = ventasNYC.stream().filter(venta -> venta.getProductLine().equals("Motorcycles")).mapToDouble(Ventas::getVentas).sum();
        System.out.println("¿Cuánto fue el total de ventas de motocicletas en New York?: " + salesMNYC);
    }

    public static void clienteMasAutosNY(List<Ventas> ventasNYC){
        //Cliente que más autos compró en new york
        String clienteMasAutosNY = ventasNYC.stream().filter(venta -> venta.getProductLine().equals("Classic Cars")||venta.getProductLine().equals("Trucks and Buses")||venta.getProductLine().equals("Vintage Cars")).map(Ventas::getCostumerName).collect(Collectors.groupingBy(String::toString, Collectors.counting())).entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        System.out.println("¿Cuál es el cliente que más Autos compró en New York?: " + clienteMasAutosNY);
    }

    public static void clienteMasCompra(List<Ventas> ventasList){
        //Cliente que más compró del archivo
        String clienteMasCompra = ventasList.stream().map(Ventas::getCostumerName).collect(Collectors.groupingBy(String::toString, Collectors.counting())).entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        System.out.println("¿Cuál es el cliente que más compró?: " + clienteMasCompra);
    }

    public static void clienteMenosCompra(List<Ventas> ventasList){
        //Cliente que menos compró del archivo
        String clienteMenosCompra = ventasList.stream().map(Ventas::getCostumerName).collect(Collectors.groupingBy(String::toString, Collectors.counting())).entrySet().stream().min((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
        System.out.println("¿Cuál es el cliente que menos compró?: " + clienteMenosCompra);
    }


}