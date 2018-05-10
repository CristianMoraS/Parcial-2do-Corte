package ejercicios;

import java.io.*;

public class Decreasing {
	public static void main(String []args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,cont = 0, tam, cas, aux;
		cas = Integer.parseInt(br.readLine());
		
		for(i = 0; i < cas-1; i++) {//number cases
			tam = Integer.parseInt(br.readLine());
			int subIzq[] = new int[tam];
			int subDere[] = new int[tam];
			
			for(int j = 0; j < tam-1; j++) {//traverse the vector
				String arr[] = br.readLine().split(" ");
				subIzq[j] = Integer.parseInt(arr[0]);//insert the first element
				subDere[j] = Integer.parseInt(arr[j+1]);//insert the second ... n element;
				
				//order decreasingly
				for(int k = 0; k < tam-1; k++) {
					if(subIzq[k] < subIzq[k+1]) {
						aux = subIzq[k+1];
						subIzq[k+1] = subIzq[k] ;
						subIzq[k] = aux;
					}
					if(subDere[k] < subDere[k+1]) {
						aux = subDere[k+1];
						subDere[k+1] = subDere[k] ;
						subDere[k] = aux;
					}
				}	
				//compare if the number of the left sub-array is 
				//greater than the largest number of the right sub-array
				while(subIzq[j] > subDere[j+1]) {
						subIzq[j+1] = subDere[j];
						cont++;
				}
				//Print number of movements
				System.out.println(cont);
			}
		}
	}
}
