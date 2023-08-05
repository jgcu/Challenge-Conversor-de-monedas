
import javax.swing.JOptionPane;

public class Prueba {
	
	public static void main(String[] args) {
		
		//CREANDO LAS DIFERENTES MONEDAS
		
		Moneda dolar = new Moneda();
		dolar.setValorMXN(17.08);
		dolar.setNombre("Dólar(es)");
		
		Moneda euro = new Moneda();
		euro.setValorMXN(18.83);
		euro.setNombre("Euro(s)");
		
		Moneda libra = new Moneda();
		libra.setValorMXN(21.772);
		libra.setNombre("Libra(s) Esterlinas");
		
		Moneda yen = new Moneda();
		yen.setValorMXN(0.12);
		yen.setNombre("Yen(es) Japonés");
		
		Moneda won = new Moneda();
		won.setValorMXN(0.013);
		won.setNombre("Won(es) sur-coreano");
		
		String[] convertir = {"De pesos mexicanos a otra moneda", "De otra moneda a pesos mexicanos"};
		String[] opciones = {"Dólar","Euro","Libras Esterlinas","Yen Japonés","Won sul-coreano"};
		Moneda[] monedas = {dolar, euro, libra, yen, won};
		
	
		
		int opcion = JOptionPane.showOptionDialog(null, "Escoge como quieres convertir", "Menú", 0, JOptionPane.QUESTION_MESSAGE, null, convertir, "");
		
		double resultado;
		
		if(opcion == 0)
		{
			try {
				
				double cantidad = Double.parseDouble( JOptionPane.showInputDialog("Ingresa la cantidad a convertir (MXN)"));
			
				int monedaAC = JOptionPane.showOptionDialog(null, "Escoge a que moneda quieres convertir", "Menú", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "");
			
				resultado = cantidad / monedas[monedaAC].getValorMXN();
				JOptionPane.showMessageDialog(null, cantidad + " MXN equivale a " + resultado + " " + monedas[monedaAC].getNombre());
			
			}
			catch(NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null, "ERROR!, Solo puedes ingresar números");
			}
			
			
		}
		else
		{
			try 
			{
				
				int miMoneda = JOptionPane.showOptionDialog(null, "Escoge de que moneda quieres convertir a MXN", "Menú", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "");
				
				double cantidad = Double.parseDouble( JOptionPane.showInputDialog("Ingresa la cantidad a convertir"));
				
				
				resultado = cantidad * monedas[miMoneda].getValorMXN();
				JOptionPane.showMessageDialog(null, cantidad + " " + monedas[miMoneda].getNombre() + " equivale a " + resultado + " MXN");
				
			}
			catch(NumberFormatException error)
			{
				JOptionPane.showMessageDialog(null, "ERROR!, Solo puedes ingresar números");
			}
		
			
		}
		
		
		
	}
	
}
