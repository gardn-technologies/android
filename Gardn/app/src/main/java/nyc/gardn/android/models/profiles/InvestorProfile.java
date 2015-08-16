package nyc.gardn.android.models.profiles;

import android.graphics.Bitmap;

import java.util.List;

import nyc.gardn.android.models.Firm;
import nyc.gardn.android.models.Sector;

/**
 * Created by nicktinsley on 8/15/15.
 */
public class InvestorProfile extends Profile {
    Bitmap profilePhoto;
    String position;
    Firm firm;
    String linkedInUrl;
    Integer checkMinimum;
    Integer checkMaximum;

    public InvestorProfile(String name, String website, List< Sector > sectors, Integer location, Bitmap profilePhoto, String position, Firm firm, String linkedInUrl, Integer checkMinimum, Integer checkMaximum) {
        this.name = name;
        this.website = website;
        this.sectors = sectors;
        this.location = location;
        this.profilePhoto = profilePhoto;
        this.position = position;
        this.firm = firm;
        this.linkedInUrl = linkedInUrl;
        this.checkMinimum = checkMinimum;
        this.checkMaximum = checkMaximum;
    }

    public Bitmap getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(Bitmap profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public void setFirm(String firmName) {
        this.firm = new Firm(firmName);
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public Integer getCheckMinimum() {
        return checkMinimum;
    }

    public void setCheckMinimum(Integer checkMinimum) {
        this.checkMinimum = checkMinimum;
    }

    public Integer getCheckMaximum() {
        return checkMaximum;
    }

    public void setCheckMaximum(Integer checkMaximum) {
        this.checkMaximum = checkMaximum;
    }
}
