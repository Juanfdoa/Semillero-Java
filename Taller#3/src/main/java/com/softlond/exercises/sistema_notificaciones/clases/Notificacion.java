package main.java.com.softlond.exercises.sistema_notificaciones.clases;

import main.java.com.softlond.exercises.sistema_notificaciones.interfaces.IEnviar;

public abstract class Notificacion implements IEnviar{
    protected String destinatario;

    public Notificacion(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

}
