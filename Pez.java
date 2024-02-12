public class Pez extends Animal{
    public boolean isEsDeAguaSalada() {
        return esDeAguaSalada;
    }

    public void setEsDeAguaSalada(boolean esDeAguaSalada) {
        this.esDeAguaSalada = esDeAguaSalada;
    }

    private boolean esDeAguaSalada;

    public Pez(String pNom, int pEdad, boolean aguaSalada) {
        super(pNom, pEdad);
        this.esDeAguaSalada = aguaSalada;
    }
}
