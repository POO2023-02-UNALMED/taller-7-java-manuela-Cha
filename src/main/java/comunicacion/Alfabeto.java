package comunicacion;

public class Alfabeto extends Pictograma {
    private static String[] letras;
    private String interpretacion;
    
    public Alfabeto (String origen, String[] letras, String interpretacion){
        super(origen);
        this.interpretacion = interpretacion;
        Alfabeto.letras = letras;
    }

    public String[] getLetras (){
        return Alfabeto.letras;
    }

    public void setInterpretacion (String interpretacion){
        this.interpretacion = interpretacion;
    }
    
    String interpretacion (){
        return this.interpretacion;
    }


    public String toString (){
        StringBuilder frase = new StringBuilder();
        for (int i = 0; i < Alfabeto.letras.length; i++){
            frase.append(Alfabeto.letras[i]); 
            frase.append(", ");
        }
        frase.delete(frase.length()-2, frase.length()-1);
        return frase.toString();
    }
    
    public int cantidadLetras (){
        int contador = 0;
        for (String Letra : Alfabeto.letras){
            contador += 1;
        }
        return contador;
    }
}
