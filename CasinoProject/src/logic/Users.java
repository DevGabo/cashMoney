/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Usuario
 */
public class Users {

    private long userCC;
    /**
     * Username attribute
     */
    private int userType;
    /**
     * Type of user
     */
    private String password;
    /**
     * User password
     */
    private String photo;

    /**
     * User of photo
     */

    /**
     * Default Constructor
     */
    public Users() {
        this.userCC = 0;
        this.userType = 0;
        this.password = "";
        this.photo = "";
    }

    /**
     *
     * @param userCC User name
     * @param userType User Type
     * @param password User password
     * @param photo user photo
     */
    public Users(long userCC, int userType, String password, String photo) {
        this.userCC = userCC;
        this.userType = userType;
        this.password = password;
        this.photo = photo;
    }

    /**
     * Get User CC
     * @return UserCC
     */
    public long getUserCC() {
        return userCC;
    }

    /**
     * Chane UserCC
     * @param userCC 
     */
    public void setUserCC(long userCC) {
        this.userCC = userCC;
    }

    /**
     * get user type
     *
     * @return user type
     */
    public int getUserType() {
        return userType;
    }

    /**
     * set user type
     *
     * @param userType user type
     */
    public void setUserType(int userType) {
        this.userType = userType;
    }

    /**
     * get user password
     *
     * @return user password
     */
    public String getPassword() {
        return password;
    }

    /**
     * set user password
     *
     * @param password user password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get user photo
     *
     * @return user photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * set user photo
     *
     * @param photo user photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
