package Lottotron2;


import Lottotron2.Factory.ParticipantFactory;
import Lottotron2.Model.Participant;
import Lottotron2.Servises.LotteryMachine;
import Lottotron2.exception.UnderageException;

public class Main {
    public static void main(String[] args) throws UnderageException {
        LotteryMachine<Participant> lotto = new LotteryMachine<>();
        try {
            for (int i = 0; i < 20; i++) {
                lotto.add(ParticipantFactory.next());
            }
        } catch (Exception e) {
            System.out.println(e);
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


