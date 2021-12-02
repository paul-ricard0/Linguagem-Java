package atividades.uni07.fatorial;

public class MainFatorial {
    
    static int fatIterativo(int n) {
        var f = 1;
        
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }

        return f;
    }

    static int fat(int n) {
        // caso base
        if (n == 1) {
            return 1;
        }

        // passo recursivo
        var f = n * fat(n-1); // empilhamento do problema menor

        System.out.println(String.format("Fat(%d) ->  %d x Fat(%d) = %d", n, n, n-1, f ));

        return f;
    }

    public static void main(String[] args) {
        
        int n = 8;

        // Fat(8) = 8 x Fat(7)
        // Fat(7) = 7 * Fat(6)

        int r = fat(n);

        System.out.println("Fat("+n+") = " + r);
    }
}