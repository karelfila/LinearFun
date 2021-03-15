package com.company;

import java.util.Objects;

public class Funkce {
    private String funkce;

    public Funkce(String fce) {
        funkce = fce;
    }

    public void setFunkce(String funkce) {
        this.funkce = funkce;
    }

    public String getFunkce() {
        return funkce;
    }

    public String toString(){
        return funkce;
    }

    public boolean equals(Funkce o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return this.funkce.equals(o.funkce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funkce);
    }
}
