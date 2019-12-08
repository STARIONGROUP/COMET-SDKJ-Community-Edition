package cdp4common.engineeringmodeldata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;
import org.junit.jupiter.api.Test;

class PossibleFiniteStateListTest {

  @Test
  void OrderedItemListIsClonedCorrectlyTest() {
    var pfs1 = new PossibleFiniteState(UUID.randomUUID(), null, null);
    pfs1.setName("state1");
    pfs1.setShortName("s1");

    var pfs2 = new PossibleFiniteState(UUID.randomUUID(), null, null);
    pfs2.setName("state1");
    pfs2.setShortName("s1");

    var pfsList = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
    pfsList.setName("PossibleFiniteStateList1");
    pfsList.setShortName("PFSL1");

    pfsList.getPossibleState().add(pfs1);
    pfsList.getPossibleState().add(pfs2);

    var dtoOrderedItemListOriginal = pfsList.getPossibleState().toDtoOrderedItemList();

    var pfsListClone = pfsList.clone(true);
    var dtoOrderedItemListClone = pfsListClone.getPossibleState().toDtoOrderedItemList();

    assertEquals(dtoOrderedItemListOriginal.get(0).getK(), dtoOrderedItemListClone.get(0).getK());
    assertEquals(dtoOrderedItemListOriginal.get(0).getV(), dtoOrderedItemListClone.get(0).getV());
    assertEquals(dtoOrderedItemListOriginal.get(1).getK(), dtoOrderedItemListClone.get(1).getK());
    assertEquals(dtoOrderedItemListOriginal.get(1).getV(), dtoOrderedItemListClone.get(1).getV());
  }
}
