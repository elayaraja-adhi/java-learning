package Busreservation;

public class bus {
    private int busno;
    private boolean Ac;
    private int Capacity;

    public bus(int busno, boolean Ac, int Capacity) {
        this.busno = busno;
        this.Ac = Ac;
        this.Capacity = Capacity;
    }
    public int getbusno(){
        return busno;
    }
    public void setbusno(int busno){
        this.busno=busno;
    }
    public boolean getAc(){
        return Ac;
    }
    public void setAc(boolean Ac){
        this.Ac=Ac;
    }
    public int getCapacity(){
        return Capacity;
    }

    public void setCapacity(int Capacity){
        this.Capacity = Capacity;
    }
    public void displayBusinfo(){
       System.out.println("Bus No:" + busno + " Ac:" + Ac + "Total Capacity:" + Capacity);
    }
}
