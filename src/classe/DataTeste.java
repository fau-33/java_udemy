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
		
		System.out.printf("%02d/%02d/%04d\n", d1.dia, d1.mes, d1.ano);
		
		System.out.printf("%02d/%02d/%04d\n", d2.dia, d2.mes, d2.ano);
	}

}
