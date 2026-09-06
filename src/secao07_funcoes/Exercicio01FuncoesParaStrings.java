package secao07_funcoes;

/*
* Conhecendo e praticando algumas funções para Strings.
* toLowerCase() - Converte as letras da String para minúsculas.
* toUpperCase() - Converte as letras da String para maiúsculas.
* trim() - Remove os espaços em branco do início e final das String.
* substring(x) - Recorta uma parte de uma string e retorna esse pedaço como uma nova string,
*               sem modificar o texto original.
* replace(x) - Substitui caracteres ou sequências de textos (substrings) para outros dentro de uma String.
* indexOf() - Encontra a posição (índice)  da primeira ocorrência  de um caractere ou palavra  dentro de uma String.
* lastIndexOf() - Encontra a posição (índice) da ultima ocorrência.
* split() - Dividi uma String em várias partes, cortando-a sempre que encontrar um "separador" que você definir.
* length() - Conta quantos caracteres existem em uma String.
* contains() - Checar se um texto específico existe dentro da String e retorna 'true' se sim e 'false' se não.
* */
public class Exercicio01FuncoesParaStrings {

    public static void main(String[] args){

        String nome = "  WagNer ALmEiDA dE OlIvEIra ";
        String conversaoMinusculas = nome.toLowerCase();
        String conversaoMaiusculas = nome.toUpperCase();
        String removerEspacoBranco = nome.trim();
        String recortarTexto = nome.substring(9);
        String recortarTextoDoisParametros = nome.substring(9,16);
        String substituirCaractere = nome.replace('a','x');
        String substituirTexto = nome.replace("WagNer ALmEiDA dE OlIvEIra", "Wagner Oliveira");
        String[] dividirString = removerEspacoBranco.split(" ");
        int posicaoIndice = nome.indexOf('O');
        int posicaoIndiceUltimaPosicao = nome.lastIndexOf('a');
        int i = 0;
        boolean checaTexto = nome.contains("z");


        System.out.println("Nome: -"+nome+"-");
        System.out.println("Nome minúsculo: -"+conversaoMinusculas+"-");
        System.out.println("Nome maiúsculo: -"+conversaoMaiusculas+"-");
        System.out.println("Removido os espaços em branco do início e final da String: -"+removerEspacoBranco+"-");
        System.out.println("Recorte do texto: "+recortarTexto);
        System.out.println("Recorte do texto com 2 parametros: "+recortarTextoDoisParametros);
        System.out.println("Substitui caractere: "+substituirCaractere);
        System.out.println("Substitui texto: "+substituirTexto);
        System.out.println("A posição (índice) da primeira ocorrência da letra 'O' é : "+posicaoIndice);
        System.out.println("A posição da ultima ocorrência da letra 'a' é: "+posicaoIndiceUltimaPosicao);
        System.out.println("A quantidade de caracteres da String nome são: "+nome.length());

        while(i < dividirString.length){
            System.out.println("O conteúdo da posição "+i+" do vetor dividirString é: "+dividirString[i]);
            i++;
        }
        System.out.println("O caractere 'a' existe na String da variavel nome?: "+nome.contains("a"));
        System.out.println("O caractere 'z' existe na String da variavel nome?: "+checaTexto);

    }
}
