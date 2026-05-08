package br.com.fiap.main;

import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamento
{
    public static void main(String[] args)
    {
        int opc;
        float valorHoraTrabalho, adicionalNoturno, comissao, salario;
        String escolha = "sim", nome;

        while(escolha.equalsIgnoreCase("sim"))
        {
            try
            {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de funcionário deseja calcular o salário:" +
                                                                                                    "\n[1]-Vigia Noturno" +
                                                                                                    "\n[2]-Vendedor"));
                nome = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
                valorHoraTrabalho = Float.parseFloat(JOptionPane.showInputDialog("Qual é o valor da hora de trabalho? "));
                switch (opc)
                {
                    case 1:
                         adicionalNoturno = Float.parseFloat(JOptionPane.showInputDialog("Informe seu adicional noturno: "));
                         VigiaNoturno vigiaNoturno = new VigiaNoturno(nome, valorHoraTrabalho, adicionalNoturno);
                         salario = vigiaNoturno.calcularSalario();
                         JOptionPane.showMessageDialog(null, String.format("Nome: %s\nSalário: R$%.2f", nome, salario));
                         break;
                    case 2:
                        comissao = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da comissão: "));
                        Vendedor vendedor = new Vendedor(nome, valorHoraTrabalho, comissao);
                        salario = vendedor.calcularSalario();
                        JOptionPane.showMessageDialog(null, String.format("Nome: %s\nSalário: R$%.2f", nome, salario));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida!");

                }
                escolha = JOptionPane.showInputDialog("Deseja contnuar? ");
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado!");
    }
}
