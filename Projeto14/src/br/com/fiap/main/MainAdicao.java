package br.com.fiap.main;

import br.com.fiap.bean.Adicao;

import javax.swing.*;

public class MainAdicao
{
    public static void main(String[] args) {
        Adicao adicao1 = new Adicao();
        String escolha = "sim";
        int numInt1, numInt2, opc;
        double numReal1, numReal2;

        while(escolha.equalsIgnoreCase("sim"))
        {
            try
            {
                opc = Integer.parseInt(JOptionPane.showInputDialog("QUal tipo de soma deseja realizar: " +
                        "\n[1]-Com Números Reais\n[2]-Com Números Inteiros"));
                switch(opc)
                {
                    case 1:
                        numReal1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
                        numReal2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
                        JOptionPane.showMessageDialog(this, String.format("%.2f + %.2f = %.2f", numReal1, numReal2,
                                                                            adicao1.somar(numReal1, numReal2)));
                        break;
                    case 2:
                        numInt1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
                        numInt2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
                        JOptionPane.showMessageDialog(null, String.format("%d + %d = %d", numInt1, numInt2,
                                adicao1.somar(numInt1, numInt2)));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opção inválida!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Programa Finalizado!");
    }
}
