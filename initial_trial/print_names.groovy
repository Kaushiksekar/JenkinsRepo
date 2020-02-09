class Stage{
    String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

class Main{
	static void main(args) {
		Stage s = new Stage();
		s.setName("Stage1");
		s.getName();
	}
}