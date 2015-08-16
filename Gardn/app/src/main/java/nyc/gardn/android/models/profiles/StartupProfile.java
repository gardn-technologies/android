package nyc.gardn.android.models.profiles;

import java.util.Date;
import java.util.List;

import nyc.gardn.android.models.Person;
import nyc.gardn.android.models.Sector;

/**
 * Created by nicktinsley on 8/15/15.
 */
public class StartupProfile extends Profile {
    String bio;
    Date foundingDate;
    List<Person> founders;
    Integer soughtFunds;
    Integer raisedFunds;

    public StartupProfile(String name, String website, List<Sector> sectors, Integer location, String bio, Date foundingDate, List<Person> founders, Integer soughtFunds, Integer raisedFunds) {
        this.name = name;
        this.website = website;
        this.sectors = sectors;
        this.location = location;
        this.bio = bio;
        this.foundingDate = foundingDate;
        this.founders = founders;
        this.soughtFunds = soughtFunds;
        this.raisedFunds = raisedFunds;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getFoundingDate() {
        return foundingDate;
    }

    public void setFoundingDate(Date foundingDate) {
        this.foundingDate = foundingDate;
    }

    public List<Person> getFounders() {
        return founders;
    }

    public void setFounders(List<Person> founders) {
        this.founders = founders;
    }

    public Integer getSoughtFunds() {
        return soughtFunds;
    }

    public void setSoughtFunds(Integer soughtFunds) {
        this.soughtFunds = soughtFunds;
    }

    public Integer getRaisedFunds() {
        return raisedFunds;
    }

    public void setRaisedFunds(Integer raisedFunds) {
        this.raisedFunds = raisedFunds;
    }
}
