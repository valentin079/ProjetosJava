package ListaLigada;

public class Programa {
    public static void main(String[] args) {

        ListaLigada<String> lista = new ListaLigada<String>();
        ListaLigada<Integer> listaInteiros = new ListaLigada<Integer>();

        //ADICIONANDO ELEMENTOS A LISTA DE INTEIROS
        listaInteiros.adicionar(8);
        listaInteiros.adicionar(100);
        listaInteiros.adicionar(26);

        //IMPRIMINDO A LISTA DE INTEIROS
        System.out.println("IMPRIMINDO A LISTA DE INTEIROS:");
        System.out.println("TAMANHO DA LISTA DE INTEIROS "+ listaInteiros.getTamanho());
        for(int i=0; i<listaInteiros.getTamanho(); i++){
            System.out.println(listaInteiros.get(i).getValor());
        }
        System.out.println();




        //ADICIONANDO ESTADOS A LISTA ENCADEADA DE STRINGS
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("SE");
        //REMOVENDO ESTADOS DA LISTA ENCADEADA DE STRINGS
        /*
        lista.remover("AC");
        lista.remover("BA");
         */
        lista.remover("CE");
        lista.remover("SE");
        //IMPRIMINDO A LISTA DE STRINGS
        System.out.println("IMPRIMINDO A LISTA DE STRINGS:");
        System.out.println("Tamanho: "+ lista.getTamanho());
        for(int i=0; i<lista.getTamanho(); i++){
            System.out.println("O estado "+lista.get(i).getValor()+" foi adicionado a lista encadeada");
        }
    }
}
