package model;

import java.util.ArrayList;

public abstract class Pet {

    protected double clinicHistoryNumber;
    protected String name;
    protected String breed;
    protected Owner owner;
    protected ArrayList<Medicine> prescription;

    public Pet(String name, String breed, Owner owner) {
        this.clinicHistoryNumber = Math.floor(100000 + Math.random() * 900000);
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.prescription = new ArrayList<Medicine>();
    }

    public void addMedicine(Medicine medicine){
        this.prescription.add(medicine);
        medicine.decreaseStock(1);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "clinicHistoryNumber=" + clinicHistoryNumber +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", owner=" + owner +
                ", prescription=" + prescription +
                '}';
    }
}
