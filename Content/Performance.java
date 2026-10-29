package Content;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

import Content.Abstract.Participant;

public class Performance {
    private PerformanceParams params;
    private ArrayList<Participant> participants = new ArrayList<Participant>();
    private Queue<Participant> participantsQueue = new LinkedList<Participant>();
    private int step = 1;

    public Performance(PerformanceParams params) {
        this.params = params;
    }

    public void addPatrticipant(Participant participant) {participants.add(participant);}

    public void perform() {
        while (step < 10) {
            for (Participant participant : participants) {
                participantsQueue.add(participant);
            }
            while (!participantsQueue.isEmpty()) {
                participantsQueue.poll().performaceMove(params,step);
            }
            step++;
        }
        for (Participant participant : participants) {
            System.out.println(participant);
        }
        System.out.println(params);
    }
}

