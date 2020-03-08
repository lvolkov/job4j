package poly;


import java.util.Scanner;

public class Bus implements Transport{
    @Override
    public void move() {
    int speed = 40;
    }

    @Override
    public void passanger(int x) {
        Scanner scanner = new Scanner(System.in);
        int passanger = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public double gasVolue(int x) {
        double cost = 40*x;
        return cost;
    }
}
