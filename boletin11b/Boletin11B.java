
package boletin11b;

public class Boletin11B {

    public static void main(String[] args) {
        // TODO code application logic here
        Media obx = new Media("Nombre","Autor",222);
        String n = obx.getNombre();
        String a = obx.getAutor();
        int d = obx.getDuradaSegons();
        System.out.println("El objeto inicial es--> "+n+ "," +a+ "," +d);
        System.out.println("***Asignación de valores***");
        obx.setNombre("Alguien");
        obx.setAutor("Juan");
        obx.setDuradaSegons(500);
        n = obx.getNombre();
        a = obx.getAutor();
        d = obx.getDuradaSegons();
        System.out.println("El objeto modificado es --> "+n+ "," +a+ "," +d);
    }  
}
    