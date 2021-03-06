package dominion.card.base;
import java.util.*;

import dominion.*;
import dominion.card.*;

/**
 * Carte Forgeron (Smithy)
 * 
 * +3 Cartes.
 */
public class Smithy extends ActionCard {

	public Smithy() {
		super("Smithy", 4);
	}
	
	public Smithy(String name, int cost) {
		super(name, cost);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(Player p) {
		p.getGame().pause(1000, "You received 3 card", ".", ".", ".");
		p.drawCard_AndAddInHand();
		p.drawCard_AndAddInHand();
		p.drawCard_AndAddInHand();
	}
}