import java.util.Locale;
import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double salario_base = 0, salario_final = 0, aumento = 0;
	    int porcentagem = 0;
	    
	    salario_base = sc.nextDouble();
		
		if(salario_base<=400.00){
	        porcentagem = 15;
	        aumento = salario_base*0.15;
	        salario_final = salario_base + aumento;}
	    else
	        if((salario_base>400.00) && (salario_base<=800.00)){
	            porcentagem = 12;
	            aumento = salario_base*0.12;
	            salario_final = salario_base + aumento;}
	        else
	            if((salario_base>800.00) && (salario_base<=1200.00)){
	                porcentagem = 10;
	                aumento = salario_base*0.10;
	                salario_final = salario_base + aumento;}
	            else
	                if((salario_base>1200.00) && (salario_base<=2000.00)){
	                    porcentagem = 7;
	                    aumento = salario_base*0.07;
	                    salario_final = salario_base + aumento;}
	                else
	                    if(salario_base>2000.00){
	                    porcentagem = 4;
	                    aumento = salario_base*0.04;
	                    salario_final = salario_base + aumento;}

	    System.out.printf("Novo salario: %.2f\n", salario_final);
	    System.out.printf("Reajuste ganho: %.2f\n", aumento);
	    System.out.printf("Em percentual: %d %%\n", porcentagem);
		
		
		sc.close();

	}

}