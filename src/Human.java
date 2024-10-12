public class Human {
    private int id;
    private String name;
    private String gender;

    public Human(){
        
    }

    public Human(int id){
        this.id = id;
    }

    public Human(int id,String name){
        this.id = id;
        this.name = name;
    }

    public Human(int id,String name,String gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
/**
 * @return 
 */
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName() {
    this.name = name;
}

public String getGender() {
    return gender;
}

public void setGender() {
    this.gender = gender;
}




}
