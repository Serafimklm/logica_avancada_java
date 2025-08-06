package pacoteVetores;

import java.util.Scanner;

public class Vetores
 {


//------------------------------------------como são declarados os vetors-------------------------------------------------------------------
//deve se informar o tipo de dado, posteriormente colocar <[]> e o nome da 'variavel'

    public static void main(String[] args) {

  /*

   int[] ano= new int[]{2012, 2004, 1999};
    String modelo[]  = new String[]{"gol", "siena", "omega"};

    for (int i = 0; i < modelo.length; i++){
        System.out.println("modelo: " + modelo[i] + " ano " +ano[i]); // <i> corresponde a posicao atual do array em cada uma dos tipos, modelos e anos.
    }

    */
// caso eu  nao saiba quantos elementos irei precisar no vetor tenho que declarar como

        /*int idade[] = new int[5];
    idade[0] = 12;
    idade[3] = 23;
        for (int i = 0; i < idade.length; i++) {
            System.out.println("a idade digitada foi " +idade[i]);
        }*/
// vetores tem tamno fixo, nao pode ser criado de acordo com quantos elementos o usuario inserir, mas voce pode deixar o tamanho
//        fixo maior e o user nao precisar preencher por completo, o que faltar sera preenchido automaticamente com ZERO, ex acima



//-----------------------leitura e atribuição de dados------------------------------


/*
class AtribuicaoDados {

    public static void main(String[] args) {

        *//**NÃO FAZ SENTIDO FAZER ATRIBUIÇÃO DE VALOR SEM ÍNDICE DO VETOR EX:
         *  array <alunos = "Janes"> *//*

        String alunos[] = new String[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("digite o nome do aluno " + (i+1));
            alunos[i] = scanner.nextLine();
            System.out.println(alunos[i]);
        }

        *//**Nao faz sentido buscar, imprimir um vetor inteiro, e necessario informar o indicie que deseja imprimir buscar
         * system.out.println(alunos) daria erro, pois e necessario indicar a poiicao de deseja, no caso de 1 a 5;
         * *//*
        for (int i = 0; i < alunos.length; i++) {

            System.out.println("os nomes digitados foram "+alunos[i]);
        }

        *//**Nao faz sentido tentar acessar uma posicao que nao exite
         * ex: println(alunos[1231231]) sendo que existem apenas 4 alunos*//*
    */

     /*   double notasAlunos[] = new double[50];
        for (int i = 0; i < notasAlunos.length; i++) {
            notasAlunos[i] = 0;
            System.out.println("Nota do aluno " + (i + 1) + ": " + notasAlunos[i]);
        }
*/
//        ----------------------------------------IMPRIMINDO MEDIA DE NOTAS VETORES------------------------------------
  /*      Scanner scanner = new Scanner(System.in);

        double notasAluno[] = new double[6];
        int soma = 0;

        for (int i = 0; i < notasAluno.length ; i++)
        {
        System.out.println("digite a nota " + (i + 1));
            notasAluno[i] = scanner.nextInt();
            soma  += notasAluno[i];
        }

        soma  = soma / notasAluno.length;
        System.out.println("a mediia foi "  +soma);

    }
}*/


    }}
class ParImpar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeros[] = new double[23];

        for (int i = 0; i< numeros.length; i++)
        {
           System.out.printf("digite o numero  ", i+1);
           numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 ==0) {
                System.out.printf("o numero " +numeros[i] + " e par\n");
            }
        }
    }
}

//parou na pag 25 de 100



//----------------------------TAMANHO DO VETOR------------------------------------------------------

class TamanhoVetor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quantos alunos serão cadastrados?");
        int quantidadeAluno  = scanner.nextInt();
        scanner.nextLine();

        String pessoas[] = new String[quantidadeAluno]; // aqui ele pega a quantidade de alunos desejada e coloca dnetro do vetor

        System.out.println("----------------------------------------------------");
        System.out.println("a quantidade de alunos desejada e " +quantidadeAluno + "\n");



        System.out.println("\n---------------Alunos cadastrados:-------------------\n");
        // Cadastro dos nomes
        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Digite o nome do aluno %d: ", i + 1);
            pessoas[i] = scanner.nextLine();
        }
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Posição [" + i + "] - Nome digitado: " + pessoas[i]);
        }

        System.out.println("\nQuantidade de nomes: " + pessoas.length);

        System.out.println(" quantidade de nomes nomes " +pessoas.length);

    }
}


