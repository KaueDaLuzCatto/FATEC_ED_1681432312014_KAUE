Function BuscaLinerar(A,n,x){
1 i = 1
2	Enquanto   i <= n       faça
3		Se A[i]==  x     então
4			Devolva i
5		i = i + 1
6  Devolva-1

L1 = inicializa o índice i como 1
L2 = Enquanto i for menor ou igual a n
L3 = Se o elemento em A[i] for igual a x
L4 = Retorna o índice i onde x foi encontrado
L5 = Incrementa i para verificar o próximo elemento
L6 = Retorna -1 para indicar que x não foi encontrado

1ª posição = 2t
Última posição = 2t + 5t * n

T(n) = t+ T (n+1)  +3(t*n)+t+2(t*n) = T(n)=2t+tn+5t⋅n 

