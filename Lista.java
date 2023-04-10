import java.io.FileWriter;   
import java.io.IOException;  
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Lista {
  public static void main(String[] args) {
   try {
      //Creación del archivo
      FileWriter writeInFile = new FileWriter("Lista.txt");
        //Agregar contenido al archivo
        writeInFile.write("Producto: Hamburguesas x 10 \nCantidad: 2 \nPrecio: 1800.50 \nSubTotal: 3601 \nProducto: Pan x kg \nCantidad: 2 \nPrecio: 315 \nSubTotal: 630 \nProducto: Jugo de naranja \nCantidad: 3 \nPrecio: 175 \nSubTotal:525 \n\nTotalFinal: $4756");
        writeInFile.close();
     //System.out.println("El archivo fue creado");
    } catch (IOException x) {
      System.out.println("Hubo un error");
      x.printStackTrace();
    }
      //Lectura del archivo
            try{
           File extra = new File("/storage/emulated/0/Lista.txt");
           Scanner lect = new Scanner(extra);
           while(lect.hasNextLine()){
           String cont = lect.nextLine();
               System.out.println(cont);
    }
                }catch(FileNotFoundException e){
                    System.out.println("El archivo no existe");
                }
    
           }
        }
