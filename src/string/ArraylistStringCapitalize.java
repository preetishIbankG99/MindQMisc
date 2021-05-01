package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraylistStringCapitalize {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>(Arrays.asList("colette Sapienza",
		        "gretta Beumer", "EMManuel Mossman", "Colette Sapienza"));
		for (int index = 0; index < al.size(); index++) {
		    String name = al.get(index);
		    String[] names = name.split("\\s+");
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < names.length; i++) {
		        if (i != 0) {
		            sb.append(' ');
		        }
		        sb.append(Character.toUpperCase(names[i].charAt(0)));
		        sb.append(names[i].substring(1).toLowerCase());
		    }
		    al.set(index, sb.toString());
		}
		System.out.println(al);
	}

}
