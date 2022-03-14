package provas.av1.exer;

import java.util.ArrayList;
import java.util.List;

public class Exer03 {
	
	private static List<Integer> index = new ArrayList<Integer>();
	private static List<String> nome = new ArrayList<String>();
	private static List<String> marca = new ArrayList<String>();
	private static List<String> data = new ArrayList<String>();
	private static List<Double> valor = new ArrayList<Double>();
	
	
	public static void main(String[] args) {
		
		index.add(1);
		index.add(2);
		index.add(3);
		nome.add("Paulo");
		nome.add("Ricardo");
		nome.add("Lima");
		marca.add("Adidas");
		marca.add("Nike");
		marca.add("Puma");
		data.add("07/08/2001");
		data.add("08/08/2001");
		data.add("09/08/2001");
		valor.add(200.00);
		valor.add(50.00);
		valor.add(100.00);
		
		double total=0;
		for(double c=index.size()-1; c >=0; c=-1) {
			
			var i = valor.indexOf(c);
			i++;
			double num = valor.get(i);
			System.out.println(num);
			total += num;
			
			
		}
		
		System.out.println("xx   :  "+total);
		
		
		
	}

}
