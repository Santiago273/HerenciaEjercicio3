public class SistemaNotificaciones {
    public static void main(String[] args) {
        // Crear el sistema de notificaciones
        Notificaciones notificaciones = new Notificaciones();

        // Crear canales de notificación
        CanalNotificacion correo = new CorreoElectronico("Juan", "Hola Juan, tienes un nuevo mensaje.", "juan@example.com");
        CanalNotificacion mensaje = new MensajeTexto("Maria", "Hola Maria, recuerda tu cita mañana.", "123456789");

        // Agregar canales
        notificaciones.agregarCanal(correo);
        notificaciones.agregarCanal(mensaje);

        // Enviar notificaciones
        System.out.println("Enviando notificaciones:");
        notificaciones.enviarNotificaciones();

        // Personalizar mensajes
        System.out.println("\nPersonalizando mensajes:");
        notificaciones.personalizarMensajes("Este es un mensaje personalizado.");

        // Enviar notificaciones personalizadas
        System.out.println("\nEnviando notificaciones personalizadas:");
        notificaciones.enviarNotificaciones();

        // Mostrar canales
        System.out.println("\nLista de canales:");
        notificaciones.mostrarCanales();
    }
}
