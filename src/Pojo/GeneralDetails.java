/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author Neel_Esh
 */
public class GeneralDetails {

    public GeneralDetails() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        GeneralDetails.name = name;
    }

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        GeneralDetails.userId = userId;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        GeneralDetails.id = id;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        GeneralDetails.type = type;
    }
    public static String name;
    public static String userId;
    public static String id;
    public static String type;
}
