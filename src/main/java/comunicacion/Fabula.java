package comunicacion;

public class Fabula extends Escrito {
    private String enseñanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.enseñanza = enseñanza;
        this.interpretacion = interpretacion; 
    }

    public String getEnseñanza (){
        return this.enseñanza;
    }

	String interpretacion (){
        return this.interpretacion;
    }

	
	public String toString(){
        return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.getEnseñanza();
    }

    int palabrasTotales(int palabrasPagina){
        int factor = 1;
        return palabrasPagina * factor * super.getPaginas();
    }
}
