package ar.edu.unlam.cuenta;

public class Cuenta {

	private Integer saldo;

	public Cuenta(Integer saldo) {
		this.saldo = saldo;
	}

	public Boolean depositar(Integer valor) {
		Boolean resultado = true;
		if (valor <= 0) {
			resultado = false;
		} else {
			this.saldo = this.saldo + valor;
		}
		return resultado;
	}

	public Boolean extraer(Integer valorAExtraer) {
		Boolean resultado = true;
		if (this.saldo < valorAExtraer){
			resultado = false;
		} else {
			this.saldo = this.saldo - valorAExtraer;
		}
		
		return resultado;
	}



}
