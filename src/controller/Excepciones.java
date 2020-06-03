package controller;

public class Excepciones extends Exception{
    public Excepciones() {
    }

    public Excepciones(String message) {
        super("Problema: " + message);
    }

    public Excepciones(String message, Throwable cause) {
        super(message, cause);
    }

    public Excepciones(Throwable cause) {
        super(cause);
    }

    public Excepciones(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
