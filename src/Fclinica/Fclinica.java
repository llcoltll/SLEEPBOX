/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fclinica;

/**
 *
 * @author lg
 */
public class Fclinica {

    public Fclinica(int Altura, int Peso, int EPWORTH, CaracteristicaPeso Cpeso, int CircAbdominal, int CircNeck, int Mallanpati, boolean Fumante, boolean Etilista, int Apneia, int MicroDespertares, int MicroDespertaresHora, int PLM, SaturacaoO2 SatO2, int Desaturacoes, boolean Narcolepsia, SPAP Spap, boolean latenciasMultiplas, SONO sono) {
        this.Altura = Altura;
        this.Peso = Peso;
        this.IMC = Peso / Altura^2;
        this.EPWORTH = EPWORTH;
        this.Cpeso = Cpeso;
        this.CircAbdominal = CircAbdominal;
        this.CircNeck = CircNeck;
        this.Mallanpati = Mallanpati;
        this.Fumante = Fumante;
        this.Etilista = Etilista;
        this.Apneia = Apneia;
        this.MicroDespertares = MicroDespertares;
        this.MicroDespertaresHora = MicroDespertaresHora;
        this.PLM = PLM;
        //this.SatO2 = SatO2;
        this.Desaturacoes = Desaturacoes;
        this.Narcolepsia = Narcolepsia;
        //this.Spap = Spap;
        this.latenciasMultiplas = latenciasMultiplas;
        //this.sono = sono;
        
        
    }

    private int Altura;
    private int Peso;
    private int IMC;
    private int EPWORTH;
    private CaracteristicaPeso Cpeso;
    private int CircAbdominal;
    private int CircNeck;
    private int Mallanpati;
    private boolean Fumante;
    private boolean Etilista;;
    private int Apneia;
    private int MicroDespertares;
    private int MicroDespertaresHora;
    private int PLM;
    private SaturacaoO2 SatO2;
    private int Desaturacoes;
    private boolean Narcolepsia;
    private SPAP Spap;
    private boolean latenciasMultiplas;
    private SONO sono;

    public int getAltura() {
        return Altura;
    }
    public int getPeso() {
        return Peso;
    }
    public int getIMC() {
        return IMC;
    }
    public int getEPWORTH() {
        return EPWORTH;
    }
    public CaracteristicaPeso getCpeso() {
        return Cpeso;
    }
    public int getCircAbdominal() {
        return CircAbdominal;
    }
    public int getCircNeck() {
        return CircNeck;
    }
    public int getMallanpati() {
        return Mallanpati;
    }
    public boolean isFumante() {
        return Fumante;
    }
    public boolean isEtilista() {
        return Etilista;
    }
    public int getApneia() {
        return Apneia;
    }
    public int getMicroDespertares() {
        return MicroDespertares;
    }
    public int getMicroDespertaresHora() {
        return MicroDespertaresHora;
    }
    public int getPLM() {
        return PLM;
    }
    public SaturacaoO2 getSatO2() {
        return SatO2;
    }
    public int getDesaturacoes() {
        return Desaturacoes;
    }
    public boolean isNarcolepsia() {
        return Narcolepsia;
    }
    public SPAP getSpap() {
        return Spap;
    }
    public boolean isLatenciasMultiplas() {
        return latenciasMultiplas;
    }
    public SONO getSono() {
        return sono;
    }
    
}