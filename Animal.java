public class Animal {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private String nombre;
    private int edad;

    public Animal(String pNom, int pEdad){
        this.nombre = pNom;
        this.edad = pEdad;
    }

    public void comer(){
        System.out.println("El animal " + nombre + " está comiendo.");
    }
}