//-------------------------DESCUBRA QUAL O MAIOR NUMERO DIGITANDO DENTRO DE UM VETOR---------------------
class maiorNumero{
    public static void main(String[] args) {
        int numeroDedados2[] = new int [5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeroDedados2.length ; i++) {
            System.out.println("entre com o numero de daods " + (i+1));
            numeroDedados2[i] = scanner.nextInt();
        }
        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i <numeroDedados2.length ; i++) {
            if (numeroDedados2[i]> maiorValor) {
                maiorValor = numeroDedados2[i];
            }
        }
        System.out.println("o maior valor 'e " + maiorValor);
    }
}

//--------------------------------vetor para inprimir ao contrario do que foi digitado-----------------------
class ImprimirOndemInversa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetorDeDez[] = new int [10];

        System.out.println("-----------------ENTRE COM OS NUMEROS--------------");
        for (int i = 0; i < vetorDeDez.length; i++) {
            System.out.println("digite o "+ (i+1) +"* numero");
            vetorDeDez[i] = scanner.nextInt();
        }
        for (int i = vetorDeDez.length-1; i >= 0; i--) {
            System.out.println("maior para menor " + vetorDeDez[i]);

        }
    }
}

///-------------------------------METRIZES-------------------------------------------------------------
//o que é uma matriz?
//    Matriz é uma variavel composta, homogenia e com mais de uma dimensão,
//    uma matriz assim como um vetor, é um conjunto de dados de um determinado tipo, ou seja, tem-se um nome vinculado a vários valoresç
//    Como definição formal temos que ma matriz é uma veriável composta, homogênie a e com mais de uma  dimensão
//    Uma matriz também pode ser chamada de array multidimensional, e nesse tipo de dados, assim como vetores, sempre são alocadas em posições contínuas
//    de memória do computado, mas as linguagens de programação conseguem abstrair
//    o acsso utilizando índices çpara varias dimensõesç;
class TrabalhandoMatriz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        declarando matriz de inteiros
        int idades [][] = new int[2][4]; // declarando e instanciando na mesma linha

//        tambem poderia ser assim
        int [][] idade1;
        idade1 = new int[4][2]; // declarando e instanciando separadamente


        double salarios[][] = new double[4][4]; //declarando e isntanciando ao mesmo tempo


//        DECLARACAO DE MATRIZ COM 3 LINHAS 3 COLUNAS
        int matrz[][] =
//                       COLUNA 0  COLUNA 1  COLUNA2
                      { { 20,        30,           40}, // <- LINHA 0   //INDICIE SERA A POSICAO DO NUMERO DENTRO DA LINHA E COLUNA RESPECTIVA
                        {1,           2            ,3}, // <- LINHA 1
                        {9,           8,            3}}; // <- LINHA 2

//        ACESSANDO INDICIE 1 COLUNA 1, LINHA 2
        System.out.println("acessando indicie " +matrz[2][1]); // 2 referente a linha 3, e 1 referente a coluna 2;

        //loop  externo para percorrer cada LINHA  da matriz
        for (int linhas = 0; linhas < matrz.length; linhas++){


            // Loop para percorrer as COLUNAS da LINHA ATUAL
            // int coluna = 0: Inicia o contador de colunas na posição 0 (primeira coluna)
            // coluna < matrz[linha].length: Continua enquanto o índice da coluna for menor que
            // o total de colunas da linha atual. Isso garante que não ultrapassemos o tamanho do array.
            // matrz[linha].length retorna o número de colunas na linha atual (no exemplo, sempre 3)
            //loop para percorer cada COLUNA da linha atual;
            for (int colunas = 0; colunas < matrz[linhas].length; colunas++){

                //verifica se oelemneto na posicao [linha][coluna] e ingual a 30
                if (matrz[linhas][colunas] ==30 ){

                    //Se encontrou, imprime a posic;o (linah e coluna)
                    System.out.println("30 esta em \nlinha " + linhas + " \ncoluna" + colunas);
                }
            }
        }

    }

}

//---------------------------------PERCORRENDO MATRIZES----------------------------------------------------------------
class PercorrendoMatrizes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alunso[][] = new String[2][5];  // MATRIZ com 2 linhas e 5 colunas;

        alunso [0][0] = "marry";
        alunso[0][1] = ""; //String vazia;
        alunso[1][0] = "marcos";
        alunso[1][4] = "jonny"; // como so e definido ate o  5 so vai ate a 4 coluna, que e 0 1, 2, 3, 4 = total 5;

        //imprimindo dados da matriz
//     para isso é necessário imprimir a linha e a coluna

        // Imprimindo dados da matriz
        System.out.println("O nome que está na linha 1 e coluna 0 é: " + alunso[1][0]);
        System.out.println("O nome que está na linha 1 e coluna 4 é: " + alunso[1][4]);

