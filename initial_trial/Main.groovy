import Stage;

class Main{
	static void main(String[] args) {
		Stage s = load 'Stage.groovy';
		s.setName("Stage1");
		println(s.getName());
		// println("Hello World");
	}
}