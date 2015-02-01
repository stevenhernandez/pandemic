package games.pandemic;

/**
 * Created by Steven on 1/31/2015.
 */
public class City {

    CityName name;
    DiseaseColor color;

    public City(CityName name, DiseaseColor color){
        this.name = name;
        this.color = color;
    }

    public DiseaseColor getColor() {
        return color;
    }

    public void setColor(DiseaseColor color) {
        this.color = color;
    }

    public CityName getName() {

        return name;
    }

    public void setName(CityName name) {
        this.name = name;
    }
}
