package snipets;

import common.Player;

import java.util.Random;
import java.util.Scanner;

//here we can store and test/ code parts

public class SnippetsToTest {
    static Scanner scanner = new Scanner(System.in);
    static Player[] players;
    private static int value;
    private static Random rand = new Random();
    private static int roundPoints = 0;


    public static void main(String[] args) {

        value = rand.nextInt(6);
        System.out.println(value);

    }
}
