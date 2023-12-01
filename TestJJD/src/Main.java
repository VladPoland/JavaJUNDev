import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {
                Block block1 = new SimpleBlock("Red", "Brick");
                Block block2 = new SimpleBlock("Blue", "Wood");
                Block block3 = new SimpleBlock("Green", "Concrete");
               // Block block4 = new SimpleBlock("Blue", "Brick");
               //  Block block5 = new SimpleBlock("Blue", "Wood");// block testowy

                List<Block> blocks = new ArrayList<>();  // pszeksztalcenie w postac listy
                blocks.add(block1);
                blocks.add(block2);
                blocks.add(block3);
                // blocks.add(block4);
                // blocks.add(block5);

                Wall wall = new Wall(blocks); //tworzymy objekt  ktory reprezentuje ścianę i przyjmuje
                // listę bloków jako argument w konstruktorze.

                Optional<Block> foundBlock = wall.findBlockByColor("Red"); //metoda do wysykiwania blocku w podanym kolorze
                foundBlock.ifPresent(b -> System.out.println("Found block: " + b.getColor() /*+ ", " + b.getMaterial()*/));

                List<Block> foundBlocks = wall.findBlocksByMaterial("Brick"); //metoda do wysykiwania blocku z materialo ktory zostal podany
                System.out.println("Found blocks by material: " + foundBlocks.size());

                int blockCount = wall.count();
                System.out.println("Block count: " + blockCount); // metoda zliczenia wszystkich bloków
        }
}