package main.java.com.softlond.exercises.sistema_notificaciones;

import main.java.com.softlond.exercises.sistema_notificaciones.clases.CorreoElectronico;
import main.java.com.softlond.exercises.sistema_notificaciones.clases.MensajeTexto;
import main.java.com.softlond.exercises.sistema_notificaciones.clases.NotificacionPush;

public class SistemaNotificaciones {
    
    public void run() {
        System.out.println("Sistema de notificaciones");

        CorreoElectronico correo = new CorreoElectronico("Juanfdoa@hotmail.com");
        correo.enviar();

        MensajeTexto mensaje = new MensajeTexto("3113123107");
        mensaje.enviar();

        NotificacionPush notificacion = new NotificacionPush("Juan Acevedo");
        notificacion.enviar();
    }
}
