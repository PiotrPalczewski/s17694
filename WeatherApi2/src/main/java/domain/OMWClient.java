package domain;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class OMWClient {
    public static final String URL = "https://api.openweathermap.org/data/2.5/weather";
    public static final String Key = "c9ec85467558da085aae9d5411340553";
    public static final String units = "metric";

    public OMW getCityId(int cityId){
        Response response = ClientBuilder
                .newClient()
                .target(URL + "?id=" + cityId + "&units=" + units + "&APPID=" + Key)
                .request(MediaType.APPLICATION_JSON)
                .get();

        if(response.getStatus() == 200){
            return response.readEntity(OMW.class);
        }
        return null;
    }
}
