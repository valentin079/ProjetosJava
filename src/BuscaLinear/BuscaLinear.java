package BuscaLinear;

import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] estados = new String[10];
        estados[0]  = "SE";
        estados[1]  = "SP";
        estados[2]  = "RJ";
        estados[3]  = "CE";
        estados[4]  = "SC";
        estados[5]  = "RS";
        estados[6]  = "RO";
        estados[7]  = "AL";
        estados[8]  = "AC";
        estados[9]  = "MG";

        System.out.println("Qual sigla deseja verificar?");
        String sigla = sc.nextLine();

        int posicao=0;
        boolean existe =  false;
        for(int i=0; i< estados.length; i++){
            String elemento = estados[i];
            if(elemento.equals(sigla)){
                existe = true;
                posicao = i;
                break;
            }
        }

        if (existe == true){
            System.out.println("Achou na posição "+ posicao+ " do vetor");
        }else{
            System.out.println("Não existe!");
        }

    }
}