//        ou assim para imprimir todos os elementos da matriz

        System.out.println("-----------------------agora todos os elementos da matriz--------------------------\n");
        for (int i = 0; i < alunso.length; i++) {
            for (int j = 0; j < alunso[i].length; j++) {
                System.out.println("Linha " + i + ", Coluna " + j + ": " +
                        (alunso[i][j] == null ? "null" :
                                alunso[i][j].isEmpty() ? "vazio" : alunso[i][j]));
            }
        }
//        note que que o laço for, imprimie toda a matriz, ate mesmo o que nao foi preenchido, com null
//        saida do for
//        Linha 0, Coluna 0: marry
//        Linha 0, Coluna 1: vazio
//        Linha 0, Coluna 2: null
//        Linha 0, Coluna 3: null
//        Linha 0, Coluna 4: null
//        Linha 1, Coluna 0: marcos
//        Linha 1, Coluna 1: null
//        Linha 1, Coluna 2: null
//        Linha 1, Coluna 3: null
//        Linha 1, Coluna 4: jonny

//        OBSERVAÇOES
//        PARA se referenciar ao numeros da matriz, se define como inteiro
//
//        ERROS COMUNS
        /** NÃO FAZ SENTIDO FAZER UMA ATRIBUICAO DE VALOR SEM OS INDICES
         * EX: alunos= "janes", o correto seria alunos [2][1] = "janels" mas desde que a matriz tenha esse tamanho
         * nao faz sendio imprimir tambem sem informar os inidces dela, o correto e sempre alunos[2][2] onde se refere a coluna e linha*/

//        OUTRA FORMA E DECLARANDO VARIAVEIS NORMALMENTE E COLOCANDO OS VALORES INTEIROS DELA DENTRO DA MATRIZ, POR EX

            int qunatidadeLinhas = 2;
            int quantidadeColunas = 3;

            int matriz[][] = new int [qunatidadeLinhas][quantidadeColunas];

        for (int linhas = 0; linhas  < qunatidadeLinhas; linhas++) { // enquanto a quantidade de linhas for menor do que 2, que esta na linha 301, e encrementa 1;

            for (int coluna = 0; coluna < quantidadeColunas; coluna++) {  // enquanto a quantidade de colunas for menor que as colunas digitadas, encrementa 1;

            matriz[linhas][coluna] = 100;
            }

        }

   }
}


//----------------------------------------------------Tamanho da estrutura------------------------------------------------------------------
class tamnhoEstrutura{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quntos alunos serao cadastrados ");
        int qtdAllunos = scanner.nextInt();

        double notas [][];
        notas = new double[qtdAllunos][5];

        for (int i = 0; i < notas.length; i++) {  // lendo a quantidade de linhas (numero de alunos) e passa para o proximo aluno (i++)
            for (int j = 0; j < notas[i].length; j++) { // descobrindo a quantidade de colunas na  linha atual
                                                        // acessando a linha atual de nota que o for externo esta axecutando
//                                                      e incrementando enquato for menor que o laço
                System.out.println
                        ("entre com a " +(j+1)+
                        " nota do aluno " + (i+1));
                        notas[i][j] = scanner.nextDouble();
            }

        }

        for (int i = 0; i < notas.length ; i++) {

            for (int j = 0; j < notas[i].length; j++) {

                System.out.println("as notas foram" +notas[i][j]) ;

            }

        }
    }
}

//-------------------------------------------------MATRIZES IMPRIMINDO NUMEROS IMPARES

class matrizes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valores[][];
        valores = new double[2][3]; // tem duas linhas e 3 colunas

        for (int i = 0; i < valores.length; i++) {  // enquanto a linha atual for menor que a quantidade de linhas ele incrementa 1;

            for (int j = 0; j < valores[i].length; j++) { // aqui ele pega atual e preenche cada coluna da linha atual

                System.out.printf("Digite o valor para a posicao (%d, %d): ", i, j);
                valores[i][j] = scanner.nextDouble();

            }
        }

            for (int w = 0; w < valores.length; w++) {  // loop das linhas

                for (int k = 0; k < valores[w].length; k++) {  // loop das colunas pegando a linha atual por meio de [w]


                    if((valores[w][k] %2) != 0){
                        System.out.println("impar " +valores[w][k]);
                    }
                }
            }


        }

    }


