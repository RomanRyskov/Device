package Lottotron;


import Lottotron.Factory.ParticipantFactory;
import Lottotron.Model.Participant;
import Lottotron.Servises.LotteryMachine;

public class Main {
    public static void main(String[] args) {
        LotteryMachine<Participant> lotto = new LotteryMachine<>();
        for (int i = 0; i < 20; i++) {
            lotto.add(ParticipantFactory.next());
        }

        for (int i = 1; i < 10; i++) {
            System.out.println("🎰 " + i + " розыгрыш:");
            while (lotto.getCount() > 0) {
                System.out.println(lotto.pick());
            }
            lotto.reset();
        }
        System.out.println("________________________________");
        System.out.println("Статистика по победителям:");
        System.out.println(lotto.ageToWinners());
        System.out.println("Статистика по полу:");
        System.out.println(lotto.sexToWinnersCount());

    }
}


