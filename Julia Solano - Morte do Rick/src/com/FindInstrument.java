package com.guitar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindInstrument {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map properties = new HashMap();
		properties.put("type", Type.ACOUSTIC);
		properties.put("builder", Builder.GIBSON);
		properties.put("backwood", Wood.MAPLE);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);

		List matchingInstruments = inventory.search(clientSpec);
		if (!matchingInstruments.isEmpty()) {
			System.out.println("You might like these instruments:");
			for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println(
						"We have a " + spec.getProperty("InstrumentType") + " with the following properties:");
				for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String) j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println("    " + propertyName + ": " + spec.getProperty(propertyName));
				}
				System.out.println("    You can have this " + spec.getProperty("InstrumentType") + " for $"
						+ instrument.getPrice() + "\n---");
			}
		} else {
			System.out.println("Sorry, we have nothing for you.");
		}

	}

	private static void initializeInventory(Inventory inventory) {
		Map properties = new HashMap();
		properties.put("InstrumentType", InstrumentType.MANDOLIN);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "F5-G");
		properties.put("type", Type.ACOUSTIC);
		properties.put("topwood", Wood.MAPLE);
		properties.put("backwood", Wood.MAPLE);
		properties.remove("numstrings");
		properties.put("style", Style.A);
		inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));

		properties.put("InstrumentType", InstrumentType.BANJO);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "RB-3");
		properties.put("type", Type.ACOUSTIC);
		properties.put("backwood", Wood.MAPLE);
		properties.put("numstrings", 5);
		properties.remove("style");
		inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.SAXOFONE);
		properties.put("builder", Builder.SELMER);
		properties.put("model", "soprano");
		properties.put("type", Type.ACOUSTIC);
		properties.remove("backwood");
		properties.put("numstrings");
		properties.remove("topWood");
		properties.remove("style");
		inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
	}

}
