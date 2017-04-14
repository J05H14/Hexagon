package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;


public class Main extends Application {
	//static ArrayList<Hexagon> guiHexagons = HexagonBoardMaker.getFullBoard();
//	HexagonBoardMaker.getFullBoard(guiHexagons);
	
	@Override
	public void start(Stage stage) {
		try {
			
//			BorderPane bp = new BorderPane();
//			Pane pane = new Pane();
//			Scene scene = new Scene(pane,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			
//			Polygon hex = new Polygon();
//			HBox hex1 = new HBox();
//			
//			pane.getChildren().add(hex);
//			
//			primaryStage.setScene(scene);
//			primaryStage.show();
			
		    HexagonBoardMaker.solve(new ArrayList<Hexagon>());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void drawBoard(ArrayList<Hexagon> guiHexs){
		Stage stage = new Stage();
		Group g = new Group();
		Scene scene = new Scene(g, 500, 500);
	    stage.setScene(scene);
	    
	    Polygon h1t1 = new Polygon();
	    h1t1.getPoints().addAll(new Double[]{
	        250.0,250.0,
	        200.0,175.0,
	        300.0,175.0
	    });
	    color(guiHexs, h1t1, 0 , 0);
	    g.getChildren().add(h1t1);
	    
	    Polygon h1t2 = new Polygon();
	    h1t2.getPoints().addAll(new Double[]{
	    	250.0,250.0,
	    	300.0,175.0,
	   		350.0,250.0
	    });
	    color(guiHexs, h1t2, 0 , 1);
	    g.getChildren().add(h1t2);
	    
	    Polygon h1t3 = new Polygon();
	    h1t3.getPoints().addAll(new Double[]{
	    	250.0,250.0,
	    	350.0,250.0,
	    	300.0,325.0
	    });
	    color(guiHexs, h1t3, 0 , 2);
	    g.getChildren().add(h1t3);
	    
	    Polygon h1t4 = new Polygon();
	    h1t4.getPoints().addAll(new Double[]{
	    	250.0,250.0,
	    	300.0,325.0,
	    	200.0,325.0
	    });
	    color(guiHexs, h1t4, 0 , 3);
	    g.getChildren().add(h1t4);
	    
	    Polygon h1t5 = new Polygon();
	    h1t5.getPoints().addAll(new Double[]{
	    	250.0,250.0,
	    	200.0,325.0,
	    	150.0,250.0
	    });
	    color(guiHexs, h1t5, 0 , 4);
	    g.getChildren().add(h1t5);
	    
	    Polygon h1t6 = new Polygon();
	    h1t6.getPoints().addAll(new Double[]{
	    	250.0,250.0,
	    	150.0,250.0,
	    	200.0,175.0
	    });
	    color(guiHexs, h1t6, 0 , 5);
	    g.getChildren().add(h1t6);
	    

	    Polygon h2t1 = new Polygon();
		h2t1.getPoints().addAll(new Double[]{
			250.0,100.0,
			300.0,25.0,
			200.0,25.0
		});
		color(guiHexs, h2t1, 1, 0);
		g.getChildren().add(h2t1);
		
		Polygon h2t2 = new Polygon();
		h2t2.getPoints().addAll(new Double[]{
			250.0,100.0,
			350.0,100.0,
			300.0,25.0
		});
		color(guiHexs, h2t2, 1, 1);
		g.getChildren().add(h2t2);
		
		Polygon h2t3 = new Polygon();
		h2t3.getPoints().addAll(new Double[]{
			250.0,100.0,
			300.0,175.0,
			350.0,100.0
		});
		color(guiHexs, h2t3, 1, 2);
		g.getChildren().add(h2t3);
		
		Polygon h2t4 = new Polygon();
		h2t4.getPoints().addAll(new Double[]{
			200.0,175.0,
			300.0,175.0,
			250.0,100.0
		});
		color(guiHexs, h2t4, 1, 3);
		g.getChildren().add(h2t4);
		
		Polygon h2t5 = new Polygon();
		h2t5.getPoints().addAll(new Double[]{
			250.0,100.0,
			200.0,175.0,
			150.0,100.0
		});
		color(guiHexs, h2t5, 1, 4);
		g.getChildren().add(h2t5);
		
		Polygon h2t6 = new Polygon();
		h2t6.getPoints().addAll(new Double[]{
			250.0,100.0,
			150.0,100.0,
			200.0,25.0
		});
		color(guiHexs, h2t6, 1, 5);
		g.getChildren().add(h2t6);
		
		
		
		Polygon h3t1 = new Polygon();
		h3t1.getPoints().addAll(new Double[]{
				400.0,175.0,
				450.0,100.0,
				350.0,100.0
		});
		color(guiHexs, h3t1, 2, 0);
		g.getChildren().add(h3t1);
		
		Polygon h3t2 = new Polygon();
		h3t2.getPoints().addAll(new Double[]{
				400.0,175.0,
				500.0,175.0,
				450.0,100.0
		});
		color(guiHexs, h3t2, 2, 1);
		g.getChildren().add(h3t2);
		
		Polygon h3t3 = new Polygon();
		h3t3.getPoints().addAll(new Double[]{
				400.0,175.0,
				450.0,250.0,
				500.0,175.0
		});
		color(guiHexs, h3t3, 2, 2);
		g.getChildren().add(h3t3);
		
		Polygon h3t4 = new Polygon();
		h3t4.getPoints().addAll(new Double[]{
			400.0,175.0,
			350.0,250.0,
			450.0,250.0
		});
		color(guiHexs, h3t4, 2, 3);
		g.getChildren().add(h3t4);
		
		Polygon h3t5 = new Polygon();
		h3t5.getPoints().addAll(new Double[]{
			400.0,175.0,
			300.0,175.0,
			350.0, 250.0
		});
		color(guiHexs, h3t5,2, 4);
		g.getChildren().add(h3t5);
		
		Polygon h3t6 = new Polygon();
		h3t6.getPoints().addAll(new Double[]{
			300.0,175.0,
			350.0,100.0,
			400.0,175.0
		});
		color(guiHexs, h3t6, 2, 5);
		g.getChildren().add(h3t6);
		
		
		
		Polygon h4t1 = new Polygon();
		h4t1.getPoints().addAll(new Double[]{
			350.0,250.0,
			450.0,250.0,
			400.0,325.0
		});
		color(guiHexs, h4t1, 3, 0);
		g.getChildren().add(h4t1);
		
		Polygon h4t2 = new Polygon();
		h4t2.getPoints().addAll(new Double[]{
			400.0,325.0,
			450.0,250.0,
			500.0,325.0
		});
		color(guiHexs, h4t2, 3, 1);
		g.getChildren().add(h4t2);
		
		Polygon h4t3 = new Polygon();
		h4t3.getPoints().addAll(new Double[]{
			400.0,325.0,
			500.0,325.0,
			450.0,400.0
		});
		color(guiHexs, h4t3, 3, 2);
		g.getChildren().add(h4t3);
		
		Polygon h4t4 = new Polygon();
		h4t4.getPoints().addAll(new Double[]{
			400.0,325.0,
			450.0,400.0,
			350.0,400.0
		});
		color(guiHexs, h4t4, 3, 3);
		g.getChildren().add(h4t4);
		
		Polygon h4t5 = new Polygon();
		h4t5.getPoints().addAll(new Double[]{
			400.0,325.0,
			350.0,400.0,
			300.0,325.0
		});
		color(guiHexs, h4t5, 3, 4);
		g.getChildren().add(h4t5);
		
		Polygon h4t6 = new Polygon();
		h4t6.getPoints().addAll(new Double[]{
			400.0,325.0,
			300.0,325.0,
			350.0,250.0
		});
		color(guiHexs, h4t6, 3, 5);
		g.getChildren().add(h4t6);
		
		
		Polygon h5t1 = new Polygon();
		h5t1.getPoints().addAll(new Double[]{
			250.0,400.0,
		   	300.0,325.0,
		   	200.0,325.0
		});
		color(guiHexs, h5t1, 4, 0);
		g.getChildren().add(h5t1);
		
		Polygon h5t2 = new Polygon();
		h5t2.getPoints().addAll(new Double[]{
			250.0,400.0,
	    	300.0,325.0,
	    	350.0,400.0
		});
		color(guiHexs, h5t2, 4, 1);
		g.getChildren().add(h5t2);
		
		Polygon h5t3 = new Polygon();
		h5t3.getPoints().addAll(new Double[]{
			250.0,400.0,
		   	350.0,400.0,
		    300.0,475.0
		});
		color(guiHexs, h5t3, 4, 2);
		g.getChildren().add(h5t3);
		
		Polygon h5t4 = new Polygon();
		h5t4.getPoints().addAll(new Double[]{
			250.0,400.0,
	    	300.0,475.0,
	    	200.0,475.0
		});
		color(guiHexs, h5t4, 4, 3);
		g.getChildren().add(h5t4);
		
		Polygon h5t5 = new Polygon();
		h5t5.getPoints().addAll(new Double[]{
			250.0,400.0,
		   	200.0,475.0,
		    150.0,400.0
		});
		color(guiHexs, h5t5, 4, 4);
		g.getChildren().add(h5t5);
		
		Polygon h5t6 = new Polygon();
		h5t6.getPoints().addAll(new Double[]{
			250.0,400.0,
		   	150.0,400.0,
		    200.0,325.0
		});
		color(guiHexs, h5t6, 4, 5);
		g.getChildren().add(h5t6);

		
		Polygon h6t1 = new Polygon();
		h6t1.getPoints().addAll(new Double[]{
			100.0,325.0,
			50.0,250.0,
			150.0,250.0,
		});
		color(guiHexs, h6t1, 5, 0);
		g.getChildren().add(h6t1);
		
		Polygon h6t2 = new Polygon();
		h6t2.getPoints().addAll(new Double[]{
			100.0,325.0,
			150.0,250.0,
			200.0,325.0,
		});
		color(guiHexs, h6t2, 5, 1);
		g.getChildren().add(h6t2);
		
		Polygon h6t3 = new Polygon();
		h6t3.getPoints().addAll(new Double[]{
			100.0,325.0,
			200.0,325.0,
			150.0,400.0
		});
		color(guiHexs, h6t3, 5, 2);
		g.getChildren().add(h6t3);
		
		Polygon h6t4 = new Polygon();
		h6t4.getPoints().addAll(new Double[]{
			100.0,325.0,
			150.0,400.0,
			50.0,400.0
		});
		color(guiHexs, h6t4, 5, 3);
		g.getChildren().add(h6t4);
		
		Polygon h6t5 = new Polygon();
		h6t5.getPoints().addAll(new Double[]{
			100.0,325.0,
			50.0,400.0,
			0.0,325.0
		});
		color(guiHexs, h6t5, 5, 4);
		g.getChildren().add(h6t5);
		
		Polygon h6t6 = new Polygon();
		h6t6.getPoints().addAll(new Double[]{
			100.0,325.0,
			0.0,325.0,
			50.0,250.0
		});
		color(guiHexs, h6t6, 5, 5);
		g.getChildren().add(h6t6);
		
		
		
		Polygon h7t1 = new Polygon();
		h7t1.getPoints().addAll(new Double[]{
			100.0,175.0,
			150.0,100.0,
			50.0,100.0
		});
		color(guiHexs, h7t1, 6, 0);
		g.getChildren().add(h7t1);
		
		Polygon h7t2 = new Polygon();
		h7t2.getPoints().addAll(new Double[]{
			100.0,175.0,
			200.0,175.0,
			150.0,100.0
		});
		color(guiHexs, h7t2, 6, 1);
		g.getChildren().add(h7t2);
		
		Polygon h7t3 = new Polygon();
		h7t3.getPoints().addAll(new Double[]{
			100.0,175.0,
			200.0,175.0,
			150.0,250.0
		});
		color(guiHexs, h7t3, 6, 2);
		g.getChildren().add(h7t3);
		
		Polygon h7t4 = new Polygon();
		h7t4.getPoints().addAll(new Double[]{
			100.0,175.0,
			150.0,250.0,
			50.0,250.0
		});
		color(guiHexs, h7t4, 6, 3);
		g.getChildren().add(h7t4);
		
		Polygon h7t5 = new Polygon();
		h7t5.getPoints().addAll(new Double[]{
			100.0,175.0,
			50.0,250.0,
			0.0,175.0
		});
		color(guiHexs, h7t5, 6, 4);
		g.getChildren().add(h7t5);
		
		Polygon h7t6 = new Polygon();
		h7t6.getPoints().addAll(new Double[]{
			100.0,175.0,
			0.0,175.0,
			50.0,100.0
		});
		color(guiHexs, h7t6, 6, 5);
		g.getChildren().add(h7t6);
	    
	    scene.setRoot(g);
	    stage.setTitle("Hexagons");
	    stage.show();
	}
	
	
	//figures out tile color
	public static void color(ArrayList<Hexagon> guiHexagons, Polygon triangle, int hexagon, int tile){
		char color = guiHexagons.get(hexagon).sideColor(tile);
		if(color == 'B'){
	    	triangle.setFill(Color.BLUE);
	    }
	    else if(color == 'R'){
	    	triangle.setFill(Color.RED);
	    }
	    else if(color == 'O'){
	    	triangle.setFill(Color.ORANGE);
	    }else if(color == 'G'){
	    	triangle.setFill(Color.GREEN);
	    }else if(color == 'P'){
	    	triangle.setFill(Color.PURPLE);
	    }else if(color == 'Y'){
	    	triangle.setFill(Color.YELLOW);
	    }
		triangle.setStroke(Color.BLACK);
	}
}
