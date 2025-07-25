int matriz[][] = {
	 {1, 2, 3, 4},
	 {5, 6, 7, 8},
	 {9, 10, 11, 12} };

System.out.print("Elemento da linha 0 e coluna 2: " + matriz[0][2]);
//a primeira parte da matriz [0] é a linha e a segunda parte [2] é a coluna!
// o .length irá ajudar ao definir tamanho da tabela

//-----------------------------------------------------------------------------------------------------------------------------------

int valores[][] = { 
	{ 12, 88, 64, 67 },
	{ 10, 19, 66, 77 },
	{ 25, 17, 15, 21 },
	{ 30, 25, 99, 45 },
	{ 45, 55, 20, 88 } };


//Para acessar a matriz, é nescessário 2 laços for, sendo um para percorrer as linhas e o outro as colunas!
for (int i = 0; i < valores.length; i++)
	for (int j = 0; j < valores[0].length; j++)
 		System.out.println("Linha " + i + ", Coluna " + j + ": " + valores[i][j]);

//-----------------------------------------------------------------------------------------------------------------------------------

//assim se organiza melhor a visualização da matriz
int valores[][] = { 
	{ 12, 88, 64, 67 },
	{ 10, 19, 66, 77 },
	{ 25, 17, 15, 21 },
	{ 30, 25, 99, 45 },
	{ 45, 55, 20, 88 } };

for (int i = 0; i < valores.length; i++) {
	for (int j = 0; j < valores[0].length; j++)
		System.out.print(valores[i][j] + " ");
		System.out.print("\n");
}

//-----------------------------------------------------------------------------------------------------------------------------------

//Exibindo os números que forem maiores que o número informado pelo usuário
Scanner teclado = new Scanner(System.in);
int valores[][] = { 
	{ 12, 88, 64 },
	{ 10, 19, 66 },
	{ 25, 17, 15 },
	{ 30, 25, 99 },
	{ 45, 55, 20 } };

int filtro;
System.out.print("Escolha um número para o filtro: ");
filtro = teclado.nextInt();

for(int i = 0; i < valores.length; i++ )
	for(int j = 0; j < valores[0].length; j++ )
		if( valores[i][j] > filtro )
			System.out.println("Número acima do valor informado: " + valores[i][j]);

teclado.close();

//-----------------------------------------------------------------------------------------------------------------------------------
//Alterar elemento informado pelo usuário na matriz
Scanner teclado = new Scanner(System.in);
int valores[][] = { 
	{ 12, 88, 64 },
	{ 10, 19, 66 },
	{ 25, 17, 15 },
	{ 30, 25, 99 },
	{ 45, 55, 20 } };
int linha, coluna, valor;

System.out.println("\nMatriz:");
for (int i = 0; i < valores.length; i++) {
	for (int j = 0; j < valores[0].length; j++)
		System.out.print(valores[i][j] + " ");
		System.out.print("\n");
}

System.out.print("\nInforme a linha do elemento que deseja alterar: ");
linha = teclado.nextInt();

System.out.print("\nInforme a coluna do elemento que deseja alterar: ");
coluna = teclado.nextInt();

System.out.print("\nInforme o novo valor: ");
valor = teclado.nextInt();

if( ((linha >= 0) && (linha < valores.length)) && ((coluna >= 0) && (coluna < valores[0].length)) ) {
	valores[linha][coluna] = valor;

	System.out.println("\nMatriz após a alteração:");
	for (int i = 0; i < valores.length; i++) {
		for (int j = 0; j < valores[0].length; j++)
		System.out.print(valores[i][j] + " ");
		System.out.print("\n");
	}
}else{
	System.out.println("Os valores de linha e/ou coluna informados são inválidos.");
}

teclado.close();

//-----------------------------------------------------------------------------------------------------------------------------------

//Alterando o número do item na matriz sem que o usuário informe a linha e coluna
Scanner teclado = new Scanner(System.in);

int valores[][] = { 
	{ 12, 88, 64 },
	{ 10, 19, 66 },
	{ 25, 17, 15 },
	{ 30, 25, 99 },
	{ 45, 55, 20 } };

int valorAlterado, novoValor;
boolean valorEncontrado = false;

System.out.println("\nMatriz:");
for (int i = 0; i < valores.length; i++) {
	for (int j = 0; j < valores[0].length; j++)
		System.out.print(valores[i][j] + " ");
		System.out.print("\n");
}

System.out.print("\nInforme o valor da matriz que deseja alterar: ");
valorAlterado = teclado.nextInt();

System.out.print("\nInforme o novo valor: ");
novoValor = teclado.nextInt();

for (int i = 0; i < valores.length; i++) {
	for (int j = 0; j < valores[0].length; j++)
		if( valores[i][j] == valorAlterado ) {
			valorEncontrado = true;
			valores[i][j] = novoValor;
		}
}

if( valorEncontrado ) {
	System.out.println("\nMatriz após a alteração:");
	for (int i = 0; i < valores.length; i++) {
		for (int j = 0; j < valores[0].length; j++)
			System.out.print(valores[i][j] + " ");
			System.out.print("\n");
	}
}else {
	System.out.println("O valor a ser alterado que foi informado não existe na matriz.");
}

teclado.close();

//-----------------------------------------------------------------------------------------------------------------------------------

//Criar matriz e atribuir valor depois

int matrizInteiros[][] = new int[10][10];
double matrizReais[][] = new double[4][5];
boolean matrizBool[][] = new boolean[5][7];
String matrizTexto[][] = new String[7][8];

//-----------------------------------------------------------------------------------------------------------------------------------

//atribuindo valores
int matrizInteiro[][] = new int[3][3];
	matrizInteiro[0][0] = 1;
	matrizInteiro[0][1] = 2;
	matrizInteiro[0][2] = 3;
	matrizInteiro[1][0] = 4;
	matrizInteiro[1][1] = 5;
	matrizInteiro[1][2] = 6;
	matrizInteiro[2][0] = 7;
	matrizInteiro[2][1] = 8;
	matrizInteiro[2][2] = 9;