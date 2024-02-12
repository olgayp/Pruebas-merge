public class Perro extends Animal{
    private String raza;

    public Perro(String pNom, int pEdad) {
        super(pNom, pEdad);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
