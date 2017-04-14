package application;

public class Hexagon {

	private String colors;
	private char[] colorArr = new char[6];


	public Hexagon(String colors){
		this.colors = sideColor(colors);
	}

	public String sideColor(String hexColor){
		hexColor = hexColor.substring(2);

		for(int i = 0; i < hexColor.length(); i++){
			colorArr[i] = hexColor.charAt(i);
		}
		
		return hexColor;
	}
	public String toString(){
		return colors;
	}
	
	public void rotate(){
		char temp = colorArr[0];
		
		for(int i = 1; i < colorArr.length; i++){
			colorArr[i - 1] = colorArr[i];
		}
		colorArr[colorArr.length - 1] = temp;
		
		colors = "";
		for(int i = 0; i < colorArr.length; i++){
			colors += colorArr[i] + "";
		}
		
	}


	public String getColors() {
		return colors;
	}


	public void setColors(String colors) {
		this.colors = colors;
	}

	public char sideColor(int index) {
		return colorArr[index];
	}

	public void setColorArr(char[] colorArr) {
		this.colorArr = colorArr;
	}

}
