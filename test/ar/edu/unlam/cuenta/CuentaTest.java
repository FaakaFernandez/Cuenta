package ar.edu.unlam.cuenta;

import junit.framework.Assert;

import org.junit.Test;

public class CuentaTest {

	@SuppressWarnings("deprecation")
	@Test
	public void queSePuedaDepositarValoresMayoresACero() {
		//preparacion
		Integer valorInicial = 0;
		Integer ValorADepositar = 15;
		Cuenta miCuenta = new Cuenta(valorInicial);
		//ejecucion
		Boolean resultado = miCuenta.depositar(ValorADepositar);
		//contrastacion
		Assert.assertTrue(resultado);

	}

	@SuppressWarnings("deprecation")
	@Test
	public void queSePuedaDepositarValoresMenoresACero() {
		//preparacion
		Integer valorInicial = 0;
		Integer ValorADepositar = -15;
		Cuenta miCuenta = new Cuenta(valorInicial);
		//ejecucion
		Boolean resultado = miCuenta.depositar(ValorADepositar);
		//contrastacion
		Assert.assertFalse(resultado);

	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void queSePuedaExtraer(){
		//preparacion
		Integer valorInicial = 100;
		Integer valorAExtraer = 50;
		Cuenta miCuenta = new Cuenta(valorInicial);
		//ejecucion
		Boolean resultado = miCuenta.extraer(valorAExtraer);
		//contrastacion
		Assert.assertTrue(resultado);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void queNoSePuedaExtraer(){
		//preparacion
		Integer valorInicial = 100;
		Integer valorAExtraer = 150;
		Cuenta miCuenta = new Cuenta(valorInicial);
		//ejecucion
		Boolean resultado = miCuenta.extraer(valorAExtraer);
		//contrastacion
		Assert.assertFalse(resultado);
		
	}
	
	
}
