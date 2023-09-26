package org.example.Entities;

import org.example.DamageType;

import java.util.ArrayList;

public abstract class Entity {
    String name;
    int currentHealth;
    int maxHealth;

    public ArrayList<DamageType> resistances;
    public ArrayList<DamageType> vulnerabilities;

    public Entity(String name, int health) {
        this.name = name;
        this.currentHealth = health;
        this.maxHealth = health;
        this.resistances = new ArrayList<>();
        this.vulnerabilities = new ArrayList<>();
    }

    public ArrayList<DamageType> getResistances() {
        return resistances;
    }

    public ArrayList<DamageType> getVulnerabilities() {
        return vulnerabilities;
    }

    public void addResistances(DamageType resistances) {
        this.resistances.add(resistances);
    }

    public void addVulnerabilities(DamageType vulnerabilities) {
        this.vulnerabilities.add(vulnerabilities);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setCurrentHealth(int health) {
        this.currentHealth = health;
    }

    public void takeDamage(int damage, DamageType damageType){
        if (this.getResistances().contains(damageType)){
            damage = damage / 2;
        }
        if (this.getVulnerabilities().contains(damageType)){
            damage = damage * 2;
        }
        this.setCurrentHealth(this.getCurrentHealth() - damage);
    }

}
