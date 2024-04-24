package dev.ens.statics;

public class Main {

    public static void main(String[] args) {

        Counter counter1 = new Counter(1);
        Counter.totalCount = 1;
        System.out.println(counter1);
        System.out.println(Counter.totalCount);

    }
}
