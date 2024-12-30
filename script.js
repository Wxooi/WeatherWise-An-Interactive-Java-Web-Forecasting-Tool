async function getWeather() {
    const cityInput = document.getElementById('cityInput');
    const cityName = document.getElementById('cityName');
    const temperature = document.getElementById('temperature');
    const description = document.getElementById('description');
    const humidity = document.getElementById('humidity');
    const windSpeed = document.getElementById('windSpeed');

    const city = cityInput.value;

    try {
        const response = await fetch(`http://localhost:8080/api/weather/${city}`);
        const data = await response.json();

        cityName.textContent = `Weather in ${data.city}`;
        temperature.textContent = `Temperature: ${data.temperature}°C`;
        description.textContent = `Description: ${data.description}`;
        humidity.textContent = `Humidity: ${data.humidity}%`;
        windSpeed.textContent = `Wind Speed: ${data.windSpeed} km/h`;
    } catch (error) {
        console.error('Error fetching weather data:', error);
        cityName.textContent = 'Unable to fetch weather data';
    }
}
