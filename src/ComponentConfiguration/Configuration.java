package ComponentConfiguration;

import java.util.HashSet;
import java.util.Set;

public class Configuration {

	Set<Component> components = new HashSet<Component>();
	
	public boolean add(Component component) {
		for(Component c : components)
			if(component.isIncompatible(c) || component.getType() == c.getType())
				return false;
		return components.add(component);
	}
}
