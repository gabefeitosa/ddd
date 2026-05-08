package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        Geometria geo1 = new Geometria();
        String escolha = "sim";
        int opc;
        float lado, altura;
        double raio;

        while(escolha.equalsIgnoreCase("sim"))
        {
            try
            {
                opc = Integer.parseInt(JOptionPane.showInputDialog("Qual área deseja calcular? " +
                        "\n[1] - Quadrado\n[2] - Retângulo\n[3] - Circulo"));
                switch (opc)
                {
                    case 1:
                        lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado: "));
                        geo1.calcularArea(lado);
                        break;
                    case 2:
                        lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado: "));
                        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura: "));
                        geo1.calcularArea(lado, altura);
                        break;
                    case 3:
                        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
                        geo1.calcularArea(raio);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha inválida!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa!");
    }
}
