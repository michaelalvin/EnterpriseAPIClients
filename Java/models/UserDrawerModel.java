/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package softheon.enterprise.api.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The model that is sent in response to a GET request for UserDrawer
 * associations.
 */
public class UserDrawerModel {
    /**
     * Gets or sets the user identifier.
     */
    @JsonProperty(value = "UserID")
    private Integer userID;

    /**
     * Gets or sets the full name of the user.
     */
    @JsonProperty(value = "UserFullName")
    private String userFullName;

    /**
     * Gets or sets the drawer identifier.
     */
    @JsonProperty(value = "DrawerID")
    private Integer drawerID;

    /**
     * Gets or sets the name of the drawer.
     */
    @JsonProperty(value = "DrawerName")
    private String drawerName;

    /**
     * Gets or sets the access control level permissions.
     */
    @JsonProperty(value = "Acl")
    private Integer acl;

    /**
     * Get the userID value.
     *
     * @return the userID value
     */
    public Integer userID() {
        return this.userID;
    }

    /**
     * Set the userID value.
     *
     * @param userID the userID value to set
     * @return the UserDrawerModel object itself.
     */
    public UserDrawerModel withUserID(Integer userID) {
        this.userID = userID;
        return this;
    }

    /**
     * Get the userFullName value.
     *
     * @return the userFullName value
     */
    public String userFullName() {
        return this.userFullName;
    }

    /**
     * Set the userFullName value.
     *
     * @param userFullName the userFullName value to set
     * @return the UserDrawerModel object itself.
     */
    public UserDrawerModel withUserFullName(String userFullName) {
        this.userFullName = userFullName;
        return this;
    }

    /**
     * Get the drawerID value.
     *
     * @return the drawerID value
     */
    public Integer drawerID() {
        return this.drawerID;
    }

    /**
     * Set the drawerID value.
     *
     * @param drawerID the drawerID value to set
     * @return the UserDrawerModel object itself.
     */
    public UserDrawerModel withDrawerID(Integer drawerID) {
        this.drawerID = drawerID;
        return this;
    }

    /**
     * Get the drawerName value.
     *
     * @return the drawerName value
     */
    public String drawerName() {
        return this.drawerName;
    }

    /**
     * Set the drawerName value.
     *
     * @param drawerName the drawerName value to set
     * @return the UserDrawerModel object itself.
     */
    public UserDrawerModel withDrawerName(String drawerName) {
        this.drawerName = drawerName;
        return this;
    }

    /**
     * Get the acl value.
     *
     * @return the acl value
     */
    public Integer acl() {
        return this.acl;
    }

    /**
     * Set the acl value.
     *
     * @param acl the acl value to set
     * @return the UserDrawerModel object itself.
     */
    public UserDrawerModel withAcl(Integer acl) {
        this.acl = acl;
        return this;
    }

}
