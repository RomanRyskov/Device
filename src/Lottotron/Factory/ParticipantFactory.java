package Lottotron.Factory;

import Lottotron.Model.Participant;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParticipantFactory extends Participant {
    public ParticipantFactory(int passportId, String name, int age, String gender) {
        super(passportId, name, age, gender);
    }
    private static final Random rand = new Random();
    private static final List<String> participants = List.of("Александра","Дарья","Дмитрий","Роман","Екатерина","Александра");


    public static Participant next(){
        String gender;
        String name = participants.get(rand.nextInt(participants.size()));
        int age = rand.nextInt(100);
        if(name.equals("Александра") || name.equals("Дарья") || name.equals("Екатерина")){gender = "Женщина";}
        else {gender = "Мужчина";}
        int passportId = rand.nextInt(100000,1000000);
        return new Participant(passportId,name,age,gender);
    }
}
