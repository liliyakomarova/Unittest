package org.example;
public class Main {

    public static void main(String[] args) {
        MagicBox<String> magicBox = new MagicBox<>(4);

        magicBox.add("item");
        magicBox.add("item1");
        magicBox.add("item2");
        magicBox.add("item3");
        magicBox.add("item4");
        magicBox.pick();

        System.out.println(" ");

        MagicBox<Integer> magicBox1 = new MagicBox<>(3);

        magicBox1.add(1);
        magicBox1.add(2);
        magicBox1.add(3);
        magicBox1.add(4);
        magicBox1.add(5);
        magicBox1.pick();



    }
}