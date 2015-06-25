package proportionaldiffserv;

/**
 *
 * @author gabrielamaral
 */
public class Main {

    public static void main(String[] args) {
        double ocupacao = 0.6;
//        double ocupacao = 0.8;
//        double ocupacao = 0.9;
//        double ocupacao = 0.98;
        Roteador r = new Roteador(ocupacao, 1.0, 2.0, 4.0);
        r.simulacao();
        Roteador r1 = new Roteador(ocupacao, 1.0, 1.4, 1.6);
        r1.simulacao();
    }
    
}
