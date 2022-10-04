package org.example;

public class Main {
    public static void main(String... args)
    {
        System.out.println(test(20));
        final int max = 90; // Максимальное число для диапазона от 0 до max
        final int rnd = rnd(max);
    }

    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }
    public static String test( int temperature) {
        if (rnd(90) > 20 && rnd(90) < 45 && temperature > -20 && temperature < 30) {
            return"Можно идти гулять";}
        else if (rnd(90) < 20 && temperature>0 && temperature<28){return"Можно идти гулять";}
        else if (rnd(90)>45 && temperature>-20 && temperature<25 ){return "Можно идти гулять";}
        else {return "Сидите дома";}}




}
