public class Main {

    public static void main(String[] args) {



        CanalEmail email = new CanalEmail();

        CanalSMS sms = new CanalSMS();

        CanalPush push = new CanalPush();



        ServicioNotificaciones servicio = new ServicioNotificaciones();



        servicio.enviarNotificacion(
                email,
                "usuario@gmail.com",
                "Bienvenido a nuestra plataforma."
        );

        servicio.enviarNotificacion(
                sms,
                "2611234567",
                "Su codigo de verificacion es 123456."
        );

        servicio.enviarNotificacion(
                push,
                "Dispositivo Android",
                "Tiene una nueva notificacion."
        );
    }
}
