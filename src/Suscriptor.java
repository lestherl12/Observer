class Suscriptor implements Observador {
    private String nombre;

    public Suscriptor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(Noticia noticia) {
        System.out.println(nombre + " ha recibido una noticia: " + noticia.getTitulo() + "\n" + noticia.getContenido() + "\n");
    }
}