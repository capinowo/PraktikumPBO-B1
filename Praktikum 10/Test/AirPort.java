/*
Nama    : Alya Safina
NIM     : 24060122140123
*/

public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(){

    }

    public AirPort(String name){
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer){
        if (flyer instanceof Airplane){
            return flyer + " diizinkan untuk mendarat";
        }
        else{
            return "Izin mendarat ditolak";
        }
    }
}