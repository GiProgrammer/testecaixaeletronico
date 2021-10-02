package testecaixaeletronico;

import TerminalDeCaixaEletronico.*;

public class TesteCaixaEletronico {

  public static void main(String[] args) {
    Cliente cc1 = new Cliente("12121787645", "Maria Joana");
    Cliente cc2 = new Cliente("87678976545", "João Paulo");
    Cliente cc3 = new Cliente("12198754356", "Carla Joarez");
    Cliente cc4 = new Cliente("12121256787","Joãozinho Da Quebrada");
        Conta c1 = new Conta(1216, cc1, 8787, 50);
    Conta c2 = new Conta(1918, cc2, 8687, 500);

    Conta c3 = new Poupanca(1314, cc3, 1216, 100);
    Poupanca c4 = new Poupanca(1315,cc4,9090,200);

    CadastroContas cadastro0 = new CadastroContas();
    try {
      cadastro0.adicionaConta(c1);
      cadastro0.adicionaConta(c2);
      cadastro0.adicionaConta(c3);
      cadastro0.adicionaConta(c4);
    } catch (ContaInvalidaException contaIn) {
      System.err.println(contaIn + "\n");
    }
    Terminal t1 = new Terminal(cadastro0);
    t1.iniciaOperacao();
  }
}

