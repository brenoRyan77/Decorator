package decorator.padrao;

public class Main {

	public static void main(String args[]) {
		Janela janelaDecorada = new DecoradorBarraVertical(new JanelaSimples());
		janelaDecorada.draw();
		
	}
}
