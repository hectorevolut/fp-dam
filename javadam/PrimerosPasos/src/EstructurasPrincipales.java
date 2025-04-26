
public class EstructurasPrincipales {

	public static void main(String[] args) {
		/*Tipos de datos Ennteros:
		 * 	int - 4 bytes.
		 * 	short - 2 bytes.
		 * 	long - 8 bytes.(Sufijo L).
		 * 	byte - 1 byte.
		 *Tipos Coma Flotante
		 *	float - 4 bytes. (sufijo F). 6 o 7 cifras decimales.
		 *	double - 8 bytes. 15 cifras decimales.
		 *Tipo Caracter. ' '.
		 *	char - Espacio en memoria no significativo. ' '.
		 *Tipo boolean
		 *	2 únicos valores - true / false.
		 *
		 *Variables - Espacio en la memoria del ordenador donde almacenamos un valor que podrá
		 *	cambiar durante la ejecución del programa.
		 *	- Crear o declarar: tipo_dato nombre; 
		 *	- Inicializar (almacenar unn valor): variable = valor; tipo varaible = valor;
		 *		Java es estático - El tipo declarado no va a poder cambiar.
		 *		Java es fuertemente tipado - No se permiten operaciones entre tipos diferentes.
		 *			Para poder operar habrá que hacer conversiones explícitas.
		 *		Java no permite utilizar variables no inicializadas.
		 *		Java es case sensitive (influyen mayúsculas y minúsculas).
		 *
		 *Inferencia de tipos: var variable = valor; 
		 *	Deducir automáticamente el tipo de una variable.
		 *	El compilador analiza el valor y le asigna el tipo más adecuado.
		 *	Utiliza los tipos comodines (int, double).
		 *	La variable no podrá cambiar su tipo durante la ejecución del programa.
		 *	Es obligatorio declarar e inicializar en la misma línea.
		 *		El compilador tiene que saber al tipo para realizar la inferencia.
		 *	Se puede usar en:
		 *		- Variables locales dentro de métodos.
		 *		- En bucles for-each for.
		 *		- En try-with resources.
		 *	No se puede usar:
		 *		- Parámetros de métodos.
		 *		- Variables de clase o atributos de instancia.
		 *		- Tipos genéricos.
		 * */
		
		//Estructuras principales III - Vídeo 6
		byte edad; //Creo la variable
		edad = 17; //Inicializo la variable
		byte mes = 1; //Declaro e inicializo en la misma línea.
		System.out.println(edad); //Imprimo por pantalla la variable
		System.out.println(mes);
		
		var bolsas = 15; //Inferencia de tipo declarando por obligación en la misma línea.
		bolsas = 35; //Cambio el valor de la variable.
		System.out.println(bolsas);
		
		//Operadores en Java - Vídeo 7
		/*Operadores:
		 * - Aritméticos: + suma, - resta, * multiplicación, / división, % módulo (0 si la división es exacta).
		 * - Lógicos, relacionales y booleanos: >= mayor o igual que, <= menor o igual que, > mayor que, < menor que, 
		 * 		!= distinto que, == igual que (Solo para comparar valores, no objetos), && y lógico, || o lógico.
		 * - Incremento y decremento: ++ incremeto, -- decremento, += número incremento, -= número decremento.
		 * - Concatenación (textos, textos y números): +.
		 * - bit a bit (Bitwise): & and bit a bit, | or bit a bit, ^ xor bit a bit, ~ complemento bit a bit, 
		 * 		<< desplazamiento izquierda, >> desplazamiento derecha, >>> desplazamiento derecha sin signo, 
		 * - Operador ternario: ? condicionales.
		 * - Asignación compuesta: *= multiplica y asigna, /= divide y asigna, %= módulo y asigna.*/
		
		edad++; //Incrementamos en 1 la variable.
		edad--; //Decrementamos 1 la variable.
		edad+=10; //Incremente la variable en 10 - Equivalente a edad=edad+10;
		double num1 = 7; //Si vamos a manejar decimales mejor trabajar con float y double.
		double num2 = 3;
		System.out.println(num1%num2);
		/*Si dividimos dos int, antes de almacenar la división la evalúa, y al ser enteror, realiza una división
		entera y lo almacena. Fuerzas a decimal después. Para que haga una división con decimales, al menos uno de 
		los dos operandos tiene que ser de coma flotante.*/
		double resultado;
		resultado=num1/num2;
		System.out.println(resultado);
		int num3=3;
		int num4=2;
		resultado=num3/num4;
		System.out.println(resultado);
		String nombre="Juan tiene ";
		System.out.println(nombre + resultado);
		
		//Declaración múltiple y constantes - Vídeo 8
		int intVar1, intVar2, intVar3; //Declaraciónn múltiple de variables.
		intVar1=7;
		intVar2=4;
		intVar3=intVar1+intVar2;
		int intVar4=7, intVar5=8; //Declaración e inicialización simultánea.
		int a, b=3; //Solo se ha inicializado b.
		int c, d, f;
		c=d=f=5; //Innicializamos variables que van a tener el mismo valor.
		//Declaración de constantes - Espacio en la memoria del ordenador que no varía en la ejecución.
			/*Las constantes de clase se tienen que declarar y definir en la misma línea.*/
		final float pi=3.14159F;
		final float e;
		e=3.2343F; //Al no ser de clase se puede inicializar en otra línea.
		//El nombre de las constantes de clase deberían in en mayúsculas.
		//Errores en tiempo de compilación - No deja ejecutar.
		System.out.println(pi*e);
		/*Cuando realizamos operaciones con tipos menores que int (byte, short), converte los operadores a int 
			(conversión implícita) por eficiencia en el procesador (trabaja con 32, 64 bits), manejar posibles 
			desvordamientos (seguridad y consistencia)*/
		byte numero1=30;
		byte numero2=20;
		/*byte res=numero1 + numero2; - Error de compilación Type mismatch. - Hay que hacer un casting (conversión
		explícita */
		byte result = (byte) (numero1 + numero2);
		//Coprobar de qué tipo es una variable:
		System.out.println(((Object)(numero1+numero2)).getClass().getSimpleName());
		/*A tener en cuenta:
		 * 	-Si una operación involucra un tipo menor a int (byte, short, char), se promueve a int antes de 
		 * 		realizar la operación.
		 *  -Si una operación involucra un int y un long, el resultado es long.
		 *  -Si involucra un float, el resultado es float.
		 *  -Si involucfa un double, el resultado es double.*/
		
		
	}

}
