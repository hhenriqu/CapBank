package Classes;

import Enums.TipoContas;


public class Conta {
    private TipoContas.enumContas tipo;
    private String nome;
    private double saldo;

    public Conta(TipoContas.enumContas entradaTipoConta, String nome, double saldo) {
      this.tipo = entradaTipoConta;
      this.nome = nome;
      this.saldo = saldo;
    }
    @Override
    public String toString(){
      return "Nome: " + this.nome + " | Saldo: " + this.saldo + " | Tipo " + this.tipo;
    }

    public void depositar(double valor){
      this.saldo += valor;
    }

    public void sacar(double valor){
      this.saldo -= valor;
    }

    public void transferir(double valor, Conta numDestino){
      this.saldo -= valor;
      numDestino.depositar(valor);
    }

    public void getSaldo(){
      System.out.println("Seu saldo é de R$"+ this.saldo);
    }
}
