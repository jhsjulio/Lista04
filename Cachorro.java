package lista04;

public class Cachorro extends AnimalAB {
	
	private int quantidadeComidaIngerida;
    private int distanciaPercorrida;
    private int horasDormidas;

    public Cachorro(String nome, int idade, String habitat) {
        super(nome, "Cachorro", idade, habitat, 4);
    }

    @Override
    public void comer(int quantidadeComida) {
        quantidadeComidaIngerida += quantidadeComida;
    }

    @Override
    public void moverse(int distancia) {
        distanciaPercorrida += distancia;
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
    }
	
}
