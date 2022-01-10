package com.javarush.task.task09.task0925;

public class Origin {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;// не статик может спокойно обращаться к статикам в своем классе
    public static int D = A * B; // так как здесь модификатор статик то А и Б должны быть статик

    public static void main(String[] args) {
        Origin origin = new Origin();
        origin.A = 5;

        Origin.D = 5; //обращение из статического метода к нестатической переменной
    }

    public int getA() {
        return A;
    }

}
