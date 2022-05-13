package Riflessione;

import java.lang.reflect.Field;

public class Riflessione {
	
	/*Implementare un metodo, chiamato reset, che prende come argomento un oggetto ed imposta a 
	zero tutti i suoi campi interi pubblici*/
	public static void reset(Object obj) {
		Field[] fields = obj.getClass().getDeclaredFields();
		for(Field f : fields) {
			if(f.getDeclaringClass() == Integer.class) {
				try {
					f.set(obj, 0);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	/* Implementare un metodo che, dato un oggetto, parte dalla classe che rappresenta il tipo effettivo 
	dell'oggetto e ne restituisce la superclasse più generale, escludendo Object (quindi, la penultima classe, 
	prima di arrivare a Object)*/
	public static Class<?> getAncestor(Object obj) {
		Class<?> superclass = obj.getClass();
		while(superclass.getSuperclass() != Object.class) {
			superclass = superclass.getSuperclass();
		}
		return superclass;
		
	}
}
