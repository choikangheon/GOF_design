package factory_method;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Ship {
    private String name;
    private String email;
    private String logo;
    private String color;


    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