class MenorValozMatriz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valores[][];


        valores = new int[2][5]; // tem duas linhas e 3 colunas

        for (int i = 0; i < valores.length; i++) {  // enquanto a linha atual for menor que a quantidade de linhas ele incrementa 1;

            for (int j = 0; j < valores[i].length; j++) { // aqui ele pega atual e preenche cada coluna da linha atual

                System.out.printf("Digite o valor para a posicao (%d, %d): ", i, j);
                valores[i][j] = (int) scanner.nextDouble();

            }
        }
        int auxiliar = Integer.MAX_VALUE; // pegando o maior possoivel em java e armazenando aqui;
        for (int w = 0; w < valores.length; w++) {  // loop das linhas

            for (int k = 0; k < valores[w].length; k++) {  // loop das colunas pegando a linha atual por meio de [w]



                if (valores[w][k] < auxiliar)
                    auxiliar = valores[w][k];
                }
            }
        System.out.println("o menor valor digitado foi " +auxiliar);
        }

}


//-----------------------------------------METODOS EM JAVA---------------------------------------------
// metodos sao importantes para retulizar partes do codigo em tarefas fequentes, como fazer a validacao de um cpf
//imprimir determinado texto
//ordenar uma lista etc
class Metodos{

    public static void imprimirCabecalho(){
        System.out.println("--------IMPRIMINDO CABECALHO---------");
        System.out.println("----======------IFMG-------=======----");
        System.out.println("--------=====-----------=====---------\n");}

    public static void impirmirTexto(String texto){
        System.out.println(texto);
    }

    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);

        imprimirCabecalho();
        impirmirTexto("\nDigitando o texto a ser imprimido\n"); // ou seja, imprimir texto tem a mesma funcao de um sout
        imprimirCabecalho();

    }
}
//-0--------------------------------metodos com retorno--------------------------------
class MetodosComRetorno {

    public static int somar(int a, int b) { //como o metodo retrona um tipo de dado
        int aux = a + b;

        return aux;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resultado = somar(100, 132);
        System.out.println(resultado);


    }
}
    // metodo com retorno usando vetor

class vetorew {
    public static String transformarVetorEmTexto(int[] vetor) {
        String texto = "";

        for (int i = 0; i < vetor.length; i++) {
            texto = texto + vetor[i] + "";

        }
        return texto;
    }

    public static void main(String[] args) {
        int[] idades = {12, 22, 32, 44};

        String text = transformarVetorEmTexto(idades);
        System.out.println(text);
    }

    //parou no minuto `15 aula 25

}
class CacularDesconto {

    // metodo para dar desconto
    public static float calcDesconto(float vr, float desconto) {
        return vr - (vr * (desconto / 100));  // Also fixed the discount calculation
    }

    //    METODO PARA IMPRIMIR UM MENU COM OPCOES
    public static boolean menu() {
        System.out.println("menu");
        System.out.println("iniciar");
        System.out.println("excluir");
        System.out.println("listar");
        return false;
    }

    //    metodo para inverter numeros digitados num vetor
    public static void InverterVetor(int[] v) {

        int limite = v.length - 1;
        for (int i = 0; i < v.length / 2; i++) {

            int auxiliar = v[i];
            v[i] = v[limite - i];
            v[limite - i] = auxiliar;
        }
    }

    public static void main(String[] args) {


        float produtoValor = 2000f;
        float desconto = 10f;
        System.out.println("--------------------METODO DESCONTO-----------------------");
        System.out.println(calcDesconto(produtoValor, desconto));
        System.out.println("-------------------METODO MENU--------------------------");
        System.out.println(menu());
    }
}
class PassgemDeParametros {

            //crie uma funcao que receba o valor de um porudto e a porcentagem de descont
        public static float calcDesconto (float vr, float deconto){
            //como o desconto sera realizado
            return   vr - (vr * deconto/100);

        }

        public static void main(String[] args) {
                // valores a serem descontados e dsesconto de 10%
            float vr = 2000f;
            float desconto = 10f;
            System.out.println("-----------o valor do produto com deconto é----------------");
            System.out.println(calcDesconto(vr, desconto));

            System.out.println("-----------chamando menu--------------------------------");
            menu();

            System.out.println("-------------vetor de numeros-------------------------");
            int [] numeros = {33,332,212};
            inverterVetro(numeros);
        }

    public static void menu(){
        System.out.println("menu");
        System.out.println("incluir produto");
        System.out.println("excluir produto");
        System.out.println("listar produto");
        System.out.println("sair do programa");
    }
    public static void inverterVetro(int[] v){
            int limite = v.length-1;
        for (int i = 0; i < v.length/2; i++) {
            int aux = v[i];
            v[i] = v[limite-i];
            v[limite-i] = aux;

        }

    }

}

class NovaClass{
    public static void main(String[] args) {

        System.out.println("put a number");

    }
}

class NovaCl2ass{
    public static void main(String[] args) {

        System.out.println("put a number");

    }
}

