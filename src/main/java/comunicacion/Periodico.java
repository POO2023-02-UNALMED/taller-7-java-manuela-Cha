package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    public String getFecha(){
        return fecha;
    }

    public String getPrimicia (){
        return primicia;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString (){
        return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.getFecha() + "\n" + this.getPrimicia();
    }

    int palabrasTotales(int palabrasPagina){
        int factor = 10;
        return palabrasPagina * factor * super.getPaginas();
    }
}
