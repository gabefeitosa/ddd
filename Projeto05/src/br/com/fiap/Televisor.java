package br.com.fiap;

import java.util.Scanner;

public class Televisor
{
    public int volume;
    public int canal;

    public void aumentarVolume()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto deseja aumentar? ");
        volume += scan.nextInt();
    }

    public void diminuirVolume()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto deseja diminuir? ");
        volume -= scan.nextInt();
    }

    public void trocarCanal(int novoCanal)
    {
        canal  = novoCanal;
    }

    public void Exibir()
    {
        System.out.println("Canal atual: " + canal + "\nVolume atual: " + volume);
    }
}
