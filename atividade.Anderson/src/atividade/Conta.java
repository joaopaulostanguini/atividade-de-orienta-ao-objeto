package atividade;

public class Conta {
		String titular;
		int numero;
		String agencia;
		double saldo;
		Data dataDeAbertura;

		void saca(double valor) {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
		}

		void deposita(double valor) {
			this.saldo += valor;
		}

		double calculaRendimento() {
			return saldo * 0.1;
		}

		String recuperaDadosParaImpressao() {
			String dados = "Titular: " + this.titular;
			dados += "\nNúmero: " + this.numero;
			dados += "\nAgência: " + this.agencia;
			dados += "\nSaldo Atual: " + this.saldo;
			dados += "\nRendimento Mensal: " + this.calculaRendimento();
			
			dados += "\nData de abertura: " + this.dataDeAbertura.dataFormatada();
			return dados;
		}
	}


