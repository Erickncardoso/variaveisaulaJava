public class Main {
    public static void main(String[] args) {

        //trabalhando com Variáveis
        // Repositorio: local memoria com conteudo e endereco
        // Variavel e a ate de criar um espaco em memoria para armazenar um dado

        var nome = "Joaquim José ";

        // podemos criar variaveis de varias formas, trabaljando com o tipo explicitos:

        // Trabalhando com tipos Explicitos
        int idade = 50;
        String diaSemana = "Quarta-feira";
         // Com interferencia automatica de tipos - iniciamos com var
        //so e possivel a partir do java 11
        var umTexto = "um texto";
        var kilometragem = 45;
        var altura = 1.85f;
        var tamanhoDoCristoRedendtor = 90.5;

        //Tipos primitivos de dados
        byte numByte= 10;
        short numShort = 1000;
        int numInt = 10000;
        long numLong = 100000;
        float decFloat = 10.987655f; // usar o f no final
        double decDouble = 20.3287379387363; //Uso do d é opcional
        boolean verdFalso = true; // true / false
        char caractere = 'a';

        //Como as variaves funcionam?
        //Variaveis sao mutáveis!!!
        var nomeB ="Maria Joaquina da Silva";

        System.out.println(nomeB);

        nomeB = "Maria das Couves";
        System.out.println(nomeB);

        //criando variaves FINAIS - Nao podem ser modificadas
        final int anoIndependencia = 1922;

        //anoIndependencia = 1923; //Nao pode ser mpodificada

        //Alternativas papa "modificar" uma final
        int novoAno = 1823;
        System.out.println(novoAno);

        //trabalhando com valores nulos
        String numerDocumento = null;
        System.out.println(numerDocumento);


        //Coding Style - Java - CamelCase
        String primeiroNome = "Antonio";

        //Variaveis: lowerCamelCase
        //Funçoes/metodos: lowerCamelCase
        //Lasses e Afins: UpperCamelCase
        //Elementos de um ENUM:NOME_DO_ELEMENTO - UPPERCASED_PASCAL_CASE

        //Geralmente codamos da mesma forma com que uma linguagem

        //Uma breve introdução aos wrappers
        Integer numwroInteiro = 10;
        Float numeroDecimal = 1.888f;



    }
}