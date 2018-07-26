import java.util.Scanner;

public class AniMathMain {
	public static void main(String[] args) {
		boolean want;
		int num;
		System.out.println("Do want to convert a number?");
		Scanner keyboard = new Scanner(System.in);
		want = keyboard.nextBoolean();
		if(want == false) {
			System.out.print("Okay then");
		}
		if (want == true) {
			while (want == true) {
				System.out.println("What number do you want to convert?");
				Scanner keyboard2 = new Scanner(System.in);
				 num = keyboard2.nextInt();
				 
				int oldnum = 0;
				int placehold = (num/109);
				int remain = (num-(placehold*109));
				String result = (""+remain);
				if (remain == 9) {
					result = ("~");
				} 
				if (remain == 10) {
					result = ("a");
				}
				if (remain == 11) {
					result = ("b");
				}
				if (remain == 12) {
					result = ("c");
				}
				if (remain == 13) {
					result = ("d");
				}
				if (remain == 14) {
					result = ("e");
				}
				if (remain == 15) {
					result = ("f");
				}
				if (remain == 16) {
					result = ("g");
				}
				if (remain == 17) {
					result = ("h");
				}
				if (remain == 18) {
					result = ("i");
				}
				if (remain == 19) {
					result = ("j");
				}
				if (remain == 20) {
					result = ("k");
				}
				if (remain == 21) {
					result = ("l");
				}
				if (remain == 22) {
					result = ("m");
				}
				if (remain == 23) {
					result = ("n");
				}
				if (remain == 24) {
					result = ("o");
				}
				if (remain == 25) {
					result = ("p");
				}
				if (remain == 26) {
					result = ("q");
				}
				if (remain == 27) {
					result = ("r");
				}
				if (remain == 28) {
					result = ("s");
				}
				if (remain == 29) {
					result = ("t");
				}
				if (remain == 30) {
					result = ("u");
				}
				if (remain == 31) {
					result = ("v");
				}
				if (remain == 32) {
					result = ("w");
				}
				if (remain == 33) {
					result = ("x");
				}
				if (remain == 34) {
					result = ("y");
				}
				if (remain == 35) {
					result = ("z");
				}
				if (remain == 36) {
					result = ("A");
				}
				if (remain == 37) {
					result = ("B");
				}
				if (remain == 38) {
					result = ("C");
				}
				if (remain == 39) {
					result = ("D");
				}
				if (remain == 40) {
					result = ("E");
				}
				if (remain == 41) {
					result = ("F");
				}
				if (remain == 42) {
					result = ("G");
				}
				if (remain == 43) {
					result = ("H");
				}
				if (remain == 44) {
					result = ("I");
				}
				if (remain == 45) {
					result = ("J");
				}
				if (remain == 46) {
					result = ("K");
				}
				if (remain == 47) {
					result = ("L");
				}
				if (remain == 48) {
					result = ("M");
				}
				if (remain == 49) {
					result = ("N");
				}
				if (remain == 50) {
					result = ("O");
				}
				if (remain == 51) {
					result = ("P");
				}
				if (remain == 52) {
					result = ("Q");
				}
				if (remain == 53) {
					result = ("R");
				}
				if (remain == 54) {
					result = ("S");
				}
				if (remain == 55) {
					result = ("T");
				}
				if (remain == 56) {
					result = ("U");
				}
				if (remain == 57) {
					result = ("V");
				}
				if (remain == 58) {
					result = ("W");
				}
				if (remain == 59) {
					result = ("X");
				}
				if (remain == 60) {
					result = ("Y");
				}
				if (remain == 61) {
					result = ("Z");
				}
				if (remain == 62) {
					result = (".");
				}
				if (remain == 63) {
					result = ("-");
				}
				if (remain == 64) {
					result = (":");
				}
				if (remain == 65) {
					result = ("+");
				}
				if (remain == 66) {
					result = ("=");
				}
				if (remain == 67) {
					result = ("^");
				}
				if (remain == 68) {
					result = ("!");
				}
				if (remain == 69) {
					result = ("/");
				}
				if (remain == 70) {
					result = ("*");
				}
				if (remain == 71) {
					result = ("?");
				}
				if (remain == 72) {
					result = ("&");
				}
				if (remain == 73) {
					result = ("<");
				}
				if (remain == 74) {
					result = (">");
				}
				if (remain == 75) {
					result = ("(");
				}
				if (remain == 76) {
					result = (")");
				}
				if (remain == 77) {
					result = ("[");
				}
				if (remain == 78) {
					result = ("]");
				}
				if (remain == 79) {
					result = ("{");
				}
				if (remain == 80) {
					result = ("}");
				}
				if (remain == 81) {
					result = ("@");
				}
				if (remain == 82) {
					result = ("%");
				}
				if (remain == 83) {
					result = ("$");
				}
				if (remain == 84) {
					result = ("#");
				}
				if (remain == 85) {
					result = ("α");
				}
				if (remain == 86) {
					result = ("β");
				}
				if (remain == 87) {
					result = ("γ");
				}
				if (remain == 88) {
					result = ("δ");
				}
				if (remain == 89) {
					result = ("ε");
				}
				if (remain == 90) {
					result = ("ζ");
				}
				if (remain == 91) {
					result = ("η");
				}
				if (remain == 92) {
					result = ("θ");
				}
				if (remain == 93) {
					result = ("ι");
				}
				if (remain == 94) {
					result = ("κ");
				}
				if (remain == 95) {
					result = ("λ");
				}
				if (remain == 96) {
					result = ("μ");
				}
				if (remain == 97) {
					result = ("ν");
				}
				if (remain == 98) {
					result = ("ξ");
				}
				if (remain == 99) {
					result = ("ό");
				}
				if (remain == 100) {
					result = ("π");
				}
				if (remain == 101) {
					result = ("ρ");
				}
				if (remain == 102) {
					result = ("σ");
				}
				if (remain == 103) {
					result = ("τ");
				}
				if (remain == 104) {
					result = ("υ");
				}
				if (remain == 105) {
					result = ("φ");
				}
				if (remain == 106) {
					result = ("χ");
				}
				if (remain == 107) {
					result = ("ψ");
				}
				if (remain == 108) {
					result = ("ω");
				}
				
				
				while(placehold>1) {
					oldnum = placehold;
					placehold = (oldnum/109);
					remain = (oldnum - (placehold*109));
					result = (remain+""+result);
					if (remain == 9) {
						result = ("~"+result);
					} 
					if (remain == 10) {
						result = ("a"+ result);
					}
					if (remain == 11) {
						result = ("b"+result);
					}
					if (remain == 12) {
						result = ("c"+result);
					}
					if (remain == 13) {
						result = ("d"+result);
					}
					if (remain == 14) {
						result = ("e"+ result);
					}
					if (remain == 15) {
						result = ("f"+result);
					}
					if (remain == 16) {
						result = ("g"+result);
					}
					if (remain == 17) {
						result = ("h"+result);
					}
					if (remain == 18) {
						result = ("i"+result);
					}
					if (remain == 19) {
						result = ("j"+result);
					}
					if (remain == 20) {
						result = ("k"+result);
					}
					if (remain == 21) {
						result = ("l"+result);
					}
					if (remain == 22) {
						result = ("m"+result);
					}
					if (remain == 23) {
						result = ("n"+result);
					}
					if (remain == 24) {
						result = ("o"+result);
					}
					if (remain == 25) {
						result = ("p"+result);
					}
					if (remain == 26) {
						result = ("q"+result);
					}
					if (remain == 27) {
						result = ("r"+result);
					}
					if (remain == 28) {
						result = ("s"+result);
					}
					if (remain == 29) {
						result = ("t"+result);
					}
					if (remain == 30) {
						result = ("u"+result);
					}
					if (remain == 31) {
						result = ("v"+result);
					}
					if (remain == 32) {
						result = ("w"+result);
					}
					if (remain == 33) {
						result = ("x"+result);
					}
					if (remain == 34) {
						result = ("y"+result);
					}
					if (remain == 35) {
						result = ("z"+result);
					}
					if (remain == 36) {
						result = ("A"+result);
					}
					if (remain == 37) {
						result = ("B"+result);
					}
					if (remain == 38) {
						result = ("C"+result);
					}
					if (remain == 39) {
						result = ("D"+result);
					}
					if (remain == 40) {
						result = ("E"+result);
					}
					if (remain == 41) {
						result = ("F"+result);
					}
					if (remain == 42) {
						result = ("G"+result);
					}
					if (remain == 43) {
						result = ("H"+result);
					}
					if (remain == 44) {
						result = ("I"+result);
					}
					if (remain == 45) {
						result = ("J"+result);
					}
					if (remain == 46) {
						result = ("K"+result);
					}
					if (remain == 47) {
						result = ("L"+result);
					}
					if (remain == 48) {
						result = ("M"+result);
					}
					if (remain == 49) {
						result = ("N"+result);
					}
					if (remain == 50) {
						result = ("O"+result);
					}
					if (remain == 51) {
						result = ("P"+result);
					}
					if (remain == 52) {
						result = ("Q"+result);
					}
					if (remain == 53) {
						result = ("R"+result);
					}
					if (remain == 54) {
						result = ("S"+result);
					}
					if (remain == 55) {
						result = ("T"+result);
					}
					if (remain == 56) {
						result = ("U"+result);
					}
					if (remain == 57) {
						result = ("V"+result);
					}
					if (remain == 58) {
						result = ("W"+result);
					}
					if (remain == 59) {
						result = ("X"+result);
					}
					if (remain == 60) {
						result = ("Y"+result);
					}
					if (remain == 61) {
						result = ("Z"+result);
					}
					if (remain == 62) {
						result = ("."+result);
					}
					if (remain == 63) {
						result = ("-"+result);
					}
					if (remain == 64) {
						result = (":"+result);
					}
					if (remain == 65) {
						result = ("+"+result);
					}
					if (remain == 66) {
						result = ("="+result);
					}
					if (remain == 67) {
						result = ("^"+result);
					}
					if (remain == 68) {
						result = ("!"+result);
					}
					if (remain == 69) {
						result = ("/"+result);
					}
					if (remain == 70) {
						result = ("*"+result);
					}
					if (remain == 71) {
						result = ("?"+result);
					}
					if (remain == 72) {
						result = ("&"+result);
					}
					if (remain == 73) {
						result = ("<"+result);
					}
					if (remain == 74) {
						result = (">"+result);
					}
					if (remain == 75) {
						result = ("("+result);
					}
					if (remain == 76) {
						result = (")"+result);
					}
					if (remain == 77) {
						result = ("["+result);
					}
					if (remain == 78) {
						result = ("]"+result);
					}
					if (remain == 79) {
						result = ("{"+result);
					}
					if (remain == 80) {
						result = ("}"+result);
					}
					if (remain == 81) {
						result = ("@"+result);
					}
					if (remain == 82) {
						result = ("%"+result);
					}
					if (remain == 83) {
						result = ("$"+result);
					}
					if (remain == 84) {
						result = ("#"+result);
					}
					if (remain == 85) {
						result = ("α"+result);
					}
					if (remain == 86) {
						result = ("β"+result);
					}
					if (remain == 87) {
						result = ("γ"+result);
					}
					if (remain == 88) {
						result = ("δ"+result);
					}
					if (remain == 89) {
						result = ("ε"+result);
					}
					if (remain == 90) {
						result = ("ζ"+result);
					}
					if (remain == 91) {
						result = ("η"+result);
					}
					if (remain == 92) {
						result = ("θ"+result);
					}
					if (remain == 93) {
						result = ("ι"+result);
					}
					if (remain == 94) {
						result = ("κ"+result);
					}
					if (remain == 95) {
						result = ("λ"+result);
					}
					if (remain == 96) {
						result = ("μ"+result);
					}
					if (remain == 97) {
						result = ("ν"+result);
					}
					if (remain == 98) {
						result = ("ξ"+result);
					}
					if (remain == 99) {
						result = ("ό"+result);
					}
					if (remain == 100) {
						result = ("π"+result);
					}
					if (remain == 101) {
						result = ("ρ"+result);
					}
					if (remain == 102) {
						result = ("σ"+result);
					}
					if (remain == 103) {
						result = ("τ"+result);
					}
					if (remain == 104) {
						result = ("υ"+result);
					}
					if (remain == 105) {
						result = ("φ"+result);
					}
					if (remain == 106) {
						result = ("χ"+result);
					}
					if (remain == 107) {
						result = ("ψ"+result);
					}
					if (remain == 108) {
						result = ("ω"+result);
					}
				}
				if(placehold == 0) {
					System.out.println(""+result);
				}else {
					System.out.println("1"+""+result);
				}
				System.out.println("Do you want to covert a number?");
				Scanner keyboard1 = new Scanner(System.in);
				want = keyboard1.nextBoolean();
				
			}
		}
	}
}
