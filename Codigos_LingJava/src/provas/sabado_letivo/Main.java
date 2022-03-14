package provas.sabado_letivo;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int total = 0, cA = 0, cB = 0, cC = 0, cD = 0, cE = 0, cF = 0, cG = 0, cH = 0, cI = 0, cJ = 0, cK = 0, cL = 0, cM = 0, cN = 0, cO = 0, cP = 0, cQ = 0, cR = 0, cS = 0, cT = 0, cU = 0, cV = 0, cW = 0, cX = 0, cY = 0, cZ = 0, naoABC = 0;
		String letra = "";

		String frase = Tools.inputString("Escreva uma Frase: ");

		
		for(int c = 0; c < frase.length(); c++) {
		
			String carac = "" + frase.toLowerCase().charAt(c);

			switch(carac){
				
				case "a":
					cA ++;
					break;
				case "b":
					cB++;
					break;
				case "c":
					cC++;
					break;
				case "d":
					cD++;
					break;
				case "e":
					cE++;
					break;
				case "f":
					cF++;
					break;
				case "g":
					cG++;
					break;
				case "h":
					cH++;
					break;
				case "i":
					cI++;
					break;
				case "j":
					cJ++;
					break;					
				case "k":
					cK++;
					break;
				case "l":
					cL++;
					break;
				case "m":
					cM++;
					break;
				case "n":
					cN++;
					break;
				case "o":
					cO++;
					break;					
				case "p":
					cP++;
					break;
				case "q":
					cQ++;
					break;
				case "r":
					cR++;
					break;
				case "s":
					cS++;
					break;
				case "t":
					cT++;
					break;					
				case "u":
					cU++;
					break;
				case "v":
					cV++;
					break;
				case "w":
					cW++;
					break;
				case "x":
					cX++;
					break;
				case "y":
					cY++;
					break;	
				case "z":
					cZ++;
					break;
				default:
					naoABC ++;
			}
		}
		
		
		
		
		if(cA > total) {
			total = cA;
			letra = "A";
		}
		if(cB > total) {
			total = cB;
			letra = "B";
		}
		if(cC > total) {
			total = cC;
			letra = "C";
		}
		if(cD > total) {
			total = cD;
			letra = "D";
		}
		if(cE > total) {
			total = cE;
			letra = "E";
		}
		if(cF > total) {
			total = cF;
			letra = "F";
		}
		if(cG > total) {
			total = cG;
			letra = "G";
		}
		if(cH > total) {
			total = cH;
			letra = "H";
		}
		if(cI > total) {
			total = cI;
			letra = "I";
		}
		if(cJ > total) {
			total = cJ;
			letra = "J";
		}
		if(cK > total) {
			total = cK;
			letra = "K";
		}
		if(cL > total) {
			total = cL;
			letra = "L";
		}
		if(cM > total) {
			total = cM;
			letra = "M";
		}
		if(cN > total) {
			total = cN;
			letra = "N";
		}
		if(cO > total) {
			total = cO;
			letra = "O";
		}
		if(cP > total) {
			total = cP;
			letra = "P";
		}
		if(cQ > total) {
			total = cQ;
			letra = "Q";
		}
		if(cR > total) {
			total = cR;
			letra = "R";
		}
		if(cS > total) {
			total = cS;
			letra = "S";
		}
		if(cT > total) {
			total = cT;
			letra = "T";
		}
		if(cU > total) {
			total = cU;
			letra = "U";
		}
		if(cV > total) {
			total = cV;
			letra = "V";
		}
		if(cW > total) {
			total = cW;
			letra = "W";
		}
		if(cX > total) {
			total = cX;
			letra = "X";
		}
		if(cY > total) {
			total = cY;
			letra = "Y";
		}
		if(cZ > total) {
			total = cZ;
			letra = "Z";
		}


		
		JOptionPane.showMessageDialog(null, "A frase que vc digito foi: " + frase);		
		
		JOptionPane.showMessageDialog(null, "A" + ": " + cA + "\nB" + ": " + cB 
				+ "\nC" + ": " + cC 
				+ "\nD" + ": " + cD 
				+ "\nE" + ": " + cE 
				+ "\nF" + ": " + cF 
				+ "\nG" + ": " + cG 
				+ "\nH" + ": " + cH
				+ "\nI" + ": " + cI
				+ "\nJ" + ": " + cJ
				+ "\nK" + ": " + cK
				+ "\nL" + ": " + cL
				+ "\nM" + ": " + cM
				+ "\nN" + ": " + cN
				+ "\nO" + ": " + cO
				+ "\nP" + ": " + cP
				+ "\nQ" + ": " + cQ
				+ "\nR" + ": " + cR
				+ "\nS" + ": " + cS
				+ "\nT" + ": " + cT
				+ "\nU" + ": " + cU
				+ "\nV" + ": " + cV
				+ "\nW" + ": " + cW
				+ "\nX" + ": " + cX
				+ "\nY" + ": " + cY
				+ "\nZ" + ": " + cZ);

		JOptionPane.showMessageDialog(null, "que maios repetiu foi "+ letra +" com o total de " + total);
		
		
		
		
		
	}

}
