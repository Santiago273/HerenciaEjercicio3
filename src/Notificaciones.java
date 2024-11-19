import java.util.ArrayList;

public class Notificaciones {
    private ArrayList<CanalNotificacion> canales;

    public Notificaciones() {
        this.canales = new ArrayList<>();
    }

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
    }

    public void personalizarMensajes(String nuevoMensaje) {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje(nuevoMensaje);
            }
        }
    }

    public void mostrarCanales() {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof CorreoElectronico) {
                CorreoElectronico correo = (CorreoElectronico) canal;
                System.out.println("Canal: Correo Electrónico, Dirección: " + correo.getDireccionCorreo());
            } else if (canal instanceof MensajeTexto) {
                MensajeTexto mensaje = (MensajeTexto) canal;
                System.out.println("Canal: Mensaje de Texto, Número: " + mensaje.getNumeroTelefono());
            }
        }
    }
}
