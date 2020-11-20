import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		abridorDeEngrama abridor = new abridorDeEngrama();

		Terminal.writeLine("Aperte a tecla ENTER para abrir o engrama!");
		Terminal.readKey();

		for (int i = 0; i < 5; i++) {

			ItemEngrama item = abridor.getRandomItemFromList();

			Terminal.writeLine("Item aberto: " + item.name);

			if (item.isExotic) {
				Terminal.writeLine(Terminal.YELLOW_BOLD + "Voce pegou um item exotico!" + Terminal.ANSI_RESET);
				Terminal.writeLine("");
			} else {
				Terminal.writeLine(Terminal.PURPLE_BOLD + "Voce pegou um item Lendário!" + Terminal.ANSI_RESET);
				Terminal.writeLine("");

			}
		}
	}
}
