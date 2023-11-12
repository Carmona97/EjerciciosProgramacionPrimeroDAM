package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);
	System.out.println("Introduce dos valores:");
	int num1=scn.nextInt();
	int num2=scn.nextInt();
	int suma=num1+num2;
	int resta=num1-num2;
	int multip=num1*num2;
	int div=num1/num2;
	System.out.println("Indique la operación que desea realizar (inserte número)\n(1) Suma\n(2) Resta\n(3) Multiplicación\n(4) División: ");
	int oper=scn.nextInt();
	switch(oper) {
		case 1:
			{System.out.println("Resultado: "+suma);
		break;
			}
		case 2:
			{System.out.println("Resultado: "+resta);
		break;
			}
		case 3:
			{System.out.println("Resultado: "+multip);
			break;
			}
		case 4:
			{System.out.println("Resultado: "+div);
			break;
			}
		default:
			{
			System.out.println("No existe esa función");
			break;
			}
		}
	}

}
