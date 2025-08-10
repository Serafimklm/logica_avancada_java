package pacoteVetores;

import javax.imageio.stream.FileImageInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;  // pacote da classe manipuladora de arquiovs
import java.io.InputStreamReader;
import java.util.Scanner;  //pacote scanner


//--------------------------------------------------PARA A LEITURA DE DADOS-------------------------------------------------
public class ManipulacaoDeArquivosTexto {
    public static void main(String[] args) throws IOException {  // o metodo main esta tratando exessoes
        Scanner scanner = new Scanner(System.in); // cria um objeto para ler entradas do teclado (não usado neste código)

        FileInputStream arquivo = new FileInputStream("arquivo.txt"); // abre um fluxo de bytes para ler o arquivo "arquivo.txt" na raiz do programa
        InputStreamReader conversor = new InputStreamReader(arquivo);  // converte os bytes lidos do arquivo em caracteres (interpreta como texto)
        BufferedReader dados = new BufferedReader(conversor);  // armazena em buffer e permite leitura eficiente de linhas de texto

        String s; // variável para armazenar cada linha lida
        do {
            s = dados.readLine(); // lê uma linha do arquivo e armazena em "s"
            if (s == null ) // verifica se chegou ao final do arquivo
                break; // interrompe o loop se não houver mais linhas
            System.out.println(s); // imprime a linha atual
        }
        while (true); // repete até encontrar o final do arquivo
        dados.close(); // fecha o BufferedReader e libera os recursos


    }
}

