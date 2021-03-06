/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package softheon.enterprise.api.client.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model for the GET Attachment Version input parameters.
 */
public class GetAttachmentVersionRequestModel {
    /**
     * Gets or sets the indexed version value.
     */
    @JsonProperty(value = "Version")
    private Integer version;

    /**
     * Gets or sets the creator identifier.
     */
    @JsonProperty(value = "CreatorUserID")
    private Integer creatorUserID;

    /**
     * Gets or sets the identifier of the user who accessed the attachment
     * version.
     */
    @JsonProperty(value = "AccessorUserID")
    private Integer accessorUserID;

    /**
     * Gets or sets the min time the version was last accessed.
     */
    @JsonProperty(value = "MinAccessTime")
    private DateTime minAccessTime;

    /**
     * Gets or sets the max time the version was last accessed.
     */
    @JsonProperty(value = "MaxAccessTime")
    private DateTime maxAccessTime;

    /**
     * Gets or sets the min creation time of the attachment version.
     */
    @JsonProperty(value = "MinCreationTime")
    private DateTime minCreationTime;

    /**
     * Gets or sets the max creation time of the attachment version.
     */
    @JsonProperty(value = "MaxCreationTime")
    private DateTime maxCreationTime;

    /**
     * Gets or sets the min modification time of the attachment version.
     */
    @JsonProperty(value = "MinModificationTime")
    private DateTime minModificationTime;

    /**
     * Gets or sets the max modification time of the attachment version.
     */
    @JsonProperty(value = "MaxModificationTime")
    private DateTime maxModificationTime;

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
     * Gets or sets the column to order by. Possible values include: 'Version',
     * 'CreatorUserID', 'AccessorUserID', 'AccessTime', 'CreationTime',
     * 'ModificationTime'.
     */
    @JsonProperty(value = "SortBy")
    private String sortBy;

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * Get the creatorUserID value.
     *
     * @return the creatorUserID value
     */
    public Integer creatorUserID() {
        return this.creatorUserID;
    }

    /**
     * Set the creatorUserID value.
     *
     * @param creatorUserID the creatorUserID value to set
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withCreatorUserID(Integer creatorUserID) {
        this.creatorUserID = creatorUserID;
        return this;
    }

    /**
     * Get the accessorUserID value.
     *
     * @return the accessorUserID value
     */
    public Integer accessorUserID() {
        return this.accessorUserID;
    }

    /**
     * Set the accessorUserID value.
     *
     * @param accessorUserID the accessorUserID value to set
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withAccessorUserID(Integer accessorUserID) {
        this.accessorUserID = accessorUserID;
        return this;
    }

    /**
     * Get the minAccessTime value.
     *
     * @return the minAccessTime value
     */
    public DateTime minAccessTime() {
        return this.minAccessTime;
    }

    /**
     * Set the minAccessTime value.
     *
     * @param minAccessTime the minAccessTime value to set
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withMinAccessTime(DateTime minAccessTime) {
        this.minAccessTime = minAccessTime;
        return this;
    }

    /**
     * Get the maxAccessTime value.
     *
     * @return the maxAccessTime value
     */
    public DateTime maxAccessTime() {
        return this.maxAccessTime;
    }

    /**
     * Set the maxAccessTime value.
     *
     * @param maxAccessTime the maxAccessTime value to set
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withMaxAccessTime(DateTime maxAccessTime) {
        this.maxAccessTime = maxAccessTime;
        return this;
    }

    /**
     * Get the minCreationTime value.
     *
     * @return the minCreationTime value
     */
    public DateTime minCreationTime() {
        return this.minCreationTime;
    }

    /**
     * Set the minCreationTime value.
     *
     * @param minCreationTime the minCreationTime value to set
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withMinCreationTime(DateTime minCreationTime) {
        this.minCreationTime = minCreationTime;
        return this;
    }

    /**
     * Get the maxCreationTime value.
     *
     * @return the maxCreationTime value
     */
    public DateTime maxCreationTime() {
        return this.maxCreationTime;
    }

    /**
     * Set the maxCreationTime value.
     *
     * @param maxCreationTime the maxCreationTime value to set
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withMaxCreationTime(DateTime maxCreationTime) {
        this.maxCreationTime = maxCreationTime;
        return this;
    }

    /**
     * Get the minModificationTime value.
     *
     * @return the minModificationTime value
     */
    public DateTime minModificationTime() {
        return this.minModificationTime;
    }

    /**
     * Set the minModificationTime value.
     *
     * @param minModificationTime the minModificationTime value to set
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withMinModificationTime(DateTime minModificationTime) {
        this.minModificationTime = minModificationTime;
        return this;
    }

    /**
     * Get the maxModificationTime value.
     *
     * @return the maxModificationTime value
     */
    public DateTime maxModificationTime() {
        return this.maxModificationTime;
    }

    /**
     * Set the maxModificationTime value.
     *
     * @param maxModificationTime the maxModificationTime value to set
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withMaxModificationTime(DateTime maxModificationTime) {
        this.maxModificationTime = maxModificationTime;
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
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withPage(Integer page) {
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
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withPageSize(Integer pageSize) {
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
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withSortOrder(String sortOrder) {
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
     * @return the GetAttachmentVersionRequestModel object itself.
     */
    public GetAttachmentVersionRequestModel withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

}
