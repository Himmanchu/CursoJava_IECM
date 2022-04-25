
public class Factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String NombreTitular;
		String ConceptoFactura;
		double Precio;
		double Total;
		double Iva;
		
		NombreTitular= "Javier Jiménez Sanz";
		ConceptoFactura= "Realización Programa tv";
		Precio= 890;
		Iva= Precio * 0.21;
		Total= Precio + Iva;
		
		System.out.println("Factura de " + NombreTitular);
		System.out.println("Concepto de la factura: "+ ConceptoFactura);
		System.out.println(Precio + " € ");
		System.out.println(Iva + " € ");
		System.out.println(Total + " € ");
		
		
		
	}

}
