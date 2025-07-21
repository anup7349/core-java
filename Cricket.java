 class Cricket{
	String playerName;
	int runs;
	float avg;
	
	Cricket(){
		this.playerName = playerName;
		this.runs = runs;
		this.avg = avg;
	}
	
	Cricket(String playerName, int runs, float avg){
		this.playerName = playerName;
		this.runs = runs;
		this.avg = avg;
	}
	
	public void setProfile(String playerName, int runs, float avg){
		this.playerName = playerName;
		this.runs = runs;
		this.avg = avg;
	}
	
	public String getName(){
		return playerName;
	}
	public int getRuns(){
		return runs;
	}
	public float getAvg(){
		return avg;
	}

	public static void main(String[] args){
		Cricket c = new Cricket();
		c.setProfile("Virat",10000,56.2f);
		System.out.println("Name:" + c.getName());
		System.out.println("Runs:" + c.getRuns());
		System.out.println("Avg:" + c.getAvg());
		
		Cricket c1 = new Cricket();
		c1.setProfile("Rahul",5000,48.2f);
		System.out.println("Name:" + c1.getName());
		System.out.println("Runs:" + c1.getRuns());
		System.out.println("Avg:" + c1.getAvg());
		
		Cricket c2 = new Cricket();
		c2.setProfile("Sachin",12000,45.2f);
		System.out.println("Name:" + c2.getName());
		System.out.println("Runs:" + c2.getRuns());
		System.out.println("Avg:" + c2.getAvg());
		
		Cricket c3 = new Cricket();
		c3.setProfile("Shreyas",3000,44.5f);
		System.out.println("Name:" + c3.getName());
		System.out.println("Runs:" + c3.getRuns());
		System.out.println("Avg:" + c3.getAvg());
		
		Cricket c4 = new Cricket();
		c4.setProfile("Rishabh",2500,38.2f);
		System.out.println("Name:" + c4.getName());
		System.out.println("Runs:" + c4.getRuns());
		System.out.println("Avg:" + c4.getAvg());
		
		
		Cricket c5 = new Cricket("Shubhman",1256,49.9f);
		System.out.println("Name:" + c5.getName());
		System.out.println("Runs:" + c5.getRuns());
		System.out.println("Avg:" + c5.getAvg());
		
		Cricket c6 = new Cricket("Sanju",2256,39.7f);
		System.out.println("Name:" + c6.getName());
		System.out.println("Runs:" + c6.getRuns());
		System.out.println("Avg:" + c6.getAvg());
		
		Cricket c7 = new Cricket("Rajat",930,40.3f);
		System.out.println("Name:" + c7.getName());
		System.out.println("Runs:" + c7.getRuns());
		System.out.println("Avg:" + c7.getAvg());
		
		Cricket c8 = new Cricket("Rohit",5696,34.9f);
		System.out.println("Name:" + c8.getName());
		System.out.println("Runs:" + c8.getRuns());
		System.out.println("Avg:" + c8.getAvg());
		
		Cricket c9 = new Cricket("Surya",4566,38.9f);
		System.out.println("Name:" + c9.getName());
		System.out.println("Runs:" + c9.getRuns());
		System.out.println("Avg:" + c9.getAvg());
	}	
}