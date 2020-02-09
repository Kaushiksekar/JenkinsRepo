public class Stage {
    String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

// this method just to have nice access to create class by name
Object getProperty(String name){
    return this.getClass().getClassLoader().loadClass(name).newInstance();
} 

return this