package rr.com.chapter5.pojo;

import java.io.Serializable;

public class FemaleHealthForm extends HealthForm implements Serializable {
     private String uterus;

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }
}
