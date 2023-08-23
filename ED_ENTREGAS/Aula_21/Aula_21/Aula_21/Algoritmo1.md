# Algoritmo 1 
1.      Function BuscaLinerar(K){
2.      i= 1 // 1 instrução
3.      for (i < n; i++){ // 2*n instrução
4.        se A[i] == k{  // 1 instrução
5.            devolve i // n instrução
6.        }
7.        }
8.            Devolve i //1 instrução
9.            }
# Contagem de instruções 
- A linha 1. custa 1 instrução; 
- A linha 2. custa 1 instrução; 
- A linha 3. custa 2*n instruções; 
- A linha 4. custa 1 instrução; 
- A linha 5. custa n instruçôes; 
- A linha 8. custa 1 instrução; 
## Total de instruções:
### 1+1+2*n+1+n+1 = f(n)=3n+4
