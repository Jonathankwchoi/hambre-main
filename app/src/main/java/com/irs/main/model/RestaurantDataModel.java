package com.irs.main.model;

import android.location.Location;

import com.irs.yelp.BusinessDto;
import com.irs.yelp.BusinessResponseDto;
import com.irs.yelp.SortType;
import com.irs.yelp.YelpApi;

import java.util.HashMap;

/**
 * DataController class which accesses the Yelp API to get Restaurant Data in the form of the
 * Restaurant POJO
 */
public class RestaurantDataModel {
    private YelpApi api = YelpApi.getInstance();
    private static double latitude;
    private static double longitude;


    /**
     * Method to retrieve a list of restaurants based on a search query
     *
     * @param count       number of restaurants to retrieve (max 50)
     * @param sortType    how to sort the response
     * @param openNow     retrieve only open restaurants
     * @return list of restaurants
     */
    public static BusinessDto[] getRestaurants(
            String location,
            String category,
            String query,
            SortType sortType,
            int radius,
            int count,
            boolean openNow) {

        BusinessDto[] restaurants = new BusinessDto[count];

        // Set the POST params based on method parameters
        HashMap<String, String> params = new HashMap<>();
        params.put("longitude", "" + longitude);
        params.put("latitude", "" + latitude);
        params.put("categories", ((category == null || category == "") ? "food" : category));
        params.put("term", query);
        params.put("sort_by", "" + sortType);
        params.put("radius", "" + radius);
        params.put("limit", "" + count);
        params.put("open_now", openNow ? "true" : "false");

        System.err.println("RUNNING RESTAURANT SEARCH");
        // get the response
        BusinessResponseDto response = YelpApi.getInstance().businessSearch(params);

        return response.businesses();
    }

    public static void setLatitude(double userLatitude){
        latitude = userLatitude;
    }

    public static void setLongitude(double userLongitude){
        longitude = userLongitude;
    }
}
