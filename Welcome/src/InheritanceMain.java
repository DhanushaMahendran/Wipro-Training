
	
	class Parent {
	    void show() {
	        System.out.println("This is the parent class");
	    }
	}

	class Child extends Parent {
	    void display() {
	        System.out.println("This is the child class");
	    }
	}

	 class InheritanceMain {
	    public static void main(String[] args) {
	        Child c = new Child();
	        c.show();    // Inherited from Parent
	        c.display(); // Defined in Child
	    }
	}



