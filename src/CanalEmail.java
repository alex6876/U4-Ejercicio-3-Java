public class CanalEmail extends CanalMensajeria {

    @Override
    public void enviarMensaje(String destinatario, String texto) {

        System.out.println("Conectando con servidor de Email...");

        System.out.println("Enviando correo electronico...");
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + texto);

        System.out.println("Correo enviado correctamente.");
    }
}
