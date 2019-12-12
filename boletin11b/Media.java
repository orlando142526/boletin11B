
package boletin11b;

public class Media {
 private String nombre;
    private String autor;
    private int duradaSegons;

    public Media(String n, String a, int d) {
        nombre = n;
        autor = a;
        duradaSegons = d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String a) {
        autor = a;
    }

    public int getDuradaSegons() {
        return duradaSegons;
    }

    public void setDuradaSegons(int d) {
        duradaSegons = d;
    }
}
