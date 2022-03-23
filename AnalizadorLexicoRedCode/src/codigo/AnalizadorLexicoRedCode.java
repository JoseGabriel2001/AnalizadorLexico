
package codigo;

import java.io.File;

public class AnalizadorLexicoRedCode {

    public static void main(String[] args) {
        String ruta = "C:\\Users\\valie\\Documents\\Semestre Enero_Junio 2022\\Lenguajes y automatas II\\Unidad I\\AnalizadorLexico\\AnalizadorLexicoRedCode\\src\\codigo\\Lexico";
        generadorLexer(ruta);
    }
    
     public static void generadorLexer(String ruta){
        File archivo = new File(ruta);
        jflex.Main.generate(archivo);
    }
    
}
