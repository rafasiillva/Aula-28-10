public class App {

    public static void main(String[] args) throws Exception {
    Futebol timeFutebol = new Futebol ();
    
    timeFutebol.numPontos = 38;
    timeFutebol.classificacao = 2 ;
    
    timeFutebol.setTime("Flamengo");
    System.out.println(timeFutebol.getTime());

    timeFutebol.setCampeonato("Brasileirão Série A");
    System.out.println(timeFutebol.getCampeonato());

    System.out.println("Numero de pontos: " + timeFutebol.numPontos);
    System.out.println("Classificação: " + timeFutebol.classificacao);
    timeFutebol.jogar();
}
}