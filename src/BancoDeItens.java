import java.util.ArrayList;

public class BancoDeItens {
	
	ItemEngrama itemEngrama1 = new ItemEngrama("arco", true, false);
	ItemEngrama itemEngrama2 = new ItemEngrama("rifle", true, false);
	ItemEngrama itemEngrama3 = new ItemEngrama("Espada", false, true);
	ItemEngrama itemEngrama4 = new ItemEngrama("Pistola", true, false);
	ItemEngrama itemEngrama5 = new ItemEngrama("Shotgun", false, true);
	
	
	public ArrayList<ItemEngrama> itens = new ArrayList();
	
	
	public ArrayList addItemToList() {
		itens.add(itemEngrama1);
		itens.add(itemEngrama2);
		itens.add(itemEngrama3);
		itens.add(itemEngrama4);
		itens.add(itemEngrama5);
		
		return itens;

	}
}


