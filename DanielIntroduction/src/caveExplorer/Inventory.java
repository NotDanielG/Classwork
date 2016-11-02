package caveExplorer;

public class Inventory {
	
	private boolean hasMap;
	private String map;
	public Inventory(){
		hasMap = true;
		updateMap();
	}
	
	private void updateMap() {
		// TODO Auto-generated method stub
		
	}

	public String getDescription() {
		if(hasMap){
			return map;
		}
		return "There is nothing in your inventory";
	}

	public boolean isHasMap() {
		return hasMap;
	}

	public void setMap(boolean b) {
		this.hasMap = b;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}
	
	
	
	
}

