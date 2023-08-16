# Algoritmo 3 
1.      function BuscaBinaria(x){
2.      esq =1 //1
3.      dir =n //1
4.      enquanto esq <= dir faca{ //n
5.        meio = (( esq +dir ) /2) //1
6.        se A[ meio ] == x entao //1
7.            devolve meio 
8.        senao se x > A[ meio ] entao //1 
9.            esq = meio + 1 
10.        senao //1
11.            dir = meio -1 //n 
12.    }
13.    devolve -1 //1
14. }

# Contagem de instruções 
- A linha 2. custa 1 instrução; 
- A linha 3. custa 1 instrução; 
- A linha 4. custa n instruções; 
- A linha 5. custa 1 instrução;
- A linha 8. custa 1 instrução;
- A linha 10. custa 1 instrução;
- A linha 8. custa n instruçôes;
- A linha 13. custa 1 instrução;  

## Total de instruções:
### 1+1+n+1+1+1+n+1 = f(n)=2n+6