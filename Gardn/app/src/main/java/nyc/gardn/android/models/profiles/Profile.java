package nyc.gardn.android.models.profiles;

import com.firebase.client.Firebase;

import java.util.List;

import nyc.gardn.android.SecretConstants;
import nyc.gardn.android.models.Sector;

public abstract class Profile {
    private static final Firebase ref = new Firebase(SecretConstants.FIREBASE_URL).child("profiles");

    String name;
    String website;
    List<Sector> sectors;
    Integer location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Sector> getSectors() {
        return sectors;
    }

    public void setSectors(List<Sector> sectors) {
        this.sectors = sectors;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public static Firebase getParentRef() {
        return ref;
    }
}
