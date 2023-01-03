public class Usuario {
    
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("TV LIGADA? "+smartTv.ligada);
        System.out.println("CANAL: "+ smartTv.canal);
        System.out.println("VOLUME: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println(" - - Novo Status - - \nTV ligada ? "+smartTv.ligada);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Novo Canal: "+ smartTv.canal);
    }

}

