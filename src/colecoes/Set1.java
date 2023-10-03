package src.colecoes;

import java.util.HashSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("MariaJoana");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("MariaJoana");

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("MariaJoana"));

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x'));

        java.util.Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);

        System.out.println(conjunto);
        System.out.println("O tamanho é: " + conjunto.size());



    }
}
