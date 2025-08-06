package pacoteVetores;
/*-------------------------PARA LOCALIZAR ARQUIVOS OU PASTAS EM JAVA-------------------------------------------*/
import java.io.File;
import java.io.IOException;

public class ClassFile {
    public static void main(String[] args) throws IOException {

        String caminho = "/home/seraffimklm/vscode/nan2o.txt";

        File arquivo = new File(caminho);

        //-----------agoritmo para fazer verificacoes no arquivo
        if (arquivo.exists() && arquivo.canRead()) {
            System.out.println("o arquvo " + caminho + " EXISTE");
            if (arquivo.isFile());
            System.out.println("se trata de uma arquivio");
            if (arquivo.isDirectory()) {
                System.out.println("se trata de um diretorio");
            }
            else {
                System.out.println("Caminho ou diretorio nao valido para leitura");
            }
        }
        //algoritmo para criar o diretorio no caminho
        else {
            System.out.println("diretorio " + caminho + " NAO EXISTE");
            if (arquivo.mkdir());
            System.out.println("diretorio/pasta criado com exito, no caminho:\n" +
                    arquivo);
        }

        //-------------------POSSO LER O ARQUIVO-----------------
        if (arquivo.canRead()) {
            System.out.println("O arquivo/diretorio pode ser lido");

        }else {
            System.out.println("o arquivo nao pode ser lido ");
        }

    }

}

