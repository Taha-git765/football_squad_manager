package models;

public class Manager {
    // Attributs
    private String name;
    private String firstName;
    private int general;
    private Squad squad;

    // Getters
    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getGeneral() {
        return general;
    }

    public Squad getSquad() {
        return squad;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGeneral(int general) {
        this.general = general;
    }

    public void setSquad(Squad squad) {
        this.squad = squad;
    }
}
