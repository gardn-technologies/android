package nyc.gardn.android.models.accounts;

import com.firebase.client.Firebase;

import nyc.gardn.android.SecretConstants;

/**
 * Created by nicktinsley on 8/15/15.
 */
public abstract class GardnAccount {
    private static final Firebase ref = new Firebase(SecretConstants.FIREBASE_URL).child("accounts");

    private String _id;
    private String email;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static Firebase getParentRef() {
        return ref;
    }
}
