package pacoteVetores;

/*Manipulando o conteudo de um arquivo
* Muitos tipos de arquivo trabalham de forma binária, um exemplo é um arquivo de musica, video.
* Nesse formato os dados não ficam legíveis para nós humanos, mesmo se gravarmos um texto
* Para manipular arquivos nesse formato podemos usar duas classes
* *FileOutPutStrem é uma classse que grava dados binários(bytes no arquvivo) Você deve informar para essa classe um objeto do tipo File ou um nome String para o arquivo
* *DataOutPutStream  - Se tentarmos gravar dados que estão em variáveis (tipos privmitivos de dados) um arquvio binário teriamos um problema, pois
* são formatos diferentes. Mas como essa classe conseguimos converter daods dos tipos rpimitivos em bites*/

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ManipulacaoArquivosBinarios {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nome do user: ");
        String nome = scanner.next();

        System.out.println("sexo: ");
        char sexo = (char) System.in.read();  //para capturar apenas um letra digitada

        System.out.println("idade: ");
        int idade = scanner.nextInt();

        System.out.println("salario ");
        double salario = scanner.nextDouble();

        FileOutputStream  arquivo  = new FileOutputStream("/home/seraffimklm/IdeaProjects/arquivo.dat");

        DataOutputStream gravador = new DataOutputStream(arquivo);// O gravador escreve os dados no arquivo em formato binário
        // (não legível diretamente por humanos)


        // agora ele vai escrever em cada arquivo, preenhendo de fato
        gravador.writeUTF(nome);
        gravador.writeChar(sexo);
        gravador.writeInt(idade);
        gravador.writeDouble(salario);
        // Se usássemos métodos de leitura (read...), não estaríamos gravando nada;
        // a leitura também retorna os dados no formato binário que foi gravado.

        gravador.close();

        System.out.println("---------------------programa finalizado------------------------");
    }

}
