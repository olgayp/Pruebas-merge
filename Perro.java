public class Perro extends Animal{
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Perro(String pNom, int pEdad, String pRaza) {
        super(pNom, pEdad);
        this.raza = pRaza;
    }
}
