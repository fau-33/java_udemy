package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4354.98;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double descontoFinal1 = p1.precoComDesconto();
		double descontoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (descontoFinal1 + descontoFinal2) / 2;
		
		System.out.printf("A média do carrinho = R$%.2f.", mediaCarrinho);
	}
}
