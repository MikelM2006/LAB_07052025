package ve.edu.ucab;

public class Pelicula extends ContenidoMultimedia implements ContenidoDescargable{

    private String director;
    private String resolucion;

    //extensiones de ContenidoMultimedia
    public Pelicula(String titulo, String genero, int duracion, int vecesReproducido, boolean esFavorito) {
        super(titulo, genero, duracion, vecesReproducido, esFavorito);
    }
    public Pelicula(String titulo, String genero, int duracion) {
        super(titulo, genero, duracion);
    }

    //implementaciones de ContenidoDescargable
    @Override
    public double descargar() {
        return 0;
    }
    @Override
    public void verificarEspacioRequerido() {

    }
    @Override
    public double calcularPuntuacion(){
        return 0;
    }
}
