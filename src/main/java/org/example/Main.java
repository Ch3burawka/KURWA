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
        while (dialog.equalsIgnoreCase("hui") || dialog.equalsIgnoreCase("hyi") || dialog.equalsIgnoreCase("kurwa") || dialog.equalsIgnoreCase("loh")) {
            System.out.println("Idi nahyi, loh jebaniy, vvodi zanovo.");
            dialog = pizdim.nextLine();
        }
        System.out.println(nachalo);
        System.out.println("-" + dialog);
        System.out.println("Считаем хромосомы коесера, введи максимально возможное количество раундов в премьер режиме коески.");
        int vvod1 = pizdim.nextInt();
        while (vvod1 != 24 && vvod1 != 30) {
            System.out.println("Бляяяя чееел ты, как можно не знать сколько в кс раундов(((");
            vvod1 = pizdim.nextInt();
        }
        switch (vvod1) {
            case 24:
                System.out.println("Ты ввел 24");
                break;
            case 30:
                System.out.println("Ты ввел 30");
                break;
        }
        System.out.println("А теперь введите количетво АВП необходимых для победы в раунде");
        int vvod2 = pizdim.nextInt();
        switch (vvod2) {
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
                System.out.println("Ты ввел " + vvod2);
        }
        int result = vvod1 + vvod2;
        if (result < 30) {
            System.out.println("\nТы шо Дэбил, забыл про душные доп раунды?)");
        } else if (result == 30) {
            System.out.println("\nМои поздравления у тебя глобал головного мозга)");
        } else {
            System.out.println("\nУ коесера " + result + " хромосом(-ы))");
        }
        System.out.println("Хочешь больше загадок? y/n");
        String answer = pizdim.next();
        while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
            System.out.println("Введите \"y\" (yes) или \"n\" (no)");
            answer = pizdim.next();
        }
        if (answer.equalsIgnoreCase("n")) {
            System.out.println("Ny i idi nahyi))");
            return;
        }
        else{
            System.out.println("Отличный выбор!)");
        }
        String[] zagadka = new String[5];
        zagadka[0] = "Какой уровень нужен для открытия премьер режима?";
        zagadka[1] = "Сколько нужно сьесть говна чтобы вешать голову на ходу?";
        zagadka[2] = "Сколько стоят читы?";
        zagadka[3] = "Кто хуже поляк в тиме или турок?";
        zagadka[4] = "Сколько часов нужно чтобы понять что коес говнище?";
        System.out.println("Загадка номер 1. " + zagadka[0]);
        int num = pizdim.nextInt();
        while (num != 10) {
            System.out.println("Не угадал");
            num = pizdim.nextInt();
        }
        if (num == 10) {
            System.out.println("Отлично идем некст, загадка нормер 2. " + zagadka[1]);
        }
        pizdim.nextLine();
        String otvet = pizdim.nextLine();
        while (!otvet.equalsIgnoreCase("mnogo") && !otvet.equalsIgnoreCase("dohuya")) {
            System.out.println("Попробуй значение побольше");
            otvet = pizdim.nextLine();
        }
        if (otvet.equalsIgnoreCase("mnogo") || otvet.equalsIgnoreCase("dohuya") ) {
            System.out.println("Найс, вопрос номер 3. " + zagadka[2]);
        }
        String chiti = pizdim.nextLine();
        while (!chiti.equalsIgnoreCase("besplatno") && !chiti.equalsIgnoreCase("darom")) {
            System.out.println("Попробуй значение поменьше");
            chiti = pizdim.nextLine();
        }
        if (chiti.equalsIgnoreCase("besplatno") || chiti.equalsIgnoreCase("darom")) {
            System.out.println("Хорош, го некст. " + zagadka[3]);
        }
        String dauni = pizdim.nextLine();
        while (!dauni.equalsIgnoreCase("oba")) {
            System.out.println("Ты не прав, попробуй еще");
            dauni = pizdim.nextLine();
        }
        if (dauni.equalsIgnoreCase("oba")) {
            System.out.println("Красава, гоу ласт. " + zagadka[4]);
        }
        int a = pizdim.nextInt();
        while (a != 0) {
            System.out.println("Хмммм, неужели все так плохо?");
            a = pizdim.nextInt();
        }
        if (a==0){
            System.out.println("Ура, ты победил, молодец, проебал время на эту хуету");
        }
        System.out.println("Если хочешь ознакомиться со списком загадок введи 1 если нет введи 0");
        int b = pizdim.nextInt();
        if (b==1){
            for (int i = 0; i<zagadka.length; i++)
            {
            System.out.println(zagadka[i]);
            }
        } else if (b==0) {
            System.out.println("GOOD BYE");
        }
        else {
            System.out.println("NAHYI TI ZAEBYESH");
        }
    }
    }
