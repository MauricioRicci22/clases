public class main {
     public static void main (String[] args) {
	 Cuentacorriente c;
	    c = new Cuentacorriente("pepe",123456789-A);
		c.limite =-100;
		
		c.ingreso(1000);
		c.egreso(300);
		c.mostrarInformacion();
		System.out.println("puedo sacar 700 euros: = + c.egreso(700));
		System.out.println("puedo sacar 500 euros: = + c.egreso(500));
		
		c =new Cuentacorriente(100);
		c.mostrarInformacion();
		c= new Cuentacorriente(2000,-300,"9231232-Z")
		c.mostrarInformacion();
		}
		
	}