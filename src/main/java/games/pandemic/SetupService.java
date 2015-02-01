package games.pandemic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Steven on 1/31/2015.
 */
public class SetupService {

    public void setupGame(){
        buildCitySet();
    }

    private Map<CityName, City> buildCitySet() {
        Map<CityName, City> citiesMap = new HashMap<CityName, City>();
        citiesMap.put(CityName.SAN_FRANCISCO, new City(CityName.SAN_FRANCISCO, DiseaseColor.BLUE));
        citiesMap.put(CityName.CHICAGO, new City(CityName.CHICAGO, DiseaseColor.BLUE));
        citiesMap.put(CityName.TORONTO, new City(CityName.TORONTO, DiseaseColor.BLUE));
        citiesMap.put(CityName.ATLANTA, new City(CityName.ATLANTA, DiseaseColor.BLUE));
        citiesMap.put(CityName.WASHINGTON, new City(CityName.WASHINGTON, DiseaseColor.BLUE));
        citiesMap.put(CityName.NEW_YORK, new City(CityName.NEW_YORK, DiseaseColor.BLUE));
        citiesMap.put(CityName.MADRID, new City(CityName.MADRID, DiseaseColor.BLUE));
        citiesMap.put(CityName.LONDON, new City(CityName.LONDON, DiseaseColor.BLUE));
        citiesMap.put(CityName.PARIS, new City(CityName.PARIS, DiseaseColor.BLUE));
        citiesMap.put(CityName.ESSEN, new City(CityName.ESSEN, DiseaseColor.BLUE));
        citiesMap.put(CityName.ST_PETERSBURG, new City(CityName.ST_PETERSBURG, DiseaseColor.BLUE));
        citiesMap.put(CityName.MILAN, new City(CityName.MILAN, DiseaseColor.BLUE));
        citiesMap.put(CityName. LOS_ANGELES, new City(CityName.LOS_ANGELES, DiseaseColor.YELLOW));
        citiesMap.put(CityName.MEXICO_CITY, new City(CityName.MEXICO_CITY, DiseaseColor.YELLOW));
        citiesMap.put(CityName.MIAMI, new City(CityName.MIAMI, DiseaseColor.YELLOW));
        citiesMap.put(CityName.BOGOTA, new City(CityName.BOGOTA, DiseaseColor.YELLOW));
        citiesMap.put(CityName.LIMA, new City(CityName.LIMA, DiseaseColor.YELLOW));
        citiesMap.put(CityName.SANTIAGO, new City(CityName.SANTIAGO, DiseaseColor.YELLOW));
        citiesMap.put(CityName.SAO_PAULO, new City(CityName.SAO_PAULO, DiseaseColor.YELLOW));
        citiesMap.put(CityName.BUENOS_AIRES, new City(CityName.BUENOS_AIRES, DiseaseColor.YELLOW));
        citiesMap.put(CityName.LAGOS, new City(CityName.LAGOS, DiseaseColor.YELLOW));
        citiesMap.put(CityName.KINSHASA, new City(CityName.KINSHASA, DiseaseColor.YELLOW));
        citiesMap.put(CityName.KHARTOUM, new City(CityName.KHARTOUM, DiseaseColor.YELLOW));
        citiesMap.put(CityName.JOHANNESBURG, new City(CityName.JOHANNESBURG, DiseaseColor.YELLOW));
        citiesMap.put(CityName.ALGEIERS, new City(CityName.ALGEIERS, DiseaseColor.BLACK));
        citiesMap.put(CityName.CAIRO, new City(CityName.CAIRO, DiseaseColor.BLACK));
        citiesMap.put(CityName.ISTANBUL, new City(CityName.ISTANBUL, DiseaseColor.BLACK));
        citiesMap.put(CityName.MOSCOW, new City(CityName.MOSCOW, DiseaseColor.BLACK));
        citiesMap.put(CityName.BAGHDAD, new City(CityName.BAGHDAD, DiseaseColor.BLACK));
        citiesMap.put(CityName.TEHRAN, new City(CityName.TEHRAN, DiseaseColor.BLACK));
        citiesMap.put(CityName.RIYADH, new City(CityName.RIYADH, DiseaseColor.BLACK));
        citiesMap.put(CityName.KARACHI, new City(CityName.KARACHI, DiseaseColor.BLACK));
        citiesMap.put(CityName.MUMBAI,new City(CityName.MUMBAI, DiseaseColor.BLACK));
        citiesMap.put(CityName.CHENNAI, new City(CityName.CHENNAI, DiseaseColor.BLACK));
        citiesMap.put(CityName.DELHI, new City(CityName.DELHI, DiseaseColor.BLACK));
        citiesMap.put(CityName.KOLKATA, new City(CityName.KOLKATA, DiseaseColor.BLACK));
        citiesMap.put(CityName.BANGKOK, new City(CityName.BANGKOK, DiseaseColor.RED));
        citiesMap.put(CityName.JAKARTA, new City(CityName.JAKARTA, DiseaseColor.RED));
        citiesMap.put(CityName.SYDNEY, new City(CityName.SYDNEY, DiseaseColor.RED));
        citiesMap.put(CityName.HO_CHI_MINH_CITY, new City(CityName.HO_CHI_MINH_CITY, DiseaseColor.RED));
        citiesMap.put(CityName.MANILA, new City(CityName.MANILA, DiseaseColor.RED));
        citiesMap.put(CityName.HONG_KONG, new City(CityName.HONG_KONG, DiseaseColor.RED));
        citiesMap.put(CityName.TAIPEI, new City(CityName.TAIPEI, DiseaseColor.RED));
        citiesMap.put(CityName.OSAKA, new City(CityName.OSAKA, DiseaseColor.RED));
        citiesMap.put(CityName.TOKYO, new City(CityName.TOKYO, DiseaseColor.RED));
        citiesMap.put(CityName.SEOUL, new City(CityName.SEOUL, DiseaseColor.RED));
        citiesMap.put(CityName.BEIJING, new City(CityName.BEIJING, DiseaseColor.RED));
        citiesMap.put(CityName.SHANGHAI, new City(CityName.SHANGHAI, DiseaseColor.RED));
        return citiesMap;
    }
}
