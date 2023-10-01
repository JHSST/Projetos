class VeiculoEletrico {
    private String modelo;
    private String marca;
    private int autonomiaKm;
    private int velocidadeMaximaKmH;
    private double precoSugerido;

    public VeiculoEletrico(String modelo, String marca, int autonomiaKm, int velocidadeMaximaKmH, double precoSugerido) {
        this.modelo = modelo;
        this.marca = marca;
        this.autonomiaKm = autonomiaKm;
        this.velocidadeMaximaKmH = velocidadeMaximaKmH;
        this.precoSugerido = precoSugerido;
    }



    @Override
    public String toString() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nAutonomia (km): " + autonomiaKm
                + "\nVelocidade Máxima (km/h): " + velocidadeMaximaKmH + "\nPreço Sugerido: " + precoSugerido;
    }
}
