package org.example;

public class CoronaDisinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Prepare for the disinfection!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("Disinfection complete");
    }

    private void disinfect(Room room) {
        System.out.println("Disinfecting...");
    }
}
