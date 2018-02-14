package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	String getName();

	int getPrice();

	boolean isAvailable();

	void playAction();

	Boolean playAction(String msg);

}