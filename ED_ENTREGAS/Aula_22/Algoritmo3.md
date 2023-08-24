1 Esq = 1
2 Dir =  1
3 Enquanto Esq  <= Dir faça
4 Meio = (Esq + Dir) / 2
5 Se  A[Meio] == x      então
6 Devolve Meio
7 Senao se x>  A[meio]       então
8 Esq = meio + 1
9 Senao
10 Dir = meio + 1
11 Devolva -1


L1 = 1 
L2 = 1 
L3 = rx vezes 
L4 = rx vezes 
L5 = rx vezes 
L6 = 1 
L7 = rx vezes - 1 
L8 = rx vezes
L9 = rx vezes - 1 
L10 = rx vezes - 1 
L11 = 1

Primeira posição: 2t
Última posição: 4t(rx - 1) + t

T(n) = 2t + Trx + 4Trx + 2Trx + 2t(rx - 1) + 2t(rx - 1) + t=T(n) = 4Trx + 2trx^2 + 2t