

package compilador;
import java.io.BufferedReader;
import java.io.FileReader;

public class archivo {
    public String leerTxt(String direccion){ //direccion del archivo
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                
                temp = temp + bfRead; //guardado el texto del archivo
            }
            
            texto = temp;
            
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        return texto;
        
    }
}
