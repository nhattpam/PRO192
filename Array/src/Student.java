
import java.util.Date;


/**
 * 
 * @author nhattpam
 */
public class Student {
    private String mID;
    private String mFullName;
    private Date mDoB;
    private String mPhone;
    private String mAddress;

    public Student() {
    }

    public Student(String mID, String mFullName, Date mDoB, String mPhone, String mAddress) {
        this.mID = mID;
        this.mFullName = mFullName;
        this.mDoB = mDoB;
        this.mPhone = mPhone;
        this.mAddress = mAddress;
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmFullName() {
        return mFullName;
    }

    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

    public Date getmDoB() {
        return mDoB;
    }

    public void setmDoB(Date mDoB) {
        this.mDoB = mDoB;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }
    
}
