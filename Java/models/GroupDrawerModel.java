/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package softheon.enterprise.api.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The model that is sent in response to a GET request for GroupsDrawer
 * associations.
 */
public class GroupDrawerModel {
    /**
     * Gets or sets the group identifier.
     */
    @JsonProperty(value = "GroupID")
    private Integer groupID;

    /**
     * Gets or sets the name of the group.
     */
    @JsonProperty(value = "GroupName")
    private String groupName;

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
     * Get the groupID value.
     *
     * @return the groupID value
     */
    public Integer groupID() {
        return this.groupID;
    }

    /**
     * Set the groupID value.
     *
     * @param groupID the groupID value to set
     * @return the GroupDrawerModel object itself.
     */
    public GroupDrawerModel withGroupID(Integer groupID) {
        this.groupID = groupID;
        return this;
    }

    /**
     * Get the groupName value.
     *
     * @return the groupName value
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Set the groupName value.
     *
     * @param groupName the groupName value to set
     * @return the GroupDrawerModel object itself.
     */
    public GroupDrawerModel withGroupName(String groupName) {
        this.groupName = groupName;
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
     * @return the GroupDrawerModel object itself.
     */
    public GroupDrawerModel withDrawerID(Integer drawerID) {
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
     * @return the GroupDrawerModel object itself.
     */
    public GroupDrawerModel withDrawerName(String drawerName) {
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
     * @return the GroupDrawerModel object itself.
     */
    public GroupDrawerModel withAcl(Integer acl) {
        this.acl = acl;
        return this;
    }

}