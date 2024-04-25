package Modelos;

public class InfoConversao {
    public InfoConversao(InfoTipos meusTipos) {
        this.suaMoeda = meusTipos.base_code();
        this.moedaParaConverter = meusTipos.target_code();
        this.taxaDeConversao = meusTipos.conversion_rate();
        this.valorConvertido = Math.round(meusTipos.conversion_result() * 100.0 ) / 100.0;
    }

    public String getSuaMoeda() {
        return suaMoeda;
    }

    public String getMoedaParaConverter() {
        return moedaParaConverter;
    }

    public double getTaxaDeConversao() {
        return taxaDeConversao;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    @Override
    public String toString() {
        return
                "suaMoeda='" + suaMoeda + '\'' +
                ", moedaParaConverter='" + moedaParaConverter + '\'' +
                ", taxaDeConversao=" + taxaDeConversao +
                ", valorConvertido=" + valorConvertido ;
    }

    private String suaMoeda;
    private String moedaParaConverter;
    private double taxaDeConversao;
    private double valorConvertido;
}
