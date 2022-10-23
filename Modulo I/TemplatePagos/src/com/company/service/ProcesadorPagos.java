package com.company.service;

import com.company.model.Tarjeta;

public abstract class ProcesadorPagos {

    public void validarPagos(Tarjeta tarjeta, double montoACobrar) {}

    protected abstract void autorizarPago(double pago);

    private void validarFecha(){
        if
    }

    private void procesarPago(){}

    private void mostrarEstadoPago(){}

}
