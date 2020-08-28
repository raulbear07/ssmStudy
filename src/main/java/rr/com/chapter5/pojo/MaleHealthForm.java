package rr.com.chapter5.pojo;

import java.io.Serializable;

public class MaleHealthForm extends  HealthForm implements Serializable {
    private String prostate;

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }
}
