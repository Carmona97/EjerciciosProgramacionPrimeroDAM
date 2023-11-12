package ejercicio14;
/*Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 * muestre por pantalla.
 * Autor Juan Manuel Carmona Ruiz
 * Fecha 1/11/22*/
public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] secuencia=new int[55];
		for(int i=0;i<secuencia.length;i++) {
			if(i<1) {
				secuencia[i]=1;
			}else {
				if(i<3) {
					secuencia[i]=2;
				}else {
					if(i<6) {
						secuencia[i]=3;
					}else {
						if(i<10) {
							secuencia[i]=4;
						}else {
							if(i<15) {
								secuencia[i]=5;
							}else {
								if(i<21) {
									secuencia[i]=6;
								}else {
									if(i<28) {
										secuencia[i]=7;
									}else {
										if(i<36) {
											secuencia[i]=8;
										}else {
											if(i<45) {
												secuencia[i]=9;
											}else {
												if(i<55) {
													secuencia[i]=10;
												}												
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.print(secuencia[i]+" ");
		}		
	}

}
