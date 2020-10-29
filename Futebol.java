public class Futebol {
    private String time;
    private String campeonato;
    int classificacao, numPontos;
    
    public void setTime(String nomeTime) {
        this.time = nomeTime;
    }

    public String getTime() {
        return time;
    }


    public void setCampeonato(String campTime) {
        this.campeonato = campTime;
    }
    
    public String getCampeonato() {
        return campeonato;
    }

    void jogar(){
        System.out.println("Jogando para disputar a primeira colocação!!");
    }

}
