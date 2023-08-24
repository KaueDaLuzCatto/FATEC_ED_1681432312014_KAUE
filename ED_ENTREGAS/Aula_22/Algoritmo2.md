Function BuscaLinerarEmOrdem(A,n,x)
1 i=1
2 enquanto   i <= n e x  >=  A[i]      faça
3    SeA[i]== x       então
4      Devolva i
5    i =   i  +  1
6 Devolva -1

L1 = 1 vez
L2 = Px vezes 
L3 = Px vezes 
L4 = 1 
L5 = Px vezes - 1
L6 = 1 


1ª posição: 8t
Última posição: 8tn

T(n) = t + 4tPx + 2tPx + 2t (Px - 1) + t = 8tPx

