package Ejercicios;

import java.util.Random;

public class Insecto {
	// Atributos
    private String nombreEspecie;
    private String sonido;
    private int numeroPatas;
    private int numeroAlas;

    // Constructor
    public Insecto(String nombreEspecie, String sonido, int numeroPatas, int numeroAlas) {
        this.nombreEspecie = nombreEspecie;
        this.sonido = sonido;
        this.numeroPatas = numeroPatas;
        this.numeroAlas = numeroAlas;
    }

    // Métodos
    public boolean tieneAlas() {
        return numeroAlas > 0;
    }

    public void mutar() {
        Random random = new Random();
        this.numeroPatas = random.nextInt(7); // Número aleatorio de 0 a 6 patas
        this.numeroAlas = random.nextInt(7); // Número aleatorio de 0 a 6 alas
    }

    public void emitirSonido() {
        System.out.println("El insecto " + nombreEspecie + " emite el sonido: " + sonido);
    }

    // Getters y Setters
    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    @Override
    public String toString() {
        return "Insecto{" +
                "nombreEspecie='" + nombreEspecie + '\'' +
                ", sonido='" + sonido + '\'' +
                ", numeroPatas=" + numeroPatas +
                ", numeroAlas=" + numeroAlas +
                '}';
    }
}
