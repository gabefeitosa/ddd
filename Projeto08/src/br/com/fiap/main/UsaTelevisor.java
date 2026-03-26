package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class UsaTelevisor
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Televisor tv1 = new Televisor();
        try
        {
            System.out.print("Digite o canal desejado: ");
            tv1.setCanal(scan.nextInt());
            System.out.print("Digite o volume desejado: ");
            tv1.setVolume(scan.nextInt());

            short res;
            do
            {
                System.out.println("O que deseja fazer: " +
                        "\n[1]-Definir outro canal" +
                        "\n[2]-Definir novovolume" +
                        "\n[3]-Aumentar volume" +
                        "\n[4]-Diminuir volume" +
                        "\n[0]-Sair do menu");
                res = scan.nextShort();
                switch (res)
                {
                    case 0:
                        break;
                    case 1:
                        System.out.print("Digite o canal: "); tv1.setCanal(scan.nextInt());break;
                    case 2:
                        System.out.print("Digite o volume desejado: "); tv1.setVolume(scan.nextInt());break;
                    case 3:
                        tv1.aumentarVolume();break;
                    case 4:
                        tv1.diminuirVolume();break;
                    default:
                        System.out.println("Valor inválido!");break;
                }
            }
            while(res!=0);
        }
        catch (Exception e)
        {
            System.out.println("Valor inválido!");
        }
        System.out.printf("Canal atual: %d \nVolume atual: %d",tv1.getCanal(), tv1.getVolume());
    }

}


