package models;

public class Player {
    // Attributs
    private String name;
    private String firstName;
    private Poste poste;
    private String nationality;
    private int general;
    private int age;
    private Squad squad;


    // Getters
    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public Poste getPoste() {
        return poste;
    }
    public String getNationality() {
        return nationality;
    }

    public int getGeneral() {
        return general;
    }

    public int getAge() {
        return age;
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
    public void setPoste(Poste poste) {
        this.poste = poste;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setGeneral(int general) {
        this.general = general;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSquad(Squad squad) {
        this.squad = squad;
    }
}