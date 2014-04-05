package tests;

import junit.framework.TestCase;

public class operacionesBasicas extends TestCase 
{
	private int valorEntero1;
	private int valorEntero2;
	private float valorFlotante1;
	private float valorFlotante2;
	
	public operacionesBasicas(String nombre)
	{
		super(nombre);
	}
	
	protected void setUp() throws Exception
	{
		super.setUp();
		valorEntero1 = 10;
		valorEntero2 = 5;
		valorFlotante1 = 10;
		valorFlotante2 = 5;
	}
	
	protected void tearDown() throws Exception
	{
		super.tearDown();
		valorEntero1 = 0;
		valorEntero2 = 0;
		valorFlotante1 = 0;
		valorFlotante2 = 0;
	}
	
	public void pruebaSuma()
	{
		int total = 15;
		int suma = Operaciones.suma(valorEntero1, valorEntero2);
		assertEquals(suma, total);
	}
	
	public void pruebaResta()
	{
		int total = 10;
		int resta = Operaciones.resta(valorEntero1, valorEntero2);
		assertEquals(resta, total);
	}
	
	public void pruebaMultiplicacion()
	{
		float total = 50;
		float multiplicacion = Operaciones.multiplicacion(valorFlotante1, valorFlotante2);
		assertEquals(multiplicacion, total);
	}
	
	public void pruebaDivision()
	{
		float total = 2;
		float division = Operaciones.division(valorFlotante1, valorFlotante2);
		assertEquals(division, total);
	}
}
