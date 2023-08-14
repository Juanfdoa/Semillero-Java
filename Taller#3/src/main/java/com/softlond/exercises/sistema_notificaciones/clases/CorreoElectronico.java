package main.java.com.softlond.exercises.sistema_notificaciones.clases;

public class CorreoElectronico extends Notificacion{

    public CorreoElectronico(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo electrónico a " + destinatario);
    }
    
}
