/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package softheon.enterprise.api.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model for the GET Group input parameters.
 */
public class GetGroupRequestModel {
    /**
     * Gets or sets the group identifier.
     */
    @JsonProperty(value = "ID")
    private Integer id;

    /**
     * Gets or sets the user identifier.
     */
    @JsonProperty(value = "UserID")
    private Integer userID;

    /**
     * Gets or sets the name.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Gets or sets the type. Possible values include: 'Generic', 'Access',
     * 'Role'.
     */
    @JsonProperty(value = "Type")
    private String type;

    /**
     * Gets or sets the state. Possible values include: 'Inactive', 'Active'.
     */
    @JsonProperty(value = "State")
    private String state;

    /**
     * Gets or sets the page number.
     */
    @JsonProperty(value = "Page")
    private Integer page;

    /**
     * Gets or sets the size of the page.
     */
    @JsonProperty(value = "PageSize")
    private Integer pageSize;

    /**
     * Gets or sets the order. Possible values include: 'Unspecified',
     * 'Ascending', 'Descending'.
     */
    @JsonProperty(value = "SortOrder")
    private String sortOrder;

    /**
     * Gets or sets the column to order by. Possible values include: 'ID',
     * 'Name', 'Type', 'State'.
     */
    @JsonProperty(value = "SortBy")
    private String sortBy;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the GetGroupRequestModel object itself.
     */
    public GetGroupRequestModel withId(Integer id) {
        this.id = id;
        return this;
    }

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
     * @return the GetGroupRequestModel object itself.
     */
    public GetGroupRequestModel withUserID(Integer userID) {
        this.userID = userID;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the GetGroupRequestModel object itself.
     */
    public GetGroupRequestModel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the GetGroupRequestModel object itself.
     */
    public GetGroupRequestModel withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the GetGroupRequestModel object itself.
     */
    public GetGroupRequestModel withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the page value.
     *
     * @return the page value
     */
    public Integer page() {
        return this.page;
    }

    /**
     * Set the page value.
     *
     * @param page the page value to set
     * @return the GetGroupRequestModel object itself.
     */
    public GetGroupRequestModel withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Get the pageSize value.
     *
     * @return the pageSize value
     */
    public Integer pageSize() {
        return this.pageSize;
    }

    /**
     * Set the pageSize value.
     *
     * @param pageSize the pageSize value to set
     * @return the GetGroupRequestModel object itself.
     */
    public GetGroupRequestModel withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get the sortOrder value.
     *
     * @return the sortOrder value
     */
    public String sortOrder() {
        return this.sortOrder;
    }

    /**
     * Set the sortOrder value.
     *
     * @param sortOrder the sortOrder value to set
     * @return the GetGroupRequestModel object itself.
     */
    public GetGroupRequestModel withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * Get the sortBy value.
     *
     * @return the sortBy value
     */
    public String sortBy() {
        return this.sortBy;
    }

    /**
     * Set the sortBy value.
     *
     * @param sortBy the sortBy value to set
     * @return the GetGroupRequestModel object itself.
     */
    public GetGroupRequestModel withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

}