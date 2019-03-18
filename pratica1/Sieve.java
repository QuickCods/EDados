public class Sieve {

    // Procedimento para usar o algoritmo do Crivo de Eratóstenes

    public static void sieve(int n, boolean prime[]) {
        for(int k = 0; k <= n; k++){
            prime[k] = true;
        }
        for(int i = 2; i < n; i++){
            if(prime[i]){
                for(int j = 2; i*j <= n; j++){
                    prime[i*j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {

    int n=100000; // Limite dos números

    // Cria um array de inteiros com tamanho n+1
    // (arrays começam na posição 0)
    boolean[] prime = new boolean[n+1];

    // Chama o procedimento sieve para números até 'n' no array 'prime'
    sieve(n, prime);

    // Escreve todos os números marcados a 'true' no array 'prime'
    for (int i=2; i<=n; i++)
        if (prime[i])
        System.out.println(i);
    }
}