package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        //task2();
        //task25();
        task48();
        //task59();
    }
    /**
     * task2) Дано целое число N (32 ≤ N ≤ 126). Вывести символ с кодом, равным N.
     */
    private static void task2() {
        int n = (int) (Math.random() * 95)+32;
        System.out.println(n);
        char symbol = (char) n;
        System.out.println(symbol);
    }
    /**
     * task25) Дана строка, изображающая десятичную запись целого положительного числа.
     *         Вывести строку, изображающую двоичную запись этого же числа.
     */
    private static void task25() {
        System.out.print("Введите целое число (N>0) N=");
        Scanner scan=new Scanner(System.in);
        int number =scan.nextInt();
        if (number>0){
            System.out.println(number);
            while( number !=0 ) {
                number /= 2;
                int result = number%2;
                System.out.print(result);
            }
        }
        else {
            System.out.println("Вы ввели неправильно число,повторите попытку.");
        }
    }
    /**
     * task48) Дана строка, состоящая из слов кириллицей, набранных заглавными буквами и разделенных пробелами (одним или несколькими).
     * Преобразовать каждое слово в строке, заменив в нем все последующие вхождения его первой буквы на символ «.» (точка).
     * Например, слово «МИНИМУМ» надо преобразовать в «МИНИ.У.».
     * Количество пробелов между словами не изменять.
     */
    private static void task48() {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Введите слово : ");
        String result ="";
        String S=scan.nextLine();
        String[] words = S.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] ch=words[i].toCharArray();
            result+=ch[0];
            for (int j = 1; j < ch.length; j++) {
                if (ch[j]==ch[0]){
                    ch[j]='.';
                }
                result+=ch[j];
            }
            result+=" ";
        }
        System.out.println(result);
    }
    /**
     * task59) Дана строка, содержащая полное имя файла, т. е. имя диска, список каталогов (путь), собственно имя и расширение.
     * Выделить из этой строки расширение файла (без предшествующей точки).
     */
    private static void task59() {
        //D:\физика\2.37\Лаб.№2.37 Антонішин АТ-211.pdf
        String petro="D:\\физика\\2.37\\Лаб.№2.37 Антонішин АТ-211.pdf";
        String delimeter = "\\.";
        String[] words = petro.split(delimeter);
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);
    }
}
