package Ejercicios;

public class Telefono {
	 // Atributos
    private String numeroLlamada;
    private String pinDesbloqueo;
    private String[] bandejaMensajes;
    private int capacidadBandeja;

    // Constructor
    public Telefono(String numeroLlamada, String pinDesbloqueo, int capacidadBandeja) {
        this.numeroLlamada = numeroLlamada;
        this.pinDesbloqueo = pinDesbloqueo;
        this.capacidadBandeja = capacidadBandeja;
        this.bandejaMensajes = new String[capacidadBandeja];
    }

    // Métodos
    public void recibirMensaje(String mensaje) {
        for (int i = 0; i < capacidadBandeja; i++) {
            if (bandejaMensajes[i] == null) {
                bandejaMensajes[i] = mensaje;
                return;
            }
        }
        System.out.println("¡Bandeja de mensajes llena! No se puede recibir más mensajes.");
    }

    public void leerMensaje(int indice) {
        if (indice >= 0 && indice < capacidadBandeja && bandejaMensajes[indice] != null) {
            System.out.println("Mensaje en el índice " + indice + ": " + bandejaMensajes[indice]);
        } else {
            System.out.println("Índice fuera de rango o mensaje no encontrado.");
        }
    }

    public void cambiarPin(String pinAntiguo, String pinNuevo) {
        if (pinDesbloqueo.equals(pinAntiguo)) {
            pinDesbloqueo = pinNuevo;
            System.out.println("PIN actualizado exitosamente.");
        } else {
            System.out.println("PIN antiguo incorrecto. No se pudo actualizar el PIN.");
        }
    }

    // Getters y Setters
    public String getNumeroLlamada() {
        return numeroLlamada;
    }

    public void setNumeroLlamada(String numeroLlamada) {
        this.numeroLlamada = numeroLlamada;
    }

    public String getPinDesbloqueo() {
        return pinDesbloqueo;
    }

    public void setPinDesbloqueo(String pinDesbloqueo) {
        this.pinDesbloqueo = pinDesbloqueo;
    }

    public int getCapacidadBandeja() {
        return capacidadBandeja;
    }

    public void setCapacidadBandeja(int capacidadBandeja) {
        this.capacidadBandeja = capacidadBandeja;
    }
}
