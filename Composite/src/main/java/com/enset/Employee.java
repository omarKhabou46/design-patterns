package com.enset;

public class Employee implements OrganizationComponent {
    private String nom;
    private String poste;

    public Employee(String nom, String poste) {
        this.nom = nom;
        this.poste = poste;
    }

    @Override
    public void showDetails() {
        System.out.println("employee  : "+ nom + "  " + poste);
    }
}
