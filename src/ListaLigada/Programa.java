package ListaLigada;

public class Programa {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("SE");


        //REMOVER ESTADOS DA LISTA
        lista.remover("AC");
        lista.remover("BA");
        lista.remover("CE");
        lista.remover("SE");
        System.out.println("Tamanho: "+ lista.getTamanho());

        for(int i=0; i<lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }
}
