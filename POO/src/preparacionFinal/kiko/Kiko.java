package preparacionFinal.kiko;

public class Kiko {
    private static Kiko instance;
    double nivelBateria;
    private static double umbralCambioExtraBat = 50;
    private static double extraBat;

    private Kiko(){
        this.nivelBateria = 100;
    }
    public static Kiko getInstance(){
        if(instance == null){
            instance = new Kiko();
        }
        return instance;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public static void setUmbralCambioExtraBat(double umbralCambio) {
        umbralCambioExtraBat = umbralCambio;
    }
    public double getUmbralCambioExtraBat() {
        return umbralCambioExtraBat;
    }
    public void setExtraBat(double extraBat) {
        this.extraBat = extraBat;
    }
    public double getExtraBat() {
        if(nivelBateria<umbralCambioExtraBat){
            return extraBat*2;
        }else{return extraBat;}
    }

}
