public class XBOX {
    private XBOX(){};
    private static XBOX instance = new XBOX();
    public static XBOX getInstance(){
        return instance;
    }


    private String controle;
    private String heatset;

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public String getHeatset() {
        return heatset;
    }

    public void setHeatset(String heatset) {
        this.heatset = heatset;
    }
}
