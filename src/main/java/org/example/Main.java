package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pizdim = new Scanner(System.in);
        String nachalo = "-KURWA BOBR*_*\n-DURA=)";
        System.out.println(nachalo);
        /*Диалог монгола с поляком на противнике*/
        System.out.println("продолжите диалог");
        String dialog = pizdim.nextLine();
        while (dialog.equals("HYI") || dialog.equals("KURWA") || dialog.equals("hyi") || dialog.equals("kurwa") || dialog.equals("loh")){
            System.out.println("Idi nahyi, loh jebaniy, vvodi zanovo.");
            dialog = pizdim.nextLine();
        }
        System.out.println(nachalo);
        System.out.println("-" + dialog);
        System.out.println("Считаем хромосомы коесера, введи максимально возможное количество раундов в премьер режиме коески.");
        int vvod1 = pizdim.nextInt();
        switch (vvod1){
            case 24:
                System.out.println("Ты ввел 24");
                break;
                case 30:
                    System.out.println("Ты ввел 30");
                    break;
            default:
                System.out.println("Ты ввел " + vvod1 );
        }
        System.out.println("А теперь введите количетво АВП необходимых для победы в раунде");
        int vvod2 = pizdim.nextInt();
        switch (vvod2){
            case 1:
                System.out.println("Ну допустим 1");
                break;
                case 2:
                    System.out.println("Возможно 2 - это ноптимальный выбор");
                    break;
                        case 3:
                            System.out.println("3 это конечно интересное решение");
                            break;
                            case 4:
                                System.out.println("4 авика, пизда рулю и седлу");
                                break;
                                case 5:
                                    System.out.println("5 авп, ну ты канешн пиздец...");
                                    break;
            default:
                System.out.println("Ты ввел " + vvod2 );
        }
        int result =  vvod1 + vvod2;
        if (result<30){
            System.out.println("\nТы шо Дэбил, забыл про душные доп раунды?)");
        } else if (result==30){
            System.out.println("\nМои поздравления у тебя глобал головного мозга)");
        } else {
            System.out.println("\n12У коесера " + result + " хромосом)");
        }
    }

}