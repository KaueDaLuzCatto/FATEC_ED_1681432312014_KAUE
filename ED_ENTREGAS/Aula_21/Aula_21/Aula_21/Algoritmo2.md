# Algoritmo 2 
1.      Function BuscaLinerarEmOrdem(K){
2.      i=1 
3.      enquanto i <= n e K >=A[i] {
4.       se A[i]==k entao 
5.           devolve i
6.       i = i + 1 
7.       }
8.      devolve -1
9.      }


# Contagem de instruções 
- A linha 2. custa 1 instrução; 
- A linha 3. custa 2n instruções; 
- A linha 4. custa 3n instruções; 
- A linha 5. custa 1 instrução;
- A linha 6. custa n instruções;
- A linha 8. custa 1 instrução;

## Total de instruções:
### 1+2n+3n+1+n+1 = f(n)=6n+3