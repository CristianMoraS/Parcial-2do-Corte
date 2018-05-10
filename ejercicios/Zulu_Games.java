package ejercicios;

import java.io.*;

public class Zulu_Games {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int input,suma;
			input = br.read();
			String arr1[] = br.readLine().split(" ");
			String arr2[] = br.readLine().split(" ");
			int ar1[] = new int[input];
			int ar2[] = new int[input];
			for(int i = 0; i < input; i++) {
				ar1[i] = Integer.parseInt(arr1[i]);
				ar2[i] = Integer.parseInt(arr2[i]);
				if(ar1[i] < ar2[i]) {
					if(ar2[i+1] > ar1[i]) {
						suma = ar2[i] + ar2[i];
						System.out.println(suma);
					}else {
						System.out.println("Todos los casos se cruzan");
					}
				}
				
			}
			
		}catch (Exception e) {
			
		}
	}	
}
