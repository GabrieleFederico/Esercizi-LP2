package ComponentConfiguration;

import java.util.HashSet;
import java.util.Set;

public class Component {
	
	private Type type;
	private String description;
	private Set<Component> incompatibleComponents = new HashSet<Component>();
	
	public Component(Type type, String description){
		this.type = type;
		this.description = description;
		
	}
	
	public void setIncompatible(Component c) {
		incompatibleComponents.add(c);
		c.incompatibleComponents.add(this);
	}

	public boolean isIncompatible(Component c) {
		return incompatibleComponents.contains(c);
	}

	public Type getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(o.getClass() != Component.class)
			return false;
		Component c = (Component)o;
		
		return type.equals(c.type) && description.equals(c.description);
	}
	
	@Override
	public int hashCode() {
		return type.hashCode() ^ description.hashCode();
	}
}
