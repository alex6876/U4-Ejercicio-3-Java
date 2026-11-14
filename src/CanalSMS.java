public class CanalSMS extends CanalMensajeria {

    @Override
    public void enviarMensaje(String destinatario, String texto) {

        System.out.println("Conectando con proveedor de SMS...");

        System.out.println("Enviando mensaje SMS...");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + texto);

        System.out.println("SMS enviado correctamente.");
    }
}
