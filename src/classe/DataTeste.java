package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 01;
		d1.mes = 11;
		d1.ano = 2006;
		
		var d2 = new Data();
		d2.dia = 30;
		d2.mes = 12;
		d2.ano = 2025;
		
		String obterDataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(obterDataFormatada1);
		
		System.out.println(d2.obterDataFormatada());
	}

}
