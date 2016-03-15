public class Palindromo{
    public static void main(String[]args){
//Criando uma string, que irá ser passada como parâmetro.         
String texto = args[0] ;
        String testar;
        boolean  bool=true;
//tamanhoPalindromo éo tamanho da palavra.
int tamanhoPalindromo= 5;
int tamanho;
//tamanho irá receber texto.length, ou seja,"mostrará" o numero de caracteres(letras) dentro da String. 
  tamanho= texto.length();
//A finalidade da linha de código abaixo, é ver qual a quantidade de testes que o programa irá fazer. Pegaremos como exemplo a palvra ARARA, o programa irá realizar apenas 1 tese, isso porque a palavra possui 5 letras, então ele irá analisar a primeira e a última e enconrará um palíndromo. Caso a palavra fosse BATATA (6letras) o número de teste seria igual a 2, irá analisar a primeira letra com a penúltima e assim sucessivamente.
int qtdteste= tamanho - tamanhoPalindromo;
for (int i=0;i<=qtdteste;i++){
testar= texto.substring(i,i+tamanhoPalindromo);
//StringBuffer: A classe StringBuffer cria e manipula informações em Strings dinâmicos, ou seja, Strings que podem ser modificados.
 StringBuffer textor = new StringBuffer(testar);
            textor.reverse();
			String reverso = textor.toString();
         if(testar.equals(reverso)){
                System.out.println("Palindromo: " + testar);
				System.out.println("Posição: " + (i+1) + "-" + (i+tamanhoPalindromo));
                bool=false;
            }
        }
        if(bool==true){
            System.out.println("Nenhum Palindromo.");
        }
    }
}
