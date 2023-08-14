package main.java.com.softlond.exercises.sistema_notificaciones.clases;

public class MensajeTexto extends Notificacion{

    public MensajeTexto(String destinatario) {
        super( destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto a " + destinatario);
    }
    
}
