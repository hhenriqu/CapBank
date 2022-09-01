package Enums;

public class TipoContas {
  public enum TIPOCONTA{
    ContaPoupanca(1),
    ContaCorrente(2);

    private int tipoConta;

    TIPOCONTA(int valor){
      this.tipoConta = valor;
    }
  }
}
