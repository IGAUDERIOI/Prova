package br.com.senac.prova.Dto;

public class parDto {

    private double restoDivisao;
    private String imparPar;


    public parDto(String imparPar, double restoDivisao) {
        this.imparPar = imparPar;
        this.restoDivisao = restoDivisao;
    }

    public double getRestoDivisao() {
        return restoDivisao;
    }

    public void setRestoDivisao(double restoDivisao) {
        this.restoDivisao = restoDivisao;
    }

    public String getImparPar() {
        return imparPar;
    }

    public void setImparPar(String imparPar) {
        this.imparPar = imparPar;
    }
}
