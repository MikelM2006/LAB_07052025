package ve.edu.ucab;

public abstract class ContenidoMultimedia implements ContenidoReproducible{

    private String titulo;
    private String genero;
    private int duracion;
    private int vecesReproducido;
    private boolean esFavorito;

    //constructor
    public ContenidoMultimedia(String titulo, String genero, int duracion, int vecesReproducido, boolean esFavorito) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.vecesReproducido = vecesReproducido;
        this.esFavorito = esFavorito;
    }

    //Implements methods
    @Override
    public void reproducir() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public int obtenerDuracion() {
        return 0;
    }

    @Override
    public String obtenerTitulo() {
        return "";
    }

    @Override
    public String obtenerGenero() {
        return "";
    }

    @Override
    public boolean esFavorito() {
        return false;
    }
}
