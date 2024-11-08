import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("escriba el numero de la pelicula de Star Wars que quiere consultar");

        try {
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);

        }catch (NumberFormatException e){
            System.out.println("numero no encontrado"+e.getMessage());
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("finalizando la aplicacion");

        }




    }
}
