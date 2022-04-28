import javax.swing.*;
public class Factura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Factura;
		String NombreTitular;
		String ConceptoFactura;
		double Precio;
		double Total;
		double Iva;
		
		
		Factura=Integer.parseInt(JOptionPane.showInputDialog("Introduce nº de Factura"));
		NombreTitular= "Javier Jiménez Sanz";
		ConceptoFactura= "Realización Programa tv";
		Precio= 890;
		Iva= Precio * 0.21;
		Total= Precio + Iva;
		
		System.out.println("Factura nº" + Factura + " de " + NombreTitular);
		System.out.println("Concepto de la factura: "+ ConceptoFactura);
		System.out.println("Precio " + Precio + " € ");
		System.out.println("Iva " + Iva + " € ");
		System.out.println("Total " + Total + " € ");
		
		
		
	}

}
