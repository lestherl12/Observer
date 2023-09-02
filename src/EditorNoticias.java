import java.util.ArrayList;
import java.util.List;

class EditorNoticias {
    private List<Observador> suscriptores = new ArrayList<>();

    public void registrarSuscriptor(Observador suscriptor) {
        suscriptores.add(suscriptor);
    }

    public void publicarNoticia(Noticia noticia) {
        for (Observador suscriptor : suscriptores) {
            suscriptor.actualizar(noticia);
        }
    }
}

