public class Palindromo {
    public static boolean isPalindromo(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        String palavra = "ana";
        System.out.println(isPalindromo(palavra) ? "É um palíndromo" : "Não é um palíndromo");
    }
}