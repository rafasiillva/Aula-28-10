public class App {

    public static void main(String[] args) throws Exception {
    Futebol timeFutebol = new Futebol ();
    
    timeFutebol.status();

    timeFutebol.setTime("Flamengo");
    System.out.println(timeFutebol.getTime());

    timeFutebol.setCampeonato("Brasileirão Série A");
    System.out.println(timeFutebol.getCampeonato());

}
}