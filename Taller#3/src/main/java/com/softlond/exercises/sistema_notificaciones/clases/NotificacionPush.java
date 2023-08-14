package main.java.com.softlond.exercises.sistema_notificaciones.clases;

public class NotificacionPush extends Notificacion {

    public NotificacionPush(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificacion push a " + destinatario);
    }
    
}
