
public class ItemEngrama {

	public String name;
	public boolean isLegendary;
	public boolean isExotic;

	public ItemEngrama(String name, boolean isLegendary, boolean isExotic) {
		this.name = name;
		this.isLegendary = isLegendary;
		this.isExotic = isExotic;

	}
	
	public void status() {
		Terminal.writeLine(this.name);
		Terminal.writeLine(String.valueOf(this.isLegendary));
		Terminal.writeLine(String.valueOf(this.isExotic));
	
	}
}
