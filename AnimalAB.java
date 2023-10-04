package lista04;

public abstract class AnimalAB implements AnimalIF {
	protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected int quantidadePatas;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
    }
}
