public class Futebol {
    private String time;
    private String campeonato;
    private boolean jogar;
    
    public void Futebol (){
        this.jogar();
    } 
    
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

    public void jogando (){
       this.jogar = false;
    }


    public void status (){
        System.out.println("O time está jogando? " + this.jogar);
    }

}
