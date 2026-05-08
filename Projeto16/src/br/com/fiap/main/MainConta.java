package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import br.com.fiap.bean.ContaEspecial;
import br.com.fiap.bean.ContaPoupanca;

import javax.swing.*;
import java.time.LocalDate;

public class MainConta
{
    public static void main(String[] args)
    {
        ContaBancaria cliente = new ContaBancaria();
        String escolha = "sim";
        float valor;
        while(escolha.equalsIgnoreCase("sim"))
        {
            try
            {
                int opc = Integer.parseInt(JOptionPane.showInputDialog("Informe qual o tipo da conta: " +
                                                                        "\n[1] - Conta Bancária" +
                                                                        "\n[2] - Conta Poupança" +
                                                                        "\n[3] - Conta Especial" +
                                                                        "\n\n[0] - Sair"));
                if (opc == 1 || opc == 2 || opc == 3 || opc == 0)
                {
                    cliente.setCliente(JOptionPane.showInputDialog("Digite seu nome: "));
                    cliente.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: ")));
                    cliente.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo: R$")));
                }
                switch (opc)
                {
                    case 1:
                        do
                        {
                            opc = Integer.parseInt(JOptionPane.showInputDialog("Qual operação deseja realizar: " +
                                                                                "\n[1] - Sacar" +
                                                                                "\n[2] - Depositar" +
                                                                                "\n\n[0] - voltar"));
                            if (opc < 0 || opc > 2)
                                JOptionPane.showMessageDialog(null, "Opção inválida!");
                        } while (opc < 0 || opc > 2);

                        switch (opc)
                        {
                            case 1:
                                do
                                {
                                    valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor: R$"));
                                    if(valor == 0)
                                        JOptionPane.showMessageDialog(null, "Informe um valor válido!");
                                } while (valor == 0 || valor > cliente.getSaldo());
                                if (valor < cliente.getSaldo())
                                {
                                    JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                                }
                                else
                                {
                                    cliente.sacar(valor);
                                    JOptionPane.showMessageDialog(null, String.format("Saque no valor de R$%.2f" +
                                                                                        " realizado com sucesso!"));
                                }
                                break;
                            case 2:
                                do
                                {
                                    valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor: R$"));
                                    if(valor == 0)
                                        JOptionPane.showMessageDialog(null, "Informe um valor válido!");
                                } while (valor == 0);
                                cliente.depositar(valor);
                                JOptionPane.showMessageDialog(null, String.format("Depósito no valor de R$%.2f realizado!"));
                                break;
                            case 0:
                                continue;
                        }
                        break;
                    case 2:
                        //Não consegui entender :(
                        ContaPoupanca pupanca = new ContaPoupanca();
                        LocalDate dataAtual = LocalDate.now();
                        int diaAtual = dataAtual.getDayOfMonth();
                        pupanca.setDiaDeRendimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do " +
                                                                                                "rendimento: ")));
                        break;
                    case 3:
                        ContaEspecial especial = new ContaEspecial();
                        especial.setLimite(Float.parseFloat(JOptionPane.showInputDialog("Informe o limite: ")));
                        valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor: R$"));
                        if(valor > especial.getLimite())
                            JOptionPane.showMessageDialog(null, "Limite insuficiente!");
                        especial.sacar(valor);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());

            }
            JOptionPane.showMessageDialog(null, String.format("Nome: %s \nNúmero da conta: %d \nSaldo atual: R$%.2f",
                                                    cliente.getCliente(), cliente.getNumConta(), cliente.getSaldo()));

            escolha = JOptionPane.showInputDialog("Deseja continuar? ");

        }
    }
}
