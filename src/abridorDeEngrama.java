import java.util.ArrayList;
import java.util.Random;

public class abridorDeEngrama {

	public ItemEngrama getRandomItemFromList() {

		BancoDeItens banco = new BancoDeItens();
		
		ArrayList<ItemEngrama> itens = banco.addItemToList();
		
		Random rand = new Random();

		ItemEngrama randomElement = itens.get(rand.nextInt(itens.size()));
		
		return randomElement;

	}
}
