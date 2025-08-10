package pacoteVetores;

import java.io.*;
import java.util.Scanner;


public class ManipuacaoArquivosRW {
    Scanner scanner = new Scanner(System.in);
    //para escrita se usa FileWriter & PrintWriter
    private static void escrever (String[] nomes) throws IOException{
        File arquivo = new File("/home/seraffimklm/Applications/listagem.txt\n");
        if (!arquivo.exists())
            arquivo.createNewFile();

        FileWriter fileWriter = new FileWriter(arquivo, false);

        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (int i = 0; i < nomes.length; i++) {
            printWriter.println(nomes[i]);

        }
        printWriter.println("teste");

        printWriter.flush(); // para garantir que tudo que tinha de ser escrito, foi
        printWriter.close(); // para fechar o algoritmo e liberar essa parte do programa
    }
//-------------------------------------------leitura------------------------------------------------------
    // para leitura de dados pode se usar FileReader & BufferedReader
    private static void leitor (String[]nomes) throws IOException{

        File arquivo = new File("/home/seraffimklm/Applications/listagem.txt");
        if (!arquivo.exists()) {
            System.out.println("O arquivo listagem.txt nao existe ");
            return;  // sai dessa parte sem executar as linhas do algorimo de nomes
        }

        FileReader fileReader =
                new FileReader(arquivo);
        BufferedReader buffer =
                new BufferedReader (fileReader);

        String linha = "";

        while ((linha = buffer.readLine()) != null)
        {
            System.out.println(linha);
        }
    }


//-----------------------------main----------------------------------

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String alunos[] = {"mria", "bobSinger", "marcos"};

        escrever(alunos);
        leitor(alunos);

    }





}
