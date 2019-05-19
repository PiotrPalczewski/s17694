<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
    <title>CurrentWeather</title>
</head>
<body>
<h3>OpenWeatherMap api</h3>
<h2>Welcome to the OpenWeatherMap API that allows you to check the weather in biggest Polish cities!</h2>
<form action="currentWeather" method="post">
    <table>
        <tr>
            <td>Pick the city you want to check weather to:</td>
            <td><select name="cityName">
                <option value=6695624>Warszawa</option>
                <option value=3099434>Gdansk</option>
                <option value=3094802>Krakow</option>
                <option value=3081368>Wroclaw</option>
                <option value=3088171>Poznan</option>
                <option value=3093133>Lodz</option>
                <option value=3096472>Katowice</option>
            </select>
            </td>
        </tr>
    </table>
    <br><input type="submit" value="Pick the city" name="submit">
</form>
</body>
</html>