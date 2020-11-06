package com.company;

public class Fibonacci {
    private int begin_of_fibonacci;
    private int amount;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setBegin_of_fibonacci(int begin_of_fibonacci) {
        this.begin_of_fibonacci = begin_of_fibonacci;
    }
    // statistic_of_num - count percents of even nums  at func_fibonacci

    void statistic_of_num(int array[]) {
        int even_nums = 0;
        for(int i = 0; i < amount; i++)
        {
            if (array[i] % 2 == 0) {
                even_nums++;
            }
        }
        double percent_of_even = 0;
        percent_of_even = (((double)even_nums) / ((double)amount)) * 100;
        System.out.println("\nПроцент парних чисел у ряді - " + percent_of_even + "%" + "\nПроцент непарних чисел у ряді - " + (100 - percent_of_even) + "%");
    }

    /*
     * func_fibonacci - every next number of this function is sum of 2 previous numbers
     * amount - amount of numbers of this function
     */

    public void func_fibonacci ()
    {
        int [] fibonacci_array = new int [amount];
        if(begin_of_fibonacci % 2 == 1)
        {
            fibonacci_array[0] = begin_of_fibonacci;
            fibonacci_array[1] = begin_of_fibonacci - 1;
        }
        else
        {
            fibonacci_array[0] = begin_of_fibonacci - 1;
            fibonacci_array[1] = begin_of_fibonacci;
        }
        System.out.print("Ряд Фібоначчі: " + fibonacci_array[0] + ", " + fibonacci_array[1] + ", ");
        for(int i = 2; i < amount; i++)
        {
            fibonacci_array[i] = fibonacci_array[i-1] + fibonacci_array[i-2];
            System.out.print(fibonacci_array[i] + ", ");
        }
        statistic_of_num(fibonacci_array);
    }

}
