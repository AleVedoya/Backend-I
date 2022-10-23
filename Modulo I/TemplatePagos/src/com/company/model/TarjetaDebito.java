package com.company.model;

public class TarjetaDebito extends Tarjeta{

    private double saldoDisponible;

    public TarjetaDebito(String numeroFrente, int codigoSeguridad, String fechaExpiracion, double saldoDisponible) {
        super(numeroFrente, codigoSeguridad, fechaExpiracion);
        this.saldoDisponible = saldoDisponible;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
