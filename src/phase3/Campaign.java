/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase3;

/**
 *
 * @author daus
 */
public class Campaign {

    private String campaignName, campaignStartDate, campaignVenue;
    private double campaignTotalDonatedBlood;
    private Donor donor;
    
    
    public Campaign(String campaignName, String campaignStartDate, String campaignVenue) {
        this.campaignName = campaignName;
        this.campaignStartDate = campaignStartDate;
        this.campaignVenue = campaignVenue;
        this.donor = donor;
       
    }
    public Campaign(){
        this.campaignName = null;
        this.campaignStartDate = null;
        this.campaignVenue = null;
        this.donor = null;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }
    
    
    public String getCampaignName() {
        return campaignName;
    }

     public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignStartDate() {
        return campaignStartDate;
    }

    public void setCampaignStartDate(String campaignStartDate) {
        this.campaignStartDate =  campaignStartDate;
    }
    
    
    
    public String getCampaignVenue() {
        return campaignVenue;
    }
    
    
    public void setcampaignVenue(String campaignVenue) {
        this.campaignVenue =  campaignVenue;
    }
    public double getCampaignTotalDonatedBlood() {
        return campaignTotalDonatedBlood;
    }
    
    public void addTotalDonatedBlood(double donorBlood) {
        campaignTotalDonatedBlood += donorBlood;
    }

}

