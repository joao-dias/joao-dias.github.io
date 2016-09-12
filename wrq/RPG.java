package src;

public class RPG extends Jogo {
	private String tipo = "RPG";
	
	public RPG(String nome, double preco){
		super(nome, preco);
	}
	
	public String getTipo(){
		return tipo;
	}
	
	@Override
	public int registraJogada(int score, boolean zerou){
		if (score > recorde){
			recorde = score;
		}
		jogadas += 1;
		if (zerou){
			zerado += 1;
		}
		return 10;
	}
	
}