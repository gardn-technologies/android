package nyc.gardn.android;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by nicktinsley on 8/15/15.
 */
public class GardnApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
