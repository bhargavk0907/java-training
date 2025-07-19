package org.example.oops;

public class Methods {

    public String cityName;

    public String countryName;


    public Methods(String cityName) {
        // Default constructor
        this.cityName = cityName;
    }
    public Methods(String cityName, String countryName) {
        // Default constructor
        this.cityName = cityName;
        this.countryName = countryName;
    }

    public Methods() {


    }

    String envVariable = null;


    public String getString(String name){



        String code = getCityName(1);
        String newCity = null;
        if(name != null){

            cityName = getCityName(2);
        }
        cityName = getCityName(3);
        return name;

    }

    String getCityName(int cityCode){

        if(cityCode == 1){
            return "Delhi";
        }else if(cityCode == 2){
            return "Mumbai";
        }else if(cityCode == 3){
            return "Chennai";
        }else{
            return cityName;
        }


    }

    protected String getCountryName(String countryCode) {

        if(countryCode.equals("IN")){
            return "India";
        }else if(countryCode.equals("US")){
            return "United States";
        }else if(countryCode.equals("UK")){
            return "United Kingdom";
        }else{
            return "Unknown Country";
        }

    }






}
