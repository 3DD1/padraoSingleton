public class XBOX {
    private XBOX(){};
    private static XBOX instance = new XBOX();
    public static XBOX getInstance(){
        return instance;
    }


    private String controle;
    private String heatseat;

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public String getHeatseat() {
        return heatseat;
    }

    public void setHeatseat(String heatseat) {
        this.heatseat = heatseat;
    }
}
