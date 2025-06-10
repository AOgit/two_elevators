package ait.elevator.model;

public class Elevator {
    private String name;
    private int currentVolume;

    public Elevator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void add(int portion) {
        this.currentVolume = this.currentVolume + portion;
    }

}
