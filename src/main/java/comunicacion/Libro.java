package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;


    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    } 

    public String getCo_autor (){
        return co_autor;
    }

    public String getEditorial(){
        return editorial;
    }

    public String getEdicion(){
        return edicion;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.getCo_autor() + "\n" + this.getEditorial() + "\n" + this.getEdicion();
    }

    public int palabrasTotales(int palabrasPagina){
        int factor = 2;
        return palabrasPagina * factor * super.getPaginas();
    }   
}
