package servlet;

import domain.OMW;
import domain.OMWClient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/currentWeather")
public class OMWServlet extends HttpServlet {

    static void printCityWeather(HttpServletResponse r, OMW omw) throws ServletException, IOException {
        PrintWriter writer = r.getWriter();
        writer.println("You are checking weather for the city: " + omw.getName());
        writer.println("Temperature: " + omw.getMain().getTemp() + " Celsius");
        writer.println("Pressure: " + omw.getMain().getPressure() + " hPa");
        writer.println("Clouds level: " + omw.getClouds().getDescription());
        writer.println("Wind speed: " + omw.getWind().getSpeed() + " meter/sec");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cityId = Integer.parseInt(request.getParameter("cityName"));
        OMWClient client = new OMWClient();
        OMW weather = client.getCityId(cityId);
        printCityWeather(response, weather);
    }
}
