
package vehiculo;

/**
 *
 * @author Alfonso Barragán Moreno
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoBarraganMorenoAlfonso miVehiculoBarraganMorenoAlfonso2223;
        int stockActual;
        
        miVehiculoBarraganMorenoAlfonso2223 = new VehiculoBarraganMorenoAlfonso("Seat",18000,100);
        operativaVehiculoBarraganMorenoAlfonso2223(miVehiculoBarraganMorenoAlfonso2223, 50); 
    }

    private static void operativaVehiculoBarraganMorenoAlfonso2223(VehiculoBarraganMorenoAlfonso miVehiculoBarraganMorenoAlfonso2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoBarraganMorenoAlfonso2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoBarraganMorenoAlfonso2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoBarraganMorenoAlfonso2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
