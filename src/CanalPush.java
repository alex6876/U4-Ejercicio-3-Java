public class CanalPush extends CanalMensajeria {

    @Override
    public void enviarMensaje(String destinatario, String texto) {

        System.out.println("Conectando con servidor Push...");

        System.out.println("Enviando notificacion movil...");
        System.out.println("Dispositivo: " + destinatario);
        System.out.println("Mensaje: " + texto);

        System.out.println("Notificacion Push enviada correctamente.");
    }
}
