package models;

import java.util.ArrayList;

public class Squad {
    // Attributs
    private String name;
    private Manager manager;
    private ArrayList<Player> players;
    private int totalBudget;
    private int transfertBudget;

    // Getters
    public String getName() {
        return name;
    }

    public Manager getManager() {
        return manager;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int getTotalBudget() {
        return totalBudget;
    }

    public int getTransfertBudget() {
        return transfertBudget;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setTotalBudget(int totalBudget) {
        this.totalBudget = totalBudget;
    }

    public void setTransfertBudget(int transfertBudget) {
        this.transfertBudget = transfertBudget;
    }
}