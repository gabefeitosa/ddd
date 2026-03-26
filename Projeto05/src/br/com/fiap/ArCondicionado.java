package br.com.fiap;

import java.util.Scanner;

public class ArCondicionado
{
    public int temperatura;
    public String modo;

    public ArCondicionado(int temperatura, String modo)
    {
        this.temperatura = temperatura;
        this.modo = modo;
    }
    public void aumentarTemperatura()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto deseja aumentar? ");
        temperatura += scan.nextInt();
    }

    public void diminuirTemperatura()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto diminuir aumentar? ");
        temperatura -= scan.nextInt();
    }

    public void trocarModo(String novoModo)
    {
        modo = novoModo;
    }
}
