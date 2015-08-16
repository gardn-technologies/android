package nyc.gardn.android.models.profiles;

import android.location.Address;

import java.util.List;

import nyc.gardn.android.models.Sector;

public abstract class Profile {
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
}
