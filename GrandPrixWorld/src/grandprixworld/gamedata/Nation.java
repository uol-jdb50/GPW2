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
public enum Nation {
    ARGENTINA("Argentina"), AUSTRALIA("Australia"), AUSTRIA("Austria"), AZERBAIJAN("Azerbaijan"), BAHRAIN("Bahrain"), BELGIUM("Belgium"), BRAZIL("Brazil"), CANADA("Canada"), CHINA("China"), COLOMBIA("Colombia"), DENMARK("Denmark"), ESTONIA("Estonia"), FINLAND("Finland"), FRANCE("France"), GERMANY("Germany"), GREAT_BRITAIN("Great Britain"), HUNGARY("Hungary"), INDIA("India"), INDONESIA("Indonesia"), ITALY("Italy"), JAPAN("Japan"), KUWAIT("Kuwait"), MALAYSIA("Malaysia"), MEXICO("Mexico"), MONACO("Monaco"), NEW_ZEALAND("New Zealand"), POLAND("Poland"), PORTUGAL("Portugal"), QATAR("Qatar"), RUSSIA("Russia"), SINGAPORE("Singapore"), SOUTH_AFRICA("South Africa"), SOUTH_KOREA("South Korea"), SPAIN("Spain"), SWITZERLAND("Switzerland"), THAILAND("Thailand"), THE_NETHERLANDS("The Netherlands"), TURKEY("Turkey"), UNITED_ARAB_EMIRATES("United Arab Emirates"), UNITED_STATES("United States"), VENEZUELA("Venezuela"), VIETNAM("Vietnam");
    private String nation;
    
    private Nation(String nation) {
        this.nation = nation;
    }
    @Override
    public String toString() {
        return nation;
    }
}
