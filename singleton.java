// Source: https://duynotes.blogspot.com/2020/02/design-pattern-singleton-pattern.html
class singleton {
	// lazy construction
	// the class variable is null if no instance is
	// instantiated
	private static singleton uniqueInstance = null;
	private singleton() {
	//...
	}
	// lazy construction of the instance
	public static singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new singleton();
		}
	return uniqueInstance;
	}
  	//...
}
