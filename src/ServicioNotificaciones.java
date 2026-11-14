public class ServicioNotificaciones {

    public void enviarNotificacion(CanalMensajeria canal,
                                   String destinatario,
                                   String texto) {

        System.out.println("==============================");

        canal.enviarMensaje(destinatario, texto);

        System.out.println("==============================");
    }
}
