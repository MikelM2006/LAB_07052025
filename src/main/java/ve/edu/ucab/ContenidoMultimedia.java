package ve.edu.ucab;

public abstract class ContenidoMultimedia implements ContenidoReproducible{

    private String titulo;
    private String genero;
    private int duracion;
    private int vecesReproducido;
    private boolean esFavorito;

    //constructores
    public ContenidoMultimedia(String titulo, String genero, int duracion, int vecesReproducido, boolean esFavorito) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.vecesReproducido = vecesReproducido;
        this.esFavorito = esFavorito;
    }

    public ContenidoMultimedia(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.vecesReproducido = 0;
        this.esFavorito = false;
    }

    //Implements methods
    @Override
    public void reproducir() {
        vecesReproducido++;
        System.out.println("Reproduciendo: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public int obtenerDuracion() {
        return duracion;
    }

    @Override
    public String obtenerTitulo() {
        return titulo;
    }

    @Override
    public String obtenerGenero() {
        return genero;
    }

    @Override
    public boolean esFavorito() {
        return esFavorito;
    }


    //setters
    public void setEsFavorito(boolean esFavorito) {
        this.esFavorito = esFavorito;
    }

    //solo los hijos lo van a ver
    protected void registrarInteraccion(){
        System.out.println("Interaccion Registrada: " + titulo + genero);
        System.out.println("Fue reproducida un total de: " + vecesReproducido + " veces");
    }

    
}
