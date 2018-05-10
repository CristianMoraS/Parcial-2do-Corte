package ejercicios;

import java.io.*;
public class Army_parade {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = br.read();
		int m = br.read();
		int k = br.read();
		int arr[][]=new int[k][2];
		
		for(int i=0;i<k;i++) {
			arr[i][0] = br.read();
			arr[i][1] = br.read();
		}
		
		int maximum;
		if(m < n) {
			maximum = n;
		}else {
			maximum = m;
		}
		long modul=(long)(2*Math.pow(10,9)+33);
		
		long dif = (n*m-k)%modul;
		long ans = (maximum*dif)%modul;
		System.out.println(ans);
	}
}
