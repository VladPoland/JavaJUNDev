import java.util.List;

interface CompositeBlock extends Block {
    List<Block> getBlocks();
}// metoda określająca , że klasy implementujące CompositeBlock muszą dostarczyć implementację zwracającą listę bloków
