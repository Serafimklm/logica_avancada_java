package pacoteVetores;

import java.io.*;
import java.util.Scanner;


public class ManipulacaoDeArquivosTextoEscrita {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        FileOutputStream arquivo = new FileOutputStream("arquivo.txt", true); // se colocar true, ele salva os novos texto sem apagar os anteriorres

        OutputStreamWriter conversor = new OutputStreamWriter(arquivo);

        BufferedWriter dados = new BufferedWriter(conversor);

        System.out.println("digite o que deseja salvar");
        String texto = scanner.next();

        dados.newLine(); //forçando uma quebra de linha
        dados.write(texto);
        dados.close();



    }
}
