package nyc.gardn.android;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by nicktinsley on 8/15/15.
 */
public class GardnApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, SecretConstants.APPLICATON_ID, SecretConstants.CLIENT_KEY);

    }
}
