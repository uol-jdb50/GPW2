/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grandprixworld.gamedata;

/**
 *
 * @author Josh Brookes
 */
public class Venue {
    public String fullName;
    public String shortName;
    public String raceName;
    public String imageCode;
    public Nation nation;
    public Region region;
    public double KmLength;
    public boolean lastYear;
    public float scale;
    public double record;
    
    public Venue(String fullName, String shortName, String raceName, String imageCode, String nation, Region region, double KmLength, boolean lastYear, float scale, double record) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.raceName = raceName;
        this.imageCode = imageCode;
        
        this.nation = findNationByString(nation);
        
        this.region = region;
        this.KmLength = KmLength;
        this.lastYear = lastYear;
        this.scale = scale;
        this.record = record;
    }
    
    private Nation findNationByString(String nation) {
        for (Nation n: Nation.values()) {
            if (n.toString().equals(nation)) return n;
        }
        return null;
    }
}
