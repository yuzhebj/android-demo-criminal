package criminalintent.android.gbsc.ibm.com.criminalintent;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by yuzhe on 2/18/2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        // generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getId() {
        return mId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date newDate) {
        Calendar newTmpDate = Calendar.getInstance();
        newTmpDate.setTime(newDate);
        Calendar tmpDate = Calendar.getInstance();
        tmpDate.setTime(mDate);
        Calendar calendar = Calendar.getInstance();
        calendar.set(newTmpDate.get(Calendar.YEAR), newTmpDate.get(Calendar.MONTH), newTmpDate.get(Calendar.DAY_OF_MONTH),
                tmpDate.get(Calendar.HOUR_OF_DAY), tmpDate.get(Calendar.MINUTE), tmpDate.get(Calendar.SECOND));
        this.mDate = calendar.getTime();
    }

    public void setTime(Date newDate) {
        Calendar newTmpDate = Calendar.getInstance();
        newTmpDate.setTime(newDate);
        Calendar tmpDate = Calendar.getInstance();
        tmpDate.setTime(mDate);
        Calendar calendar = Calendar.getInstance();
        calendar.set(tmpDate.get(Calendar.YEAR), tmpDate.get(Calendar.MONTH), tmpDate.get(Calendar.DAY_OF_MONTH),
                newTmpDate.get(Calendar.HOUR_OF_DAY), newTmpDate.get(Calendar.MINUTE), newTmpDate.get(Calendar.SECOND));
        this.mDate = calendar.getTime();
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
}
