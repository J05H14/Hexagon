package application;

import java.io.*;
import java.util.*;

import javax.swing.JFileChooser;


public class HexagonBoardMaker {

	static ArrayList<Hexagon> hexagonBoard = new ArrayList<Hexagon>();
	//static ArrayList<Hexagon> fullBoard = new ArrayList<Hexagon>();
	static ArrayList<Hexagon> hexs = new ArrayList<Hexagon>();
	static File hexFile = null;

//	public static void main(String[] args) {
//		solve(hexagonBoard);
//
//		for(int i = 0; i < fullBoard.size(); i++){
//			System.out.println(fullBoard.get(i));
//		}
//		System.out.println(hexagonBoard.size());
//	}
	

	public static void makeHexagons(){
		JFileChooser fc = new JFileChooser();
		int retVal = fc.showOpenDialog(null);


		if (retVal == JFileChooser.APPROVE_OPTION) {
			hexFile = fc.getSelectedFile();
		}

		try{
			Scanner hexScan = new Scanner(hexFile);

			while(hexScan.hasNext()){

				String hexagon = hexScan.nextLine();
				Hexagon hex = new Hexagon(hexagon);
				hexs.add(hex);
			}
			hexScan.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}

	}
	public static void solve(ArrayList<Hexagon> hexBoard){
		makeHexagons();
		solve(hexBoard, hexs);
	}
	
	//recurssion method
	public static void solve(ArrayList<Hexagon> hexagons, ArrayList<Hexagon> leftover){
		//System.out.println("Number of Hexagons on Board: " + hexagons.size());
		//System.out.println("Leftover size: " + leftover.size());
		//base case
		if(hexagons.size() == 7){
			System.out.println("DONE");
			Main.drawBoard(hexagons);
			
		}
		//recurssive case
		else{
			for(int numHex = 0; numHex < leftover.size(); numHex++){
				
				Hexagon newHex = leftover.get(numHex);
				for(int numRot = 0; numRot < 6; numRot++){
					if(areMatching(hexagons, newHex)){
						ArrayList<Hexagon> newLeftOvers = new ArrayList<Hexagon>(leftover); //make deep copy of leftover
						//System.out.println("Leftover copy size: " + newLeftOvers.size());
						hexagons.add(newHex); 
						newLeftOvers.remove(newHex); //remove what is currently being used from the copy
						solve(hexagons, newLeftOvers);
						hexagons.remove(newHex);
					}
					newHex.rotate();
					//System.out.println("Number of rotations: " + (numRot + 1));
				}
			}
		}
	}

	public static void printBoard(ArrayList<Hexagon> hexs){
		for(int i = 0; i < hexs.size(); i++){
			System.out.println("Position " + i + ": " + hexs.get(i));
		}
	}
	
	

	public static boolean areMatching(ArrayList<Hexagon> hexs, Hexagon newHex){
		if(hexs.size() == 0){
			return true;
		}
		else if(hexs.size() == 1){
			if(hexs.get(0).sideColor(0) == newHex.sideColor(3)){
				return true;
			}
		}
		else if(hexs.size() == 2){
			if(hexs.get(0).sideColor(1) == newHex.sideColor(4) && hexs.get(1).sideColor(2) == newHex.sideColor(5)){
				return true;
			}
		}
		else if(hexs.size() == 3){
			if(hexs.get(0).sideColor(2) == newHex.sideColor(5) && hexs.get(2).sideColor(3) == newHex.sideColor(0)){
				return true;
			}
		}
		else if(hexs.size() == 4){
			if(hexs.get(0).sideColor(3) == newHex.sideColor(0) && hexs.get(3).sideColor(4) == newHex.sideColor(1)){
				return true;
			}
		}
		else if(hexs.size() == 5){
			if(hexs.get(0).sideColor(4) == newHex.sideColor(1) && hexs.get(4).sideColor(5) == newHex.sideColor(2)){
				return true;
			}
		}
		else if(hexs.size() == 6){
			if(hexs.get(0).sideColor(5) == newHex.sideColor(2) && hexs.get(5).sideColor(0) == newHex.sideColor(3) && hexs.get(1).sideColor(4) == newHex.sideColor(1)){
				return true;
			}
		}
		return false;
	}

}
