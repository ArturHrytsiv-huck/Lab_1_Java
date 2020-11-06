package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // hello word
        System.out.println("~~~~~~~~Довільне повідомлення~~~~~~~~~");
/*
* begin_of_integral - first num of integral
* end_of_integral - last number of integral
*
* */
        System.out.print("Введіть інтервал наприклад [х;у]  ");
        Scanner begin_of_integral = new Scanner(System.in);
        Scanner end_of_integral = new Scanner(System.in);
        Integral integral1 = new Integral();
        /*
        * variables of begin and end in class Integral are private so i need to use setters
        * to set their value
        */
        integral1.setBegin(begin_of_integral.nextInt());
        integral1.setEnd(end_of_integral.nextInt());
        integral1.print_list_not_even_nums();
        integral1.print_list_even_nums();
        integral1.sum_of_nums();
        int minimal_number = 0;
        //number of amount of fibonacci numbers can`t be less than 2 because we have
        //first 2 numbers, so i started a cycle of enter right number (3 >=)
       while(minimal_number < 2)
       {
           Scanner amount_of_fibonacci;
           System.out.print("Введіть кількість чисел ряду Фібоначчі - ");
           amount_of_fibonacci = new Scanner(System.in);
           minimal_number = amount_of_fibonacci.nextInt();
       }
        Fibonacci first = new Fibonacci();
        first.setAmount(minimal_number);
        first.setBegin_of_fibonacci(integral1.getEnd());
        first.func_fibonacci();
    }
}
