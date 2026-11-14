Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Servicio de Notificaciones Multicanal (Clases Abstractas, Herencia y Polimorfismo en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🔔 Simulación de Servicio de Notificaciones Multicanal (Clases Abstractas y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema centralizado de alertas y mensajería, implementando una arquitectura basada en clases abstractas y herencia para administrar distintos canales de transmisión (correo electrónico, mensajes de texto SMS y notificaciones push móviles) a través de un componente gestor desacoplado. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **implementación obligatoria de contratos en clases abstractas (`abstract`)**, la sobrescritura polimórfica de comportamiento (`@Override`), la inyección de dependencias por parámetros y el procesamiento unificado mediante referencias de la superclase en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base abstracta, sus respectivas subclases especializadas, un componente controlador y un punto de ejecución:

* **`CanalMensajeria` (Clase Abstracta)**: Define el contrato genérico para cualquier medio de comunicación implementado en el sistema.
* **Método abstracto**: `abstract void enviarMensaje(String destinatario, String texto)`: Obliga de forma contractual a todas las subclases a proveer su propia lógica de conexión y envío.


* **`CanalEmail`**: Extiende de `CanalMensajeria` para modelar envíos a través del protocolo de correo electrónico.
* **Sobrescritura (`@Override`)**:
* `enviarMensaje(String destinatario, String texto)`: Simula la conexión con el servidor de correo, muestra la dirección destinataria y el mensaje, y confirma el envío correcto.




* **`CanalSMS`**: Extiende de `CanalMensajeria` para modelar envíos mediante pasarelas de mensajes de texto.
* **Sobrescritura (`@Override`)**:
* `enviarMensaje(String destinatario, String texto)`: Simula la vinculación con el proveedor de SMS, procesa el número de teléfono y emite la confirmación de entrega.




* **`CanalPush`**: Extiende de `CanalMensajeria` para modelar alertas interactivas en dispositivos móviles.
* **Sobrescritura (`@Override`)**:
* `enviarMensaje(String destinatario, String texto)`: Simula la conexión con el servidor push, registra el identificador del dispositivo receptor y confirma la notificación.




* **`ServicioNotificaciones`**: Componente controlador encargado de administrar el envío unificado de mensajes.
* **Método operativo**: `enviarNotificacion(CanalMensajeria canal, String destinatario, String texto)`: Aplica inyección de dependencias polimórfica recibiendo cualquier canal, imprime cabeceras y pies decorativos, e invoca dinámicamente el método `enviarMensaje(...)`.


* **`Main`**: Punto de entrada del programa. Instancia los canales de email, SMS y push, crea un objeto de la clase controladora `ServicioNotificaciones`, y ejecuta diversas operaciones de envío con datos reales para demostrar la resolución polimórfica de los mensajes por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Contrato Estricto de Mensajería:** Gracias al uso de la clase abstracta `CanalMensajeria`, se garantiza que cualquier nuevo canal de comunicación que se integre al sistema (como WhatsApp o Telegram) cumpla obligatoriamente con la firma de envío.
2. **Desacoplamiento y Polimorfismo:** El servicio central (`ServicioNotificaciones`) desconoce las implementaciones internas de los canales; opera exclusivamente con referencias del tipo base, permitiendo una extensibilidad total del código sin alterar la lógica de control.
3. **Estandarización de Salidas:** El controlador unifica el formato visual de las transmisiones mediante delimitadores gráficos consistentes para cualquier medio operado.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
==============================
Conectando con servidor de Email...
Enviando correo electronico...
Destinatario: usuario@gmail.com
Mensaje: Bienvenido a nuestra plataforma.
Correo enviado correctamente.
==============================
==============================
Conectando con proveedor de SMS...
Enviando mensaje SMS...
Destinatario: 2611234567
Mensaje: Su codigo de verificacion es 123456.
SMS enviado correctamente.
==============================
==============================
Conectando con servidor Push...
Enviando notificacion movil...
Dispositivo: Dispositivo Android
Mensaje: Tiene una nueva notificacion.
Notificacion Push enviada correctamente.
==============================

```

---

## 🚀 Conceptos de Programación Aplicados

* **Abstracción y Polimorfismo de Canales:** Modelado de comunicaciones heterogéneas mediante superclases abstractas que unifican su tratamiento operativo.
* **Inyección de Dependencias:** Paso dinámico de objetos derivados a través de parámetros de la superclase para lograr un diseño limpio y modular.
* **Principio Abierto/Cerrado (OCP):** Capacidad absoluta para incorporar nuevos canales de mensajería al ecosistema tecnológico sin modificar las clases de control existentes.
