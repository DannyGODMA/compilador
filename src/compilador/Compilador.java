package compilador;

public class Compilador {
    public static String[] info;
    

    public static void main(String[] args) {
              
        archivo a = new archivo();
        String s1 = a.leerTxt("/home/daniela/Descargas/ola");
        info=s1.split(" ");
        for (int i = 0; i < info.length; i++) {
           System.out.println(info[i]); 
        }
        
        boolean termino=false;
       int n=0;
       int vuelta = 0;
       boolean cambio=false;
        
        do {
            
           // System.out.println("Vueltas "+vuelta);
            tipoDato(info[n]);
            n++;
            nombreVariable(info[n]);
            n++;
            if (info[n].equals("=")) {
                System.out.println("= es valido");
                n++;
                
                valorVariable(info[n]);
                n++;
                
            }
                do {
                     cambio=false;
                    signo(info[n]);
                    n++;
                    valorVariable(info[n]);
                    n++;
                    if (info[n].equals(";")) {
                        cambio=true;
                    }    
                    
                    
                } while (cambio==false);
                
                
                if (info[n].equals(";")) {
                    System.out.println(" ; validado");
                    n++;
                    System.out.println("continua siguiente linea");
                    if (n==info.length) {
                        termino=true;
                        System.out.println(" FIN");
                    }
            }else{
                    System.out.println("error al validar ;");
                }
                vuelta++;
        } while (termino==false);

    }
    
    public static void tipoDato(String tipo){
        if (tipo.equals("int")) {
            System.out.println("tipo de dato validado");
        }else{
            System.out.println("tipo de dato invalido");
        }
    }
    
    public static void nombreVariable(String n){
       boolean esNumero =  n.matches("[+-]?\\d*(\\.\\d+)?");
        if (esNumero == true) {
            System.out.println("Nombre Variable Invalido");
        }else  {
            System.out.println("Nombre Variable Valido");
        }
    }
    
    public static void valorVariable(String n){
       boolean esNumero =  n.matches("[+-]?\\d*(\\.\\d+)?");
        if (esNumero == true) {
            System.out.println("Valor valido");
        }else  {
            System.out.println("Valor invalido");
        }
    }
    
    public static void signo(String n){
        String [] signos= {"+", "-","/", "*"};
        boolean correcto=false;
        
        for (int i = 0; i < signos.length; i++) {
            if (n.equals(signos[i])) {
                correcto=true;
            }
        }
        if (correcto== true) {
            System.out.println("Signo Valido");
            //correcto=false;
        }else  {
            System.out.println("Signo Invalido");
        }
    }
}