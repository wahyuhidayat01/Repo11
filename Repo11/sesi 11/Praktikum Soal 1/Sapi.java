class Sapi extends Hewan{
	public Sapi(){
		susper("sapi", 4, false);
	}
	public void bersuara(){
		System.out.println("\nnemoh..., emoh...");
	}
	
	public static void main(String[] args){
		Sapi s = new Sapi();
		s.isHewan();
		s.bersuara();
	}
}