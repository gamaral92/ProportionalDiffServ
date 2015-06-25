package proportionaldiffserv;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author gabrielamaral
 */
public class Roteador {

    private final double link;
    private final double pckt;
    private double ocupacao;
    private double tamLink;

    private List<Double> classe0;
    private List<Double> classe1;
    private List<Double> classe2;

    private Random random;

    private double c0;
    private double c1;
    private double c2;

    public Roteador(double ocupacao, double c0, double c1, double c2) {
        this.ocupacao = ocupacao;
        this.c0 = c0;
        this.c1 = c1;
        this.c2 = c2;
        this.link = 10_000_000.0;
        this.pckt = 1500.0;
        this.tamLink = ((link * ocupacao) * 0.125) / pckt;
        this.classe0 = new LinkedList<>();
        this.classe1 = new LinkedList<>();
        this.classe2 = new LinkedList<>();
        iniciarRandom();
        carregarFilas();
    }

    private void iniciarRandom() {
        long semente = System.currentTimeMillis();
        random = new Random(semente); // semente aleatoria
        //System.out.println("Semente = " + semente);
    }

    private double aleatorio() {
        return 1.0 - random.nextDouble();
    }

    private void carregarFilas() {
        double cont = 0.0;
        while (cont < tamLink) {
            double classe = aleatorio();
            if (classe <= 0.25) {
                classe0.add(0, cont);
            } else if (classe > 0.25 && classe <= 0.6) {
                classe1.add(0, cont);
            } else if (classe > 0.6) {
                classe2.add(0, cont);
            }
            cont++;
        }
    }

    public void simulacao() {

        double tempoSimulacao = 10_000.0; //indica o tempo total (termino) da simulacao
        double tempoDecorrido = 0.0;

        while (true) {
            
            //FIM DA SIMULAÇÃO
            if (tempoDecorrido > tempoSimulacao) {
                break;
            }
        }

    }
}
