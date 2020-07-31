package rr.com.chapter5.pojo;

public enum SexEum {
    Male(1,"男"),
    Female(2,"女");


    SexEum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private  int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexEum getSexById(int id){
        for(SexEum sex:SexEum.values()){
            if(id==sex.getId())
                return sex;
        }
        return null;
    }
}
