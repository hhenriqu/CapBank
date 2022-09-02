import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.Conta;
import Enums.TipoContas;
import Enums.TipoContas.enumContas;

public class App {

    public static List<Conta> listContas = new ArrayList<Conta>();


    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        int options;
       
        // Front a ser desenvolvido posteriormente em ANGULAR //
        System.out.println("Bem Vindo ao CapBank!");
        System.out.println("Um banco fictício com conhecimento real.");

        do
        {
            options = 0;
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Criar Conta");
            System.out.println("6 - Listar Contas");
            System.out.println("7 - Limpar Tela");
            System.out.println("9 - SAIR");

            try{
                 options = leitor.nextInt();
                 leitor.nextLine();
                }
                catch(Exception e)
                {
                   leitor.next();
                }

            switch(options)
            {
                case 1:
                verSaldo();
                break;
                case 2:
                adicionarSaldo();
                break;
                case 3:
                sacarSaldo();
                break;
                case 4:
                transferirSaldo();
                break;
                case 5:
                criarContas();
                break;
                case 6:
                listarContas();
                break;
                case 7:
                System.out.println("Função Indiponível. Desculpe");
                break;
                case 9:
                System.out.println("a CapBank agradece! Até a próxima!");
                break;
                default:
                System.out.println("Opção Inválida. Tente Novamente.");
                break;
            }
            
        }while(options != 9);

    }

    public static void criarContas(){

        Scanner leitor = new Scanner(System.in);
        TipoContas.enumContas entradaTipoConta;

        System.out.println("Inserir nova conta");

        System.out.print("Digite 1 para Conta Poupança ou 2 para Conta Corrente: ");
        int numTipoConta = leitor.nextInt();
        if(numTipoConta == 1){
            entradaTipoConta =  enumContas.CONTAPOUPANCA;
        } else {
            entradaTipoConta =  enumContas.CONTACORRENTE;
        }
        
        leitor.nextLine();
        System.out.print("Digite o Nome do Cliente: ");
        String entradaNome = leitor.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double entradaSaldo = leitor.nextDouble();

       Conta novaConta = new Conta(entradaTipoConta, entradaNome, entradaSaldo);

       listContas.add(novaConta);
    }

    public static void listarContas(){
        for (Conta conta : listContas) {
            System.out.println("Numero da Conta #"+ listContas.indexOf(conta) + " | " + conta.toString());
        }
    }

    public static void adicionarSaldo()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o Numero da sua conta:");
        int numConta = leitor.nextInt();
        System.out.println("Insira o valor a ser depositado:");
        double valorDeposito = leitor.nextInt();

        listContas.get(numConta).depositar(valorDeposito);
    }

    public static void verSaldo()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o Numero da sua conta:");
        int numConta = leitor.nextInt();
        listContas.get(numConta).getSaldo();
    }

    public static void sacarSaldo()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o Numero da sua conta:");
        int numConta = leitor.nextInt();
        System.out.println("Insira o valor a ser sacado:");
        double valorSaque = leitor.nextInt();

        listContas.get(numConta).sacar(valorSaque);
    }

    public static void transferirSaldo()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o Numero da sua conta:");
        int numConta = leitor.nextInt();
        System.out.println("Insira o valor a ser transferido:");
        double valorTransferencia = leitor.nextInt();
        System.out.println("Insira o Numero da conta destino:");
        int numDestino = leitor.nextInt();

        listContas.get(numConta).transferir(valorTransferencia, listContas.get(numDestino));
    }
}
