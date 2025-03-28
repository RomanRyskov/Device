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

        System.out.println("🎰 Первый розыгрыш:");

        for(int i = 0; i<2; i++){
            System.out.println(lotto.pick());
        }

        System.out.println("\n🔁 Новый розыгрыш:");
        lotto.reset();

    }
}


