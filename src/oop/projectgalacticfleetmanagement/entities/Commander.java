package oop.projectgalacticfleetmanagement.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commander {
    private String name;
    private String credential;
    private String patent;
    private LocalDate commissioningDate;
    private List<Spacecraft> spaceships = new ArrayList<>();

    public void addSpaceship(Spacecraft spaceship){
        spaceships.add(spaceship);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("======COMMANDER INFORMATION======\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Credential: ").append(credential).append("\n");
        sb.append("Patent: ").append(patent).append("\n");
        sb.append("Commissioning date (yyyy-mm-dd): ").append(commissioningDate).append("\n");
        if (spaceships.isEmpty()) {
            sb.append("No spaceships registered.");
        } else {
            sb.append("Commander ").append(name).append(" has ").append(spaceships.size()).append(" spaceships\n");
            for (Spacecraft spacecraft : spaceships) {
                sb.append(spacecraft).append("\n");
            }
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public LocalDate getCommissioningDate() {
        return commissioningDate;
    }

    public void setCommissioningDate(LocalDate commissioningDate) {
        this.commissioningDate = commissioningDate;
    }

    public List<Spacecraft> getSpaceships() {
        return spaceships;
    }
}
