package control;

import java.util.Scanner;
import java.io.*;

public class TorneioTenis {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	    
	int wins = 0;
	char resp;
	
	for (int i=0; i<6; i++) {
	    resp = in.next().charAt(0);
	    if(resp == 'V')
		wins++;
	}
	
	if (wins == 0)
	    System.out.println(-1);
	else if(wins <= 2)
	    System.out.println(3);
	else if(wins <= 4)
	    System.out.println(2);
	else
	    System.out.println(1);

	}
	    
 }

