package rr.com.chapter5.pojo;

import java.io.Serializable;

public class FemaleEmployee extends  Employee  implements Serializable  {
    private  FemaleHealthForm femaleHealthForm=null;

    public FemaleHealthForm getFemaleHealthForm() {
        return femaleHealthForm;
    }

    public void setFemaleHealthForm(FemaleHealthForm femaleHealthForm) {
        this.femaleHealthForm = femaleHealthForm;
    }
}
