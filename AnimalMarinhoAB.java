package lista04;

public class AnimalMarinhoAB extends AnimalAB {
	protected int quantidadeBarbatanas;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, int quantidadeBarbatanas) {
        super(nome, tipoAnimal, idade, "Marinho", 0);
        this.quantidadeBarbatanas = quantidadeBarbatanas;
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
