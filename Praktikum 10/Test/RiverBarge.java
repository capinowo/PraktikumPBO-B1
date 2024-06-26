/*
Nama    : Alya Safina
NIM     : 24060122140123
*/

public class RiverBarge {
    private double maxLoad;

    public RiverBarge(){

    }

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad / 100;
    }

    public double calcTripDistance(){
        return 30;
    }

    public String toString(){
        return super.toString() + " adalah angkutan perairan yang sangat handal";
    }
}