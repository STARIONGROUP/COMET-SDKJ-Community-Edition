package cdp4common.engineeringmodeldata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cdp4common.types.OrderedItem;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class PossibleFiniteStateListTest {

  @Test
  void OrderedItemListIsClonedCorrectlyTest() {
    PossibleFiniteState pfs1 = new PossibleFiniteState(UUID.randomUUID(), null, null);
    pfs1.setName("state1");
    pfs1.setShortName("s1");

    PossibleFiniteState pfs2 = new PossibleFiniteState(UUID.randomUUID(), null, null);
    pfs2.setName("state1");
    pfs2.setShortName("s1");

    PossibleFiniteStateList pfsList = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
    pfsList.setName("PossibleFiniteStateList1");
    pfsList.setShortName("PFSL1");

    pfsList.getPossibleState().add(pfs1);
    pfsList.getPossibleState().add(pfs2);

    List<OrderedItem> dtoOrderedItemListOriginal = pfsList.getPossibleState().toDtoOrderedItemList();

    PossibleFiniteStateList pfsListClone = pfsList.clone(true);
    List<OrderedItem> dtoOrderedItemListClone = pfsListClone.getPossibleState().toDtoOrderedItemList();

    assertEquals(dtoOrderedItemListOriginal.get(0).getK(), dtoOrderedItemListClone.get(0).getK());
    assertEquals(dtoOrderedItemListOriginal.get(0).getV(), dtoOrderedItemListClone.get(0).getV());
    assertEquals(dtoOrderedItemListOriginal.get(1).getK(), dtoOrderedItemListClone.get(1).getK());
    assertEquals(dtoOrderedItemListOriginal.get(1).getV(), dtoOrderedItemListClone.get(1).getV());
  }
}
