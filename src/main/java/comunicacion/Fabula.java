package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion; 
    }

    public String getEnsenanza (){
        return this.ensenanza;
    }

	String interpretacion (){
        return this.interpretacion;
    }

	
	public String toString(){
        return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.getEnsenanza();
    }

    int palabrasTotales(int palabrasPagina){
        int factor = 1;
        return palabrasPagina * factor * super.getPaginas();
    }
}
