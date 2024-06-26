package org.Ejercicio1;

public class Camion extends Vehiculos {

    private int ejes;
    @Override
    public double calcularImporte() {
        double importe;
        if (ejes<=3){
            importe=getMinutos()*4.5/60;
        }
        else{
            importe=getMinutos()*6.5/60;
        }
        if(isBono()){
            importe*=0.6;
        }
        return importe;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public Camion(int ejes) {
        this.ejes = ejes;
    }
}
