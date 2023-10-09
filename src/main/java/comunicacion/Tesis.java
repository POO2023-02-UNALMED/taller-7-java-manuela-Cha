package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea(){
        return idea;
    }

    public int getArgumentos(){
        int contadorArgs = 0;
        for (String arg : argumentos){
            contadorArgs += 1;
        }
        return contadorArgs;
    }

    public String getConclusion(){
        return conclusion;
    }

    public String getReferencias(){
        return referencias;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + this.getIdea() + "\n" + this.getArgumentos() + "\n" + this.getConclusion() + "\n" + this.getReferencias();
    }

    public int palabrasTotales(int palabrasPagina){
        int factor = 5;
        return palabrasPagina * factor * super.getPaginas();
    }
}
