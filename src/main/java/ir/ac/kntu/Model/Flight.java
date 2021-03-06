package ir.ac.kntu.Model;

import java.util.Date;

public class Flight {
    private Integer id;
    private String departure_city;
    private String departure_airport;
    private String destination_city;
    private String destination_airport;
    private Date travel_date;
    private String company;
    private Integer capacity;

    public Flight(Integer id, String departure_city, String departure_airport, String destination_city,
                  String destination_airport, Date travel_date, Integer capacity) {
        this.id = id;
        this.departure_city = departure_city;
        this.departure_airport = departure_airport;
        this.destination_city = destination_city;
        this.destination_airport = destination_airport;
        this.travel_date = travel_date;
        this.capacity = capacity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeparture_city() {
        return departure_city;
    }

    public void setDeparture_city(String departure_city) {
        this.departure_city = departure_city;
    }

    public String getDeparture_airport() {
        return departure_airport;
    }

    public void setDeparture_airport(String departure_airport) {
        this.departure_airport = departure_airport;
    }

    public String getDestination_city() {
        return destination_city;
    }

    public void setDestination_city(String destination_city) {
        this.destination_city = destination_city;
    }

    public String getDestination_airport() {
        return destination_airport;
    }

    public void setDestination_airport(String destination_airport) {
        this.destination_airport = destination_airport;
    }

    public Date getTravel_date() {
        return travel_date;
    }

    public void setTravel_date(Date travel_date) {
        this.travel_date = travel_date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departure_city='" + departure_city + '\'' +
                ", departure_airport='" + departure_airport + '\'' +
                ", destination_city='" + destination_city + '\'' +
                ", destination_airport='" + destination_airport + '\'' +
                ", travel_date=" + travel_date +
                ", company='" + company + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
