package edu.towson.cis.cosc442.project1.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Interface IOwnable.
 */
public interface IOwnable {

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	int getPrice();

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	boolean isAvailable();

	/**
	 * Play action.
	 */
	void playAction();

	/**
	 * Play action.
	 *
	 * @param msg the msg
	 * @return the boolean
	 */
	Boolean playAction(String msg);

	/**
	 * Player moved.
	 *
	 * @param player the player
	 * @param playerIndex the player index
	 * @param gameMaster the game master
	 */
	public abstract void playerMoved(Player player, int playerIndex, GameMaster gameMaster);

}