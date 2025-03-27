package Lottotron;

public class Main {
    public static void main(String[] args) {
      LotteryMachine<String> lotteryMachine = new LotteryMachine<>();
      lotteryMachine.add("Дима");
      lotteryMachine.add("Саша");
      lotteryMachine.add("Ира");
      lotteryMachine.add("Валера");
      lotteryMachine.add("Наташа");

      String name = lotteryMachine.pick();
      while (name != null){
          System.out.println("Выбран " + name);
      }
      lotteryMachine.reset();



    }
}
