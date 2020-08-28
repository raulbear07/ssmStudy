package rr.com.chapter5.pojo;

import java.io.Serializable;

public class MaleEmployee extends  Employee implements Serializable {
    private MaleHealthForm maleHealthForm=null;

    public MaleHealthForm getMaleHealthForm() {
        return maleHealthForm;
    }

    public void setMaleHealthForm(MaleHealthForm maleHealthForm) {
        this.maleHealthForm = maleHealthForm;
    }
}
