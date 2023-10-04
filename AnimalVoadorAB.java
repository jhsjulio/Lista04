package lista04;

public class AnimalVoadorAB extends AnimalAB {
	protected int quantidadeAsas;
    protected double envergaduraAsas;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, int quantidadeAsas, double envergaduraAsas) {
        super(nome, tipoAnimal, idade, "Aéreo", 2);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
    }

	@Override
	public void comer(int quantidadeComida) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverse(int distancia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir(int horas) {
		// TODO Auto-generated method stub
		
	}
    
    
}
