package com.company;

public class Main {
    public static void main(String[] args) {
        //1//
        System.out.println("№1");
        int n = 66;
        if (n<25 && n<100) {
            System.out.println("Число" + n + "не міститься в проміжку(25;100) ");
        }else{
            System.out.println("Число" + n + "міститься в проміжку(25;100) ");
        }

        //2//
        System.out.println("№2");

        int a, b, c, d;
         n = 392;
        a = n/100;
        b = (n - a *100) /10;
        c = ((n - a *100) - b *10) %10;
        d = 0;
        if(a>b && a>c){
            d = a;
        } if(b>a && b>c){
            d = b;
        } if(c>a && c>b){
            d = c;
        }
        System.out.println("n=" + n);
        System.out.println("Найбільше число:" +b );
        //3//
        System.out.println("№3");
        String lift = "Підйом";
        int floor = 3;
        if ( lift == "Підйом" ){
            if ( floor == 1 )
            {System.out.println("Ви піднялись на 1 поверх");}
            if ( floor == 2 )
            {System.out.println("Ви піднялись на 3 поверх");}
            if ( floor == 3 )
            {System.out.println("Ви піднялись на 3 поверх");}
            if ( floor == 4 )
            {System.out.println("Ви піднялись на 4 поверх");}
            if ( floor == 5 )
            {System.out.println("Ви піднялись на 5 поверх");}
            if ( floor == 6 )
            {System.out.println("Ви піднялись на 6 поверх");}
            if ( floor == 7 )
            {System.out.println("Ви піднялись на 7 поверх");}
            if ( floor == 8 )
            {System.out.println("Ви піднялись на 8 поверх");}
            if ( floor == 9 )
            {System.out.println("Ви піднялись на 9 поверх");}
            if ( floor > 9 || floor <1 )
            {System.out.println("Ви вказали неіснуючий поверх!");}
        }
        if ( lift == "Спуск" ){
            if ( floor == 9 )
            {System.out.println("Ви спустились на 9 поверх");}
            if ( floor == 8 )
            {System.out.println("Ви спустились на 8 поверх");}
            if ( floor == 7 )
            {System.out.println("Ви спустились на 7 поверх");}
            if ( floor == 6 )
            {System.out.println("Ви спустились на 6 поверх");}
            if ( floor == 5 )
            {System.out.println("Ви спустились на 5 поверх");}
            if ( floor == 4 )
            {System.out.println("Ви спустились на 4 поверх");}
            if ( floor == 3 )
            {System.out.println("Ви спустились на 3 поверх");}
            if ( floor == 2 )
            {System.out.println("Ви спустились на 1 поверх");}
            if ( floor == 1 )
            {System.out.println("Ви спустились на 1 поверх");}
            if ( floor > 9 || floor <1 )
            {System.out.println("Ви вказали неіснуючий поверх!");}
        }
        System.out.println("№4");
        String respond = "-";
        String respond2 = "";
        switch (respond) {
            case "Так", "ОК", "Yes", "Y", "+", "Ok":
                respond = "Я погоджуюсь!";
                break;
            case "Ні", "NO", "N", "-", "No":
                respond2 = "Відмовитись";
                break;
            default:
                System.out.println("Ви ввели  неправильну відповідь");
        };
        System.out.println(respond2);



    }
}